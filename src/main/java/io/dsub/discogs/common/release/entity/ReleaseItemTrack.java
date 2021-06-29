package io.dsub.discogs.common.release.entity;

import io.dsub.discogs.common.entity.BaseTimeEntity;
import io.dsub.discogs.common.entity.HashEntity;
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
@AllArgsConstructor
@Table(
        name = "release_item_track",
        uniqueConstraints = {
                @UniqueConstraint(
                        name = "uq_release_item_track_release_item_id_hash",
                        columnNames = {"release_item_id", "hash"})
        })
public class ReleaseItemTrack extends HashEntity {

    @Id
    @Column(name = "id", columnDefinition = "serial")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Lob
    @Column(name = "position")
    private String position;

    @Lob
    @Column(name = "title")
    private String title;

    @Lob
    @Column(name = "duration")
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

    @Override
    protected String[] getHashCandidates() {
        return new String[]{position, title, duration};
    }
}
