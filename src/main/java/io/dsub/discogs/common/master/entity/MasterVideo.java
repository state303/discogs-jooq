package io.dsub.discogs.common.master.entity;

import io.dsub.discogs.common.entity.BaseTimeEntity;
import lombok.*;

import javax.persistence.*;

@Data
@Entity
@Builder
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
@Table(
        name = "master_video",
        uniqueConstraints =
        @UniqueConstraint(
                name = "uq_master_video_master_id_url",
                columnNames = {"master_id", "url"}))
public class MasterVideo extends BaseTimeEntity {

    private static final Long SerialVersionUID = 1L;

    @Id
    @Column(name = "id", columnDefinition = "serial")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "title", length = 2000)
    private String title;

    @Column(name = "description", length = 40000)
    private String description;

    @Column(name = "url", length = 5000)
    private String url;

    @ManyToOne
    @JoinColumn(name = "master_id", referencedColumnName = "id", nullable = false)
    private Master master;
}
