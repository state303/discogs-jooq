package io.dsub.discogs.common.artist.entity;

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
@Table(name = "artist")
public class Artist extends BaseTimeEntity {

    private static final Long SerialVersionUID = 1L;

    @Id
    @Column(name = "id", columnDefinition = "serial")
    private Long id;

    @Column(name = "name", length = 1000)
    private String name;

    @Column(name = "real_name", length = 2000)
    private String realName;

    @Column(name = "profile", length = 40000)
    private String profile;

    @Column(name = "data_quality")
    private String dataQuality;
}