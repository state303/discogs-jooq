package io.dsub.discogs.common.style.repository;

import io.dsub.discogs.common.entity.view.NameIdView;
import io.dsub.discogs.common.style.entity.Style;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StyleRepository extends JpaRepository<Style, String> {
    List<NameIdView> findNamesBy();
}