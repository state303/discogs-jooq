package io.dsub.discogs.common.release.entity;

import io.dsub.discogs.common.entity.BaseTimeEntity;
import io.dsub.discogs.common.genre.entity.Genre;
import lombok.*;

import javax.persistence.*;

@Data
@Entity
@Builder
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
@Table(
        name = "release_item_genre",
        uniqueConstraints =
        @UniqueConstraint(
                name = "uq_release_item_genre_release_item_id_genre",
                columnNames = {"release_item_id", "genre"}))
public class ReleaseItemGenre extends BaseTimeEntity {

    private static final Long SerialVersionUID = 1L;

    @Id
    @Column(name = "id", columnDefinition = "serial")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @JoinColumn(name = "release_item_id", referencedColumnName = "id", nullable = false)
    @ManyToOne
    private ReleaseItem releaseItem;

    @JoinColumn(name = "genre", referencedColumnName = "name", nullable = false)
    @ManyToOne
    private Genre genre;
}
