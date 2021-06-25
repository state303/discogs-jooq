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
@AllArgsConstructor
@Table(
        name = "release_item_credited_artist",
        uniqueConstraints = {
                @UniqueConstraint(
                        name = "uq_release_item_credited_artist_release_item_id_artist_id_role",
                        columnNames = {"release_item_id", "artist_id", "role"})
        })
public class ReleaseItemCreditedArtist extends BaseTimeEntity {

    private static final Long SerialVersionUID = 1L;

    @Id
    @Column(name = "id", columnDefinition = "serial")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @JoinColumn(name = "release_item_id", referencedColumnName = "id", nullable = false, foreignKey = @ForeignKey(name = "fk_release_item_credited_artist_release_item_id_release_item"))
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @ToString.Exclude
    private ReleaseItem releaseItem;

    @JoinColumn(name = "artist_id", referencedColumnName = "id", nullable = false, foreignKey = @ForeignKey(name = "fk_release_item_credited_artist_artist_id_artist"))
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @ToString.Exclude
    private Artist artist;

    @Column(name = "role", length = 20000)
    private String role;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        ReleaseItemCreditedArtist that = (ReleaseItemCreditedArtist) o;

        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return 750594906;
    }
}
