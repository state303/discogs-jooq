package io.dsub.discogs.common.release.entity;

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
        name = "release_item_credited_artist",
        uniqueConstraints = {
                @UniqueConstraint(
                        name = "uq_release_item_credited_artist_release_item_id_artist_id_role",
                        columnNames = {"release_item_id", "artist_id", "role"})
        })
public class ReleaseItemCreditedArtist extends BaseTimeEntity {

    private static final Long SerialVersionUID = 1L;

    @Id
    @Column(name = "id", columnDefinition = "serial")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @JoinColumn(name = "release_item_id", referencedColumnName = "id", nullable = false)
    @ManyToOne
    private ReleaseItem releaseItem;

    @JoinColumn(name = "artist_id", referencedColumnName = "id", nullable = false)
    @ManyToOne
    private Artist artist;

    @Column(name = "role", length = 20000)
    private String role;
}
