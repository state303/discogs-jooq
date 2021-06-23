package io.dsub.discogs.common.master.repository;

import io.dsub.discogs.common.entity.view.LongIdView;
import io.dsub.discogs.common.master.entity.Master;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MasterRepository extends JpaRepository<Master, Long> {
    List<LongIdView> findIdsBy();
}
