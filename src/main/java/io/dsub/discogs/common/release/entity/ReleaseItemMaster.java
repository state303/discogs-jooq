package io.dsub.discogs.common.release.entity;

import io.dsub.discogs.common.entity.BaseTimeEntity;
import io.dsub.discogs.common.master.entity.Master;
import lombok.*;

import javax.persistence.*;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
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

    @ManyToOne
    @JoinColumn(name = "release_item_id", referencedColumnName = "id", nullable = false, foreignKey = @ForeignKey(name = "fk_release_item_master_release_item_id_release_item"))
    private ReleaseItem releaseItem;

    @ManyToOne
    @JoinColumn(name = "master_id", referencedColumnName = "id", nullable = false, foreignKey = @ForeignKey(name = "fk_release_item_master_master_id_master"))
    private Master master;
}