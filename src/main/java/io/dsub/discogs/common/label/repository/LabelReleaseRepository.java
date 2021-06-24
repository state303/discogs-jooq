package io.dsub.discogs.common.label.repository;

import io.dsub.discogs.common.label.entity.LabelRelease;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LabelReleaseRepository extends JpaRepository<LabelRelease, Long> {
}
