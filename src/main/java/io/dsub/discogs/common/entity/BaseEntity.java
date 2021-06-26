package io.dsub.discogs.common.entity;

import lombok.*;

import javax.persistence.MappedSuperclass;
import java.io.Serializable;

/**
 * Base entity class which should be implemented around all entity classes.
 */
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@MappedSuperclass
public abstract class BaseEntity implements Serializable {
}