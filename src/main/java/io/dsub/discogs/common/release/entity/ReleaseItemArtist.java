package io.dsub.discogs.common.release.entity;

import io.dsub.discogs.common.artist.entity.Artist;
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
        name = "release_item_artist",
        uniqueConstraints =
        @UniqueConstraint(
                name = "uq_release_item_artist_release_item_id_artist_id",
                columnNames = {"release_item_id", "artist_id"}))
public class ReleaseItemArtist extends BaseTimeEntity {

    private static final Long SerialVersionUID = 1L;

    @Id
    @Column(name = "id", columnDefinition = "serial")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "release_item_id", referencedColumnName = "id", nullable = false, foreignKey = @ForeignKey(name = "fk_release_item_artist_release_item_id_release_item"))
    private ReleaseItem releaseItem;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "artist_id", referencedColumnName = "id", nullable = false, foreignKey = @ForeignKey(name = "fk_release_item_artist_artist_id_artist"))
    private Artist artist;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        ReleaseItemArtist that = (ReleaseItemArtist) o;

        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return 42389727;
    }
}
