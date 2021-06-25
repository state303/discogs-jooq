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
        name = "release_item_identifier",
        uniqueConstraints = {
                @UniqueConstraint(
                        name = "uq_identifier_type_description_value_release_item_id",
                        columnNames = {"type", "description", "value", "release_item_id"})
        })
public class ReleaseItemIdentifier extends BaseTimeEntity {

    private static final Long SerialVersionUID = 1L;

    @Id
    @Column(name = "id", columnDefinition = "serial")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "type", length = 10000)
    private String type;

    @Column(name = "description", length = 20000)
    private String description;

    @Column(name = "value", length = 10000)
    private String value;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "release_item_id", referencedColumnName = "id", nullable = false, foreignKey = @ForeignKey(name = "fk_release_item_identifier_release_item_id_release_item"))
    @ToString.Exclude
    private ReleaseItem releaseItem;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        ReleaseItemIdentifier that = (ReleaseItemIdentifier) o;

        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return 173625288;
    }
}
