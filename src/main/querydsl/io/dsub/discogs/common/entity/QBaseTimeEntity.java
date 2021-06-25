package io.dsub.discogs.common.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QBaseTimeEntity is a Querydsl query type for BaseTimeEntity
 */
@Generated("com.querydsl.codegen.SupertypeSerializer")
public class QBaseTimeEntity extends EntityPathBase<BaseTimeEntity> {

    private static final long serialVersionUID = -1431631333L;

    public static final QBaseTimeEntity baseTimeEntity = new QBaseTimeEntity("baseTimeEntity");

    public final QBaseEntity _super = new QBaseEntity(this);

    public final DateTimePath<java.time.LocalDateTime> createdAt = createDateTime("createdAt", java.time.LocalDateTime.class);

    public final DateTimePath<java.time.LocalDateTime> lastModifiedAt = createDateTime("lastModifiedAt", java.time.LocalDateTime.class);

    //inherited
    public final NumberPath<Long> version = _super.version;

    public QBaseTimeEntity(String variable) {
        super(BaseTimeEntity.class, forVariable(variable));
    }

    public QBaseTimeEntity(Path<? extends BaseTimeEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QBaseTimeEntity(PathMetadata metadata) {
        super(BaseTimeEntity.class, metadata);
    }

}

