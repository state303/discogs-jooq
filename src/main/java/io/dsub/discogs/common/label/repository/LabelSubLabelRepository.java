package io.dsub.discogs.common.label.repository;

import io.dsub.discogs.common.label.entity.LabelSubLabel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LabelSubLabelRepository extends JpaRepository<LabelSubLabel, Long> {

}
