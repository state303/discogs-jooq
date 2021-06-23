package io.dsub.discogs.common.artist.repository;

import io.dsub.discogs.common.artist.entity.ArtistNameVariation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArtistNameVariationRepository extends JpaRepository<ArtistNameVariation, Long> {

}
