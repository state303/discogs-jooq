package io.dsub.discogs.common.release.entity;

import io.dsub.discogs.common.entity.BaseTimeEntity;
import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;
import java.util.Objects;

@Getter
@Setter
@ToString
@Builder
@Entity
@RequiredArgsConstructor
@AllArgsConstructor
@Table(name = "release_item")
public class ReleaseItem extends BaseTimeEntity {

    private static final Long SerialVersionUID = 1L;

    @Column(name = "id", columnDefinition = "serial")
    @Id
    private Long id;

    @Column(name = "is_master")
    private boolean isMaster;

    @Column(name = "status")
    private String status;

    @Column(name = "title", length = 10000)
    private String title;

    @Column(name = "country")
    private String country;

    @Column(name = "notes", columnDefinition = "TEXT")
    private String notes;

    @Column(name = "data_quality")
    private String dataQuality;

    @Column(name = "has_valid_month")
    private boolean hasValidMonth;

    @Column(name = "has_valid_day")
    private boolean hasValidDay;

    @Column(name = "has_valid_year")
    private boolean hasValidYear;

    @Column(name = "listed_release_date")
    private String listedReleaseDate;

    @Column(name = "release_date")
    private LocalDate releaseDate;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        ReleaseItem that = (ReleaseItem) o;

        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return 1789770120;
    }
}
