package io.dsub.discogs.common.label.entity;

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
        name = "label_sub_label",
        uniqueConstraints =
        @UniqueConstraint(
                name = "uq_label_sub_label_parent_label_id_sub_label_id",
                columnNames = {"parent_label_id", "sub_label_id"}))
public class LabelSubLabel extends BaseTimeEntity {

    private static final Long SerialVersionUID = 1L;

    @Id
    @Column(name = "id", columnDefinition = "serial")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    /*
     * Convenient READ_ONLY access for actually mapped class.
     * NOTE: mark any FetchType to avoid warning about immutability.
     */
    @ManyToOne
    @JoinColumn(name = "parent_label_id", referencedColumnName = "id", nullable = false)
    private Label parent;

    @ManyToOne
    @JoinColumn(name = "sub_label_id", referencedColumnName = "id", nullable = false)
    private Label subLabel;
}
