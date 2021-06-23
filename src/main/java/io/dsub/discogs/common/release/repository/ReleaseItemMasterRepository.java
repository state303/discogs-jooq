package io.dsub.discogs.common.release.repository;

import io.dsub.discogs.common.release.entity.ReleaseItemMaster;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReleaseItemMasterRepository extends JpaRepository<ReleaseItemMaster, Long> {

}