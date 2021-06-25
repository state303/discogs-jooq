package io.dsub.discogs.common.release.entity;

import io.dsub.discogs.common.entity.BaseTimeEntity;
import io.dsub.discogs.common.label.entity.Label;
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

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "release_item_id", referencedColumnName = "id", nullable = false, foreignKey = @ForeignKey(name = "fk_release_item_work_release_item_id_release_item"))
    private ReleaseItem releaseItem;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "label_id", referencedColumnName = "id", nullable = false, foreignKey = @ForeignKey(name = "fk_release_item_work_label_id_label"))
    private Label label;

    @Column(name = "work", length = 5000)
    private String work;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        ReleaseItemWork that = (ReleaseItemWork) o;

        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return 1329613920;
    }
}
