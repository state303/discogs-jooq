package io.dsub.discogs.common.artist.entity;

import io.dsub.discogs.common.entity.BaseTimeEntity;
import lombok.*;

import javax.persistence.*;

@Data
@Entity
@Builder
@EqualsAndHashCode(callSuper = false)
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

    @ManyToOne
    @JoinColumn(name = "artist_id", referencedColumnName = "id", nullable = false, foreignKey = @ForeignKey(name = "fk_artist_group_artist_id_artist"))
    private Artist artist;

    @ManyToOne
    @JoinColumn(name = "group_id", referencedColumnName = "id", nullable = false, foreignKey = @ForeignKey(name = "fk_artist_group_group_id_artist"))
    private Artist group;
}
