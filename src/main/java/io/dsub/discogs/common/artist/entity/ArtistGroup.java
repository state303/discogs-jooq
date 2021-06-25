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
        name = "artist_group",
        uniqueConstraints =
        @UniqueConstraint(
                name = "uq_artist_group_artist_id_group_id",
                columnNames = {"artist_id", "group_id"}))
public class ArtistGroup extends BaseTimeEntity {

    private static final Long SerialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", columnDefinition = "serial", updatable = false, nullable = false)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "artist_id", referencedColumnName = "id", nullable = false, foreignKey = @ForeignKey(name = "fk_artist_group_artist_id_artist"))
    @ToString.Exclude
    private Artist artist;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "group_id", referencedColumnName = "id", nullable = false, foreignKey = @ForeignKey(name = "fk_artist_group_group_id_artist"))
    @ToString.Exclude
    private Artist group;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        ArtistGroup that = (ArtistGroup) o;

        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return 52383765;
    }
}
