package io.dsub.discogs.common.release.entity;

import io.dsub.discogs.common.entity.HashEntity;
import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
@Builder
@AllArgsConstructor
@Table(
        name = "release_item_image",
        uniqueConstraints = {
                @UniqueConstraint(
                        name = "uq_release_item_image_release_item_id_hash",
                        columnNames = {"release_item_id","hash"})
        })
public class ReleaseItemImage extends HashEntity {
    @Id
    @Column(name = "id", columnDefinition = "serial")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Lob
    @Column(name = "file_name")
    private String fileName;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "release_item_id", referencedColumnName = "id", nullable = false, foreignKey = @ForeignKey(name = "fk_release_item_image_release_item_id_release_item"))
    @ToString.Exclude
    private ReleaseItem releaseItem;

    @Override
    protected String[] getHashCandidates() {
        return new String[]{fileName};
    }
}