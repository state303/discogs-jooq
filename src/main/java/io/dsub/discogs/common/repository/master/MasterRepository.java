package io.dsub.discogs.common.repository.master;

import io.dsub.discogs.common.entity.master.Master;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MasterRepository extends JpaRepository<Master, Long> {}
