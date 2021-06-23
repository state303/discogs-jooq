package io.dsub.discogs.common.release.repository;

import io.dsub.discogs.common.release.entity.ReleaseItemCreditedArtist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReleaseItemCreditedArtistRepository extends
        JpaRepository<ReleaseItemCreditedArtist, Long> {

}
