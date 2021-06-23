package io.dsub.discogs.common.artist.repository;

import io.dsub.discogs.common.artist.entity.ArtistMember;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArtistMemberRepository extends JpaRepository<ArtistMember, Long> {

}
