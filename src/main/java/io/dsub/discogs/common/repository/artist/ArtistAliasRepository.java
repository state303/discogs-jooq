package io.dsub.discogs.common.repository.artist;

import io.dsub.discogs.common.entity.artist.ArtistAlias;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArtistAliasRepository extends JpaRepository<ArtistAlias, Long> {

}
