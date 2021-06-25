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
        name = "release_item_video",
        uniqueConstraints =
        @UniqueConstraint(
                name = "uq_release_item_video_release_item_id_url",
                columnNames = {"release_item_id", "url"}))
public class ReleaseItemVideo extends BaseTimeEntity {

    private static final Long SerialVersionUID = 1L;

    @Id
    @Column(name = "id", columnDefinition = "serial")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "title", length = 10000)
    private String title;

    @Column(name = "description", length = 10000)
    private String description;

    @Column(name = "url", length = 10000)
    private String url;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "release_item_id", referencedColumnName = "id", nullable = false, foreignKey = @ForeignKey(name = "fk_release_item_video_release_item_id_release_item"))
    @ToString.Exclude
    private ReleaseItem releaseItem;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        ReleaseItemVideo that = (ReleaseItemVideo) o;

        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return 1607902271;
    }
}
