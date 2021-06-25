package io.dsub.discogs.common.style.entity;

import io.dsub.discogs.common.entity.BaseEntity;
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
@Table(name = "style")
public class Style extends BaseEntity {

    @Id
    @Column(name = "name")
    private String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Style style = (Style) o;

        return Objects.equals(name, style.name);
    }

    @Override
    public int hashCode() {
        return 1127712063;
    }
}
