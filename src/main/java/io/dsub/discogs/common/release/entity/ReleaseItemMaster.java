package io.dsub.discogs.common.release.entity;

import io.dsub.discogs.common.entity.BaseTimeEntity;
import io.dsub.discogs.common.master.entity.Master;
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
@AllArgsConstructor
@Table(
        name = "release_item_master",
        uniqueConstraints = {
                @UniqueConstraint(
                        name = "uq_release_item_master_release_item_id_master_id",
                        columnNames = {"release_item_id", "master_id"})
        })
public class ReleaseItemMaster extends BaseTimeEntity {

    @Id
    @Column(name = "id", columnDefinition = "serial")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "release_item_id", referencedColumnName = "id", nullable = false, foreignKey = @ForeignKey(name = "fk_release_item_master_release_item_id_release_item"))
    @ToString.Exclude
    private ReleaseItem releaseItem;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "master_id", referencedColumnName = "id", nullable = false, foreignKey = @ForeignKey(name = "fk_release_item_master_master_id_master"))
    @ToString.Exclude
    private Master master;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        ReleaseItemMaster that = (ReleaseItemMaster) o;

        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return 161550229;
    }
}