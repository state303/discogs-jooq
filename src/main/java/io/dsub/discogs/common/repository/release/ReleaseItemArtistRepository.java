package io.dsub.discogs.common.repository.release;

import io.dsub.discogs.common.entity.release.ReleaseItemArtist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReleaseItemArtistRepository extends JpaRepository<ReleaseItemArtist, Long> {

}
