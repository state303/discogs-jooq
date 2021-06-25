package io.dsub.discogs.common.master.entity;

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
        name = "master_artist",
        uniqueConstraints =
        @UniqueConstraint(
                name = "uq_master_artist_master_id_artist_id",
                columnNames = {"master_id", "artist_id"}))
public class MasterArtist extends BaseTimeEntity {

    private static final Long SerialVersionUID = 1L;

    @Id
    @Column(name = "id", columnDefinition = "serial")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @JoinColumn(name = "master_id", referencedColumnName = "id", nullable = false, foreignKey = @ForeignKey(name = "fk_master_artist_master_id_master"))
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Master master;

    @JoinColumn(name = "artist_id", referencedColumnName = "id", nullable = false, foreignKey = @ForeignKey(name = "fk_master_artist_artist_id_artist"))
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Artist artist;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        MasterArtist that = (MasterArtist) o;

        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return 705186645;
    }
}
