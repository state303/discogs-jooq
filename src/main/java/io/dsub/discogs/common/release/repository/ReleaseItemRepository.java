package io.dsub.discogs.common.release.repository;

import io.dsub.discogs.common.entity.view.LongIdView;
import io.dsub.discogs.common.release.entity.ReleaseItem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReleaseItemRepository extends JpaRepository<ReleaseItem, Long> {
    List<LongIdView> findIdsBy();
}
