package io.dsub.discogs.common.master.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QMaster is a Querydsl query type for Master
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QMaster extends EntityPathBase<Master> {

    private static final long serialVersionUID = -2097342286L;

    public static final QMaster master = new QMaster("master");

    public final io.dsub.discogs.common.entity.QBaseTimeEntity _super = new io.dsub.discogs.common.entity.QBaseTimeEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final StringPath dataQuality = createString("dataQuality");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> lastModifiedAt = _super.lastModifiedAt;

    public final StringPath title = createString("title");

    //inherited
    public final NumberPath<Long> version = _super.version;

    public final NumberPath<Short> year = createNumber("year", Short.class);

    public QMaster(String variable) {
        super(Master.class, forVariable(variable));
    }

    public QMaster(Path<? extends Master> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMaster(PathMetadata metadata) {
        super(Master.class, metadata);
    }

}

