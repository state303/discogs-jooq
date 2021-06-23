package io.dsub.discogs.common.release.repository;

import io.dsub.discogs.common.release.entity.ReleaseItemWork;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReleaseItemWorkRepository extends JpaRepository<ReleaseItemWork, Long> {

}
