package io.dsub.discogs.common.repository.release;

import io.dsub.discogs.common.entity.release.ReleaseItemFormat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReleaseItemFormatRepository extends JpaRepository<ReleaseItemFormat, Long> {

}
