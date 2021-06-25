package io.dsub.discogs.common.master.entity;

import io.dsub.discogs.common.entity.BaseTimeEntity;
import io.dsub.discogs.common.genre.entity.Genre;
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
        name = "master_genre",
        uniqueConstraints =
        @UniqueConstraint(
                name = "uq_master_genre_master_id_genre",
                columnNames = {"master_id", "genre"}))
public class MasterGenre extends BaseTimeEntity {

    private static final Long SerialVersionUID = 1L;

    @Id
    @Column(name = "id", columnDefinition = "serial")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @JoinColumn(name = "master_id", referencedColumnName = "id", nullable = false, foreignKey = @ForeignKey(name = "fk_master_genre_master_id_master"))
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Master master;

    @JoinColumn(name = "genre", referencedColumnName = "name", nullable = false, foreignKey = @ForeignKey(name = "fk_master_genre_genre_genre"))
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Genre genre;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        MasterGenre that = (MasterGenre) o;

        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return 499073665;
    }
}
