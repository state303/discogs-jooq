package io.dsub.discogs.common.repository.artist;

import io.dsub.discogs.common.entity.artist.ArtistUrl;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArtistUrlRepository extends JpaRepository<ArtistUrl, Long> {

}
