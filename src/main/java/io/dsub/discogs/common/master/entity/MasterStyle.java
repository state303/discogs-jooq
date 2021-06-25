package io.dsub.discogs.common.master.entity;

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
        name = "master_style",
        uniqueConstraints =
        @UniqueConstraint(
                name = "uq_master_style_master_id_style",
                columnNames = {"master_id", "style"}))
public class MasterStyle extends BaseTimeEntity {

    private static final Long SerialVersionUID = 1L;

    @Id
    @Column(name = "id", columnDefinition = "serial")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "master_id", referencedColumnName = "id", nullable = false, foreignKey = @ForeignKey(name = "fk_master_style_master_id_master"))
    @ToString.Exclude
    private Master master;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "style", referencedColumnName = "name", nullable = false, foreignKey = @ForeignKey(name = "fk_master_style_style_style"))
    @ToString.Exclude
    private Style style;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        MasterStyle that = (MasterStyle) o;

        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return 1056814406;
    }
}
