package io.dsub.discogs.common.release.entity;

import io.dsub.discogs.common.entity.BaseTimeEntity;
import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.Objects;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(
        name = "release_item_track",
        uniqueConstraints = {
                @UniqueConstraint(
                        name = "uq_release_item_track_position_title_duration_release_item_id",
                        columnNames = {"position", "title", "duration", "release_item_id"})
        })
public class ReleaseItemTrack extends BaseTimeEntity {

    @Id
    @Column(name = "id", columnDefinition = "serial")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "position", length = 15000)
    private String position;

    @Column(name = "title", length = 15000)
    private String title;

    @Column(name = "duration", length = 5000)
    private String duration;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "release_item_id", referencedColumnName = "id", nullable = false, foreignKey = @ForeignKey(name = "fk_release_item_track_release_item_id_release_item"))
    @ToString.Exclude
    private ReleaseItem releaseItem;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        ReleaseItemTrack that = (ReleaseItemTrack) o;

        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return 39902719;
    }
}
