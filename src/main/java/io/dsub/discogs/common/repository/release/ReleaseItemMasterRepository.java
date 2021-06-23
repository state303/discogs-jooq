package io.dsub.discogs.common.repository.release;

import io.dsub.discogs.common.entity.release.ReleaseItemMaster;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReleaseItemMasterRepository extends JpaRepository<ReleaseItemMaster, Long> {

}