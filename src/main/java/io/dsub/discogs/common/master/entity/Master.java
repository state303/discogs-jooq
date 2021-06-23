package io.dsub.discogs.common.master.entity;

import io.dsub.discogs.common.entity.BaseTimeEntity;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Builder
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "master")
public class Master extends BaseTimeEntity {

    private static final Long SerialVersionUID = 1L;

    @Column(name = "id", columnDefinition = "serial")
    @Id
    private Long id;

    @Column(name = "year")
    private short year;

    @Column(name = "title", length = 2000)
    private String title;

    @Column(name = "data_quality")
    private String dataQuality;
}
