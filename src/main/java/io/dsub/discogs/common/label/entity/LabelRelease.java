package io.dsub.discogs.common.label.entity;

import io.dsub.discogs.common.entity.BaseTimeEntity;
import io.dsub.discogs.common.release.entity.ReleaseItem;
import lombok.*;

import javax.persistence.*;

@Data
@Entity
@Builder
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
@Table(
        name = "label_item_release",
        uniqueConstraints =
        @UniqueConstraint(
                name = "uq_label_item_release_release_item_id_label_id",
                columnNames = {"release_item_id", "label_id"}))
public class LabelRelease extends BaseTimeEntity {

    private static final Long SerialVersionUID = 1L;

    @Id
    @Column(name = "id", columnDefinition = "serial")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "release_item_id", referencedColumnName = "id", nullable = false)
    private ReleaseItem releaseItem;

    @ManyToOne
    @JoinColumn(name = "label_id", referencedColumnName = "id", nullable = false)
    private Label label;

    @Column(name = "category_notation")
    private String categoryNotation;
}
