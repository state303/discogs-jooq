package io.dsub.discogs.common.genre.entity;

import io.dsub.discogs.common.entity.BaseEntity;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@Table(name = "genre")
public class Genre extends BaseEntity {

    @Id
    @Column(name = "name")
    private String name;
}
