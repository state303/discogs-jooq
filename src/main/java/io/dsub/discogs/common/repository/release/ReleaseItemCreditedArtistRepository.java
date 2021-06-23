package io.dsub.discogs.common.repository.release;

import io.dsub.discogs.common.entity.release.ReleaseItemCreditedArtist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReleaseItemCreditedArtistRepository extends
    JpaRepository<ReleaseItemCreditedArtist, Long> {

}
