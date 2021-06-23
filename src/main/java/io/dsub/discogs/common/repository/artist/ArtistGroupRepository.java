package io.dsub.discogs.common.repository.artist;

import io.dsub.discogs.common.entity.artist.ArtistGroup;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArtistGroupRepository extends JpaRepository<ArtistGroup, Long> {

}
