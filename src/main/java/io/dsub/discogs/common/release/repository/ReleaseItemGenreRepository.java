package io.dsub.discogs.common.release.repository;

import io.dsub.discogs.common.release.entity.ReleaseItemGenre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReleaseItemGenreRepository extends JpaRepository<ReleaseItemGenre, Long> {

}
