package io.dsub.discogs.common.release.entity;

import io.dsub.discogs.common.entity.BaseTimeEntity;
import io.dsub.discogs.common.style.entity.Style;
import lombok.*;

import javax.persistence.*;

@Data
@Entity
@Builder
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
@Table(
        name = "release_item_style",
        uniqueConstraints =
        @UniqueConstraint(
                name = "uq_release_item_style_release_item_id_style",
                columnNames = {"release_item_id", "style"}))
public class ReleaseItemStyle extends BaseTimeEntity {

    private static final Long SerialVersionUID = 1L;

    @Id
    @Column(name = "id", columnDefinition = "serial")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @JoinColumn(name = "release_item_id", referencedColumnName = "id", nullable = false)
    @ManyToOne
    private ReleaseItem releaseItem;

    @JoinColumn(name = "style", referencedColumnName = "name", nullable = false)
    @ManyToOne
    private Style style;
}
