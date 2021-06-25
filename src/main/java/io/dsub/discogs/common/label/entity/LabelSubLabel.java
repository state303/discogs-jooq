package io.dsub.discogs.common.label.entity;

import io.dsub.discogs.common.entity.BaseTimeEntity;
import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.Objects;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
@Builder
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
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "parent_label_id", referencedColumnName = "id", nullable = false, foreignKey = @ForeignKey(name = "fk_label_sub_label_parent_label_id_label"))
    @ToString.Exclude
    private Label parent;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "sub_label_id", referencedColumnName = "id", nullable = false, foreignKey = @ForeignKey(name = "fk_label_sub_label_sub_label_id_label"))
    @ToString.Exclude
    private Label subLabel;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        LabelSubLabel that = (LabelSubLabel) o;

        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return 1911859488;
    }
}
