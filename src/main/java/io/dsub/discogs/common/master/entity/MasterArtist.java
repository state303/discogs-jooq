package io.dsub.discogs.common.master.entity;

import io.dsub.discogs.common.artist.entity.Artist;
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

    @JoinColumn(name = "master_id", referencedColumnName = "id", nullable = false)
    @ManyToOne
    private Master master;

    @JoinColumn(name = "artist_id", referencedColumnName = "id", nullable = false)
    @ManyToOne
    private Artist artist;
}
