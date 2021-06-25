package io.dsub.discogs.common.release.entity;

import io.dsub.discogs.common.entity.BaseTimeEntity;
import io.dsub.discogs.common.style.entity.Style;
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

    @JoinColumn(name = "release_item_id", referencedColumnName = "id", nullable = false, foreignKey = @ForeignKey(name = "fk_release_item_style_release_item_id_release_item"))
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private ReleaseItem releaseItem;

    @JoinColumn(name = "style", referencedColumnName = "name", nullable = false, foreignKey = @ForeignKey(name = "fk_release_item_style_style_style"))
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Style style;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        ReleaseItemStyle that = (ReleaseItemStyle) o;

        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return 209834375;
    }
}
