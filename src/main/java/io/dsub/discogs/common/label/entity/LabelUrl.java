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
        name = "label_url",
        uniqueConstraints =
        @UniqueConstraint(
                name = "uq_label_url_label_id_url",
                columnNames = {"label_id", "url"}))
public class LabelUrl extends BaseTimeEntity {

    private static final Long SerialVersionUID = 1L;

    @Id
    @Column(name = "id", columnDefinition = "serial")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "label_id", referencedColumnName = "id", nullable = false, foreignKey = @ForeignKey(name = "fk_label_url_label_id_label"))
    private Label label;

    @Column(length = 5000, name = "url", nullable = false)
    private String url;
}
