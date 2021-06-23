package io.dsub.discogs.common.repository.release;

import io.dsub.discogs.common.entity.release.ReleaseItemGenre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReleaseItemGenreRepository extends JpaRepository<ReleaseItemGenre, Long> {

}
