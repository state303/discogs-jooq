package io.dsub.discogs.common.entity;

import lombok.*;

import javax.persistence.MappedSuperclass;
import javax.persistence.Version;
import java.io.Serializable;

/**
 * Base entity class which should be implemented around all entity classes.
 */
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@MappedSuperclass
@NoArgsConstructor
@AllArgsConstructor
public abstract class BaseEntity implements Serializable {
    @Version
    private long version;
}