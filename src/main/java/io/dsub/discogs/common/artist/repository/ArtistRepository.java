package io.dsub.discogs.common.artist.repository;

import io.dsub.discogs.common.artist.entity.Artist;
import io.dsub.discogs.common.entity.view.LongIdView;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ArtistRepository extends JpaRepository<Artist, Long> {
    List<LongIdView> findIdsBy();
}