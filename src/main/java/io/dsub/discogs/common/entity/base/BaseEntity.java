package io.dsub.discogs.common.entity.base;

import java.io.Serializable;
import javax.persistence.MappedSuperclass;
import javax.persistence.Version;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Base entity class which should be implemented around all entity classes.
 */
@Data
@MappedSuperclass
@NoArgsConstructor
@AllArgsConstructor
public abstract class BaseEntity implements Serializable {

  @Version
  private long version;
}
