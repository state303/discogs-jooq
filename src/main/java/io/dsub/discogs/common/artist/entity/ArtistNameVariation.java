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
        name = "artist_name_variation",
        uniqueConstraints =
        @UniqueConstraint(
                name = "uq_artist_name_variation_artist_id_name",
                columnNames = {"artist_id", "name_variation"}))
public class ArtistNameVariation extends BaseTimeEntity {

    private static final Long SerialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", columnDefinition = "serial", updatable = false, nullable = false)
    private Long id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "artist_id", referencedColumnName = "id", nullable = false)
    private Artist artist;

    @Column(length = 2000, name = "name_variation", nullable = false)
    private String name;
}
