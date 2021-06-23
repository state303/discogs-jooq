package io.dsub.discogs.common.release.entity;

import io.dsub.discogs.common.entity.BaseTimeEntity;
import io.dsub.discogs.common.label.entity.Label;
import lombok.*;

import javax.persistence.*;

@Data
@Entity
@Builder
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
@Table(
        name = "release_item_work",
        uniqueConstraints = {
                @UniqueConstraint(
                        name = "uq_release_item_work_release_item_id_label_id_work",
                        columnNames = {"release_item_id", "label_id", "work"})
        })
public class ReleaseItemWork extends BaseTimeEntity {

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

    @Column(name = "work", length = 5000)
    private String work;
}
