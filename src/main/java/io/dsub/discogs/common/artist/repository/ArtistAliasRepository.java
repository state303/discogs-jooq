package io.dsub.discogs.common.artist.repository;

import io.dsub.discogs.common.artist.entity.ArtistAlias;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArtistAliasRepository extends JpaRepository<ArtistAlias, Long> {

}
