package io.dsub.discogs.common.entity.release;

import io.dsub.discogs.common.entity.base.BaseTimeEntity;
import io.dsub.discogs.common.entity.master.Master;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

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
            columnNames = {"type", "description", "value", "release_item_id"})
    })
public class ReleaseItemMaster extends BaseTimeEntity {
  @Id
  @Column(name = "id", columnDefinition = "serial")
  @GeneratedValue(strategy = GenerationType.SEQUENCE)
  private Long id;

  @ManyToOne
  @JoinColumn(name = "release_item_id", referencedColumnName = "id", nullable = false)
  private ReleaseItem releaseItem;

  @ManyToOne
  @JoinColumn(name = "artist_id", referencedColumnName = "id", nullable = false)
  private Master master;
}