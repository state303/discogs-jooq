package io.dsub.discogs.common.label.entity;

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
@Table(name = "label")
public class Label extends BaseTimeEntity {

    private static final Long SerialVersionUID = 1L;

    @Column(name = "id", columnDefinition = "serial")
    @Id
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "contact_info", length = 40000)
    private String contactInfo;

    @Column(name = "profile", length = 40000)
    private String profile;

    @Column(name = "data_quality")
    private String dataQuality;
}