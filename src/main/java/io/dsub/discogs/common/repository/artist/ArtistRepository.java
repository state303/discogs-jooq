package io.dsub.discogs.common.repository.artist;

import io.dsub.discogs.common.entity.artist.Artist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArtistRepository extends JpaRepository<Artist, Long> {

}
