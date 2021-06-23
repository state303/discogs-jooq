package io.dsub.discogs.common.label.repository;

import io.dsub.discogs.common.entity.view.LongIdView;
import io.dsub.discogs.common.label.entity.Label;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LabelRepository extends JpaRepository<Label, Long> {
    List<LongIdView> findIdsBy();
}
