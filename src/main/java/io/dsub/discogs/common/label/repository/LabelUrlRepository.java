package io.dsub.discogs.common.label.repository;

import io.dsub.discogs.common.label.entity.LabelUrl;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LabelUrlRepository extends JpaRepository<LabelUrl, Long> {
}
