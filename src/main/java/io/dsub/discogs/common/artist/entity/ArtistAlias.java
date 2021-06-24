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
        name = "artist_alias",
        uniqueConstraints =
        @UniqueConstraint(
                name = "uq_artist_alias_artist_id_alias_id",
                columnNames = {"artist_id", "alias_id"}))
public class ArtistAlias extends BaseTimeEntity {

    private static final Long SerialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", columnDefinition = "serial", updatable = false, nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "artist_id", referencedColumnName = "id", nullable = false, foreignKey = @ForeignKey(name = "fk_artist_alias_artist_id_artist"))
    private Artist artist;

    @ManyToOne
    @JoinColumn(name = "alias_id", referencedColumnName = "id", nullable = false, foreignKey = @ForeignKey(name = "fk_artist_alias_alias_id_artist"))
    private Artist alias;
}
