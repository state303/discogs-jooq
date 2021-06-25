package io.dsub.discogs.common.artist.entity;

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
        name = "artist_url",
        uniqueConstraints =
        @UniqueConstraint(
                name = "uq_artist_url_artist_id_url",
                columnNames = {"artist_id", "url"}))
public class ArtistUrl extends BaseTimeEntity {

    private static final Long SerialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", columnDefinition = "serial")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "artist_id", referencedColumnName = "id", nullable = false, foreignKey = @ForeignKey(name = "fk_artist_url_artist_id_artist"))
    private Artist artist;

    @Column(length = 5000, name = "url", nullable = false)
    private String url;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        ArtistUrl artistUrl = (ArtistUrl) o;

        return Objects.equals(id, artistUrl.id);
    }

    @Override
    public int hashCode() {
        return 924807296;
    }
}
