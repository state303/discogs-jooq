package io.dsub.discogs.common.artist.entity;

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
        name = "artist_name_variation",
        uniqueConstraints =
        @UniqueConstraint(
                name = "uq_artist_name_variation_artist_id_hash",
                columnNames = {"artist_id", "hash"}))
public class ArtistNameVariation extends HashEntity {

    private static final Long SerialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", columnDefinition = "serial", updatable = false, nullable = false)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "artist_id", referencedColumnName = "id", nullable = false, foreignKey = @ForeignKey(name = "fk_artist_name_variation_artist_id_artist"))
    @ToString.Exclude
    private Artist artist;

    @Column(length = 2000, name = "name_variation", nullable = false)
    private String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        ArtistNameVariation that = (ArtistNameVariation) o;

        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return 847051869;
    }

    @Override
    protected String[] getHashCandidates() {
        return new String[]{name};
    }
}