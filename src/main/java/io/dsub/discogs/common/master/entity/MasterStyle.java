package io.dsub.discogs.common.master.entity;

import io.dsub.discogs.common.entity.BaseTimeEntity;
import io.dsub.discogs.common.style.entity.Style;
import lombok.*;

import javax.persistence.*;

@Data
@Entity
@Builder
@EqualsAndHashCode(callSuper = false)
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

    @ManyToOne
    @JoinColumn(name = "master_id", referencedColumnName = "id", nullable = false)
    private Master master;

    @ManyToOne
    @JoinColumn(name = "style", referencedColumnName = "name", nullable = false)
    private Style style;
}
