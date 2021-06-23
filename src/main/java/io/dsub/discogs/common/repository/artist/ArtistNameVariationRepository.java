package io.dsub.discogs.common.repository.artist;

import io.dsub.discogs.common.entity.artist.ArtistNameVariation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArtistNameVariationRepository extends JpaRepository<ArtistNameVariation, Long> {

}
