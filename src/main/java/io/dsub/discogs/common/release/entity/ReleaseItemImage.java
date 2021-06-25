package io.dsub.discogs.common.release.entity;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(
        name = "release_item_image",
        uniqueConstraints = {
                @UniqueConstraint(
                        name = "uq_release_item_image_file_name",
                        columnNames = {"file_name"})
        })
public class ReleaseItemImage {
    @Id
    @Column(name = "id", columnDefinition = "serial")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "file_name", length = 1000)
    private String fileName;
    
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "release_item_id", referencedColumnName = "id", nullable = false, foreignKey = @ForeignKey(name = "fk_release_item_image_release_item_id_release_item"))
    @ToString.Exclude
    private ReleaseItem releaseItem;
}