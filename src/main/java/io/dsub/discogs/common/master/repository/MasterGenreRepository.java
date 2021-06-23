package io.dsub.discogs.common.master.repository;

import io.dsub.discogs.common.master.entity.MasterGenre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MasterGenreRepository extends JpaRepository<MasterGenre, Long> {

}
