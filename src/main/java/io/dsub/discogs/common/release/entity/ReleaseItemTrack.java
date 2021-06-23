package io.dsub.discogs.common.release.entity;

import io.dsub.discogs.common.entity.BaseTimeEntity;
import lombok.*;

import javax.persistence.*;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@Table(
        name = "release_item_track",
        uniqueConstraints = {
                @UniqueConstraint(
                        name = "uq_release_item_track_position_title_duration_release_item_id",
                        columnNames = {"position", "title", "duration", "release_item_id"})
        })
public class ReleaseItemTrack extends BaseTimeEntity {

    @Id
    @Column(name = "id", columnDefinition = "serial")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "position", length = 15000)
    private String position;

    @Column(name = "title", length = 15000)
    private String title;

    @Column(name = "duration", length = 5000)
    private String duration;

    @ManyToOne
    @JoinColumn(name = "release_item_id", referencedColumnName = "id", nullable = false)
    private ReleaseItem releaseItem;
}
