package io.dsub.discogs.common.master.repository;

import io.dsub.discogs.common.master.entity.MasterVideo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MasterVideoRepository extends JpaRepository<MasterVideo, Long> {

}
