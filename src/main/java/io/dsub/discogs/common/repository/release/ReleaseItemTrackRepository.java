package io.dsub.discogs.common.repository.release;

import io.dsub.discogs.common.entity.release.ReleaseItemTrack;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReleaseItemTrackRepository extends JpaRepository<ReleaseItemTrack, Long> {

}
