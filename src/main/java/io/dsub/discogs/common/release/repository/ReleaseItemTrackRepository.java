package io.dsub.discogs.common.release.repository;

import io.dsub.discogs.common.release.entity.ReleaseItemTrack;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReleaseItemTrackRepository extends JpaRepository<ReleaseItemTrack, Long> {

}
