package io.dsub.discogs.common.label.entity;

import io.dsub.discogs.common.entity.BaseTimeEntity;
import io.dsub.discogs.common.entity.HashEntity;
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
@Table(
        name = "label_url",
        uniqueConstraints =
        @UniqueConstraint(
                name = "uq_label_url_label_id_hash",
                columnNames = {"label_id", "hash"}))
public class LabelUrl extends HashEntity {

    private static final Long SerialVersionUID = 1L;

    @Id
    @Column(name = "id", columnDefinition = "serial")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "label_id", referencedColumnName = "id", nullable = false, foreignKey = @ForeignKey(name = "fk_label_url_label_id_label"))
    @ToString.Exclude
    private Label label;

    @Column(length = 5000, name = "url", nullable = false)
    private String url;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        LabelUrl labelUrl = (LabelUrl) o;

        return Objects.equals(id, labelUrl.id);
    }

    @Override
    public int hashCode() {
        return 179226694;
    }

    @Override
    protected String[] getHashCandidates() {
        return new String[]{url};
    }
}