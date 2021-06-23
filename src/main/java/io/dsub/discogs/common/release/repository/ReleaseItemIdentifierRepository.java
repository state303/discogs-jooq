package io.dsub.discogs.common.release.repository;

import io.dsub.discogs.common.release.entity.ReleaseItemIdentifier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReleaseItemIdentifierRepository extends
        JpaRepository<ReleaseItemIdentifier, Long> {

}
