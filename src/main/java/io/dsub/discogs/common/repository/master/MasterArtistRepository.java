package io.dsub.discogs.common.repository.master;

import io.dsub.discogs.common.entity.master.MasterArtist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MasterArtistRepository extends JpaRepository<MasterArtist, Long> {

}
