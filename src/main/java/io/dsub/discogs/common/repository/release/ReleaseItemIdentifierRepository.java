package io.dsub.discogs.common.repository.release;

import io.dsub.discogs.common.entity.release.ReleaseItemIdentifier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReleaseItemIdentifierRepository extends
    JpaRepository<ReleaseItemIdentifier, Long> {

}
