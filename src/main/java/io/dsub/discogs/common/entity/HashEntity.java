package io.dsub.discogs.common.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@MappedSuperclass
@AllArgsConstructor
public abstract class HashEntity extends BaseTimeEntity {
    @Column(name = "hash", nullable = false)
    private Integer hash;

    @PrePersist
    public void prePersist() {
        if (this.getHashCandidates() == null) {
            this.hash = this.hashCode();
        }
        StringBuilder sb = new StringBuilder();
        for (String hashCandidate : this.getHashCandidates()) {
            if (hashCandidate != null && hashCandidate.isBlank()) {
                sb.append(hashCandidate);
            }
        }
        this.hash = sb.isEmpty() ? this.hashCode() : sb.toString().hashCode();
    }
    protected abstract String[] getHashCandidates();
}