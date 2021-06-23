package io.dsub.discogs.common.artist.entity;

import io.dsub.discogs.common.entity.BaseTimeEntity;
import lombok.*;

import javax.persistence.*;

@Data
@Entity
@Builder
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
@Table(
        name = "artist_member",
        uniqueConstraints =
        @UniqueConstraint(
                name = "uq_artist_member_artist_id_member_id",
                columnNames = {"artist_id", "member_id"}))
public class ArtistMember extends BaseTimeEntity {

    private static final Long SerialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", columnDefinition = "serial", updatable = false, nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "artist_id", referencedColumnName = "id", nullable = false)
    private Artist artist;

    @ManyToOne
    @JoinColumn(name = "member_id", referencedColumnName = "id", nullable = false)
    private Artist member;
}