package io.dsub.discogs.common.artist.repository;

import io.dsub.discogs.common.artist.entity.ArtistUrl;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArtistUrlRepository extends JpaRepository<ArtistUrl, Long> {

}
