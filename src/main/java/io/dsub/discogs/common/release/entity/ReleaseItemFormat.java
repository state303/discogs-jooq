package io.dsub.discogs.common.release.entity;

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
        name = "release_item_format",
        uniqueConstraints =
        @UniqueConstraint(
                name = "uq_release_item_format_name_quantity_text_release_item_id",
                columnNames = {
                        "name", "quantity",
                        "text", "release_item_id"
                }))
public class ReleaseItemFormat extends BaseTimeEntity {

    private static final Long SerialVersionUID = 1L;

    @Id
    @Column(name = "id", columnDefinition = "serial")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "quantity")
    private Integer quantity;

    @Column(name = "description", length = 10000)
    private String description;

    @Column(name = "text", length = 5000)
    private String text;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "release_item_id", referencedColumnName = "id", nullable = false, foreignKey = @ForeignKey(name = "fk_release_item_format_release_item_id_release_item"))
    @ToString.Exclude
    private ReleaseItem releaseItem;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        ReleaseItemFormat that = (ReleaseItemFormat) o;

        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return 1156093036;
    }
}
