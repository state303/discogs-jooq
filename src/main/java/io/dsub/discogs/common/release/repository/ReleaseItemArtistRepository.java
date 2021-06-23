package io.dsub.discogs.common.release.repository;

import io.dsub.discogs.common.release.entity.ReleaseItemArtist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReleaseItemArtistRepository extends JpaRepository<ReleaseItemArtist, Long> {

}
