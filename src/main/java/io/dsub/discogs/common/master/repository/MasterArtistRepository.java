package io.dsub.discogs.common.master.repository;

import io.dsub.discogs.common.master.entity.MasterArtist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MasterArtistRepository extends JpaRepository<MasterArtist, Long> {

}
