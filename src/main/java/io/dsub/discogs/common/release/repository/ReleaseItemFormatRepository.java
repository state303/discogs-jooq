package io.dsub.discogs.common.release.repository;

import io.dsub.discogs.common.release.entity.ReleaseItemFormat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReleaseItemFormatRepository extends JpaRepository<ReleaseItemFormat, Long> {

}
