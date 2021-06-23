package io.dsub.discogs.common.repository.artist;

import io.dsub.discogs.common.entity.artist.ArtistMember;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArtistMemberRepository extends JpaRepository<ArtistMember, Long> {

}
