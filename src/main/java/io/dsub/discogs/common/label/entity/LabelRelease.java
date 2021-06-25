package io.dsub.discogs.common.label.entity;

import io.dsub.discogs.common.entity.BaseTimeEntity;
import io.dsub.discogs.common.release.entity.ReleaseItem;
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

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "release_item_id", referencedColumnName = "id", nullable = false, foreignKey = @ForeignKey(name = "fk_label_release_release_item_id_release_item"))
    @ToString.Exclude
    private ReleaseItem releaseItem;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "label_id", referencedColumnName = "id", nullable = false, foreignKey = @ForeignKey(name = "fk_label_release_label_id_label"))
    @ToString.Exclude
    private Label label;

    @Column(name = "category_notation")
    private String categoryNotation;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        LabelRelease that = (LabelRelease) o;

        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return 540921415;
    }
}
