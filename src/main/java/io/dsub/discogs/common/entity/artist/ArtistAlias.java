package io.dsub.discogs.common.entity.artist;

import io.dsub.discogs.common.entity.base.BaseTimeEntity;
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
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
@Table(
    name = "artist_alias",
    uniqueConstraints =
    @UniqueConstraint(
        name = "uq_artist_alias_artist_id_alias_id",
        columnNames = {"artist_id", "alias_id"}))
public class ArtistAlias extends BaseTimeEntity {

  private static final Long SerialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE)
  @Column(name = "id", columnDefinition = "serial", updatable = false, nullable = false)
  private Long id;

  @ManyToOne
  @JoinColumn(name = "artist_id", referencedColumnName = "id", nullable = false)
  private Artist artist;

  @ManyToOne
  @JoinColumn(name = "alias_id", referencedColumnName = "id", nullable = false)
  private Artist alias;
}
