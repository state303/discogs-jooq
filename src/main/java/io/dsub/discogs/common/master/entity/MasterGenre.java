package io.dsub.discogs.common.master.entity;

import io.dsub.discogs.common.entity.BaseTimeEntity;
import io.dsub.discogs.common.genre.entity.Genre;
import lombok.*;

import javax.persistence.*;

@Data
@Entity
@Builder
@EqualsAndHashCode(callSuper = false)
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
    @ManyToOne
    private Master master;

    @JoinColumn(name = "genre", referencedColumnName = "name", nullable = false, foreignKey = @ForeignKey(name = "fk_master_genre_genre_genre"))
    @ManyToOne
    private Genre genre;
}
