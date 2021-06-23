package io.dsub.discogs.common.artist.repository;

import io.dsub.discogs.common.artist.entity.ArtistGroup;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArtistGroupRepository extends JpaRepository<ArtistGroup, Long> {

}
