package io.dsub.discogs.common.repository.release;

import io.dsub.discogs.common.entity.release.ReleaseItemWork;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReleaseItemWorkRepository extends JpaRepository<ReleaseItemWork, Long> {

}
