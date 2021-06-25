package io.dsub.discogs.common.artist.entity;

import io.dsub.discogs.common.entity.BaseTimeEntity;
import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
@Builder
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Artist artist = (Artist) o;

        return Objects.equals(id, artist.id);
    }

    @Override
    public int hashCode() {
        return 787003919;
    }
}