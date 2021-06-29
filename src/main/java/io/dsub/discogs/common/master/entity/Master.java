package io.dsub.discogs.common.master.entity;

import io.dsub.discogs.common.entity.BaseTimeEntity;
import io.dsub.discogs.common.release.entity.ReleaseItem;
import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.Objects;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
@Builder
@AllArgsConstructor
@Table(name = "master")
public class Master extends BaseTimeEntity {

    private static final Long SerialVersionUID = 1L;

    @Column(name = "id", columnDefinition = "serial")
    @Id
    private Long id;

    @JoinColumn(name = "main_release_id", referencedColumnName = "id", foreignKey = @ForeignKey(name = "fk_master_main_release_id_release_item"))
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @ToString.Exclude
    private ReleaseItem mainRelease;

    @Column(name = "year")
    private short year;

    @Column(name = "title", length = 2000)
    private String title;

    @Column(name = "data_quality")
    private String dataQuality;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Master master = (Master) o;

        return Objects.equals(id, master.id);
    }

    @Override
    public int hashCode() {
        return 719923721;
    }
}
