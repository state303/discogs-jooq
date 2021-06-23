package io.dsub.discogs.common.genre.repository;

import io.dsub.discogs.common.entity.view.NameIdView;
import io.dsub.discogs.common.genre.entity.Genre;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GenreRepository extends JpaRepository<Genre, String> {
    List<NameIdView> findNamesBy();
}