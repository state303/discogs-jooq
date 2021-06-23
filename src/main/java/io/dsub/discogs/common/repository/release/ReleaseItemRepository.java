package io.dsub.discogs.common.repository.release;

import io.dsub.discogs.common.entity.release.ReleaseItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReleaseItemRepository extends JpaRepository<ReleaseItem, Long> {

}
