package io.dsub.discogs.common.release.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QReleaseItemFormat is a Querydsl query type for ReleaseItemFormat
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QReleaseItemFormat extends EntityPathBase<ReleaseItemFormat> {

    private static final long serialVersionUID = -152345154L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QReleaseItemFormat releaseItemFormat = new QReleaseItemFormat("releaseItemFormat");

    public final io.dsub.discogs.common.entity.QBaseTimeEntity _super = new io.dsub.discogs.common.entity.QBaseTimeEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final StringPath description = createString("description");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> lastModifiedAt = _super.lastModifiedAt;

    public final StringPath name = createString("name");

    public final NumberPath<Integer> quantity = createNumber("quantity", Integer.class);

    public final QReleaseItem releaseItem;

    public final StringPath text = createString("text");

    //inherited
    public final NumberPath<Long> version = _super.version;

    public QReleaseItemFormat(String variable) {
        this(ReleaseItemFormat.class, forVariable(variable), INITS);
    }

    public QReleaseItemFormat(Path<? extends ReleaseItemFormat> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QReleaseItemFormat(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QReleaseItemFormat(PathMetadata metadata, PathInits inits) {
        this(ReleaseItemFormat.class, metadata, inits);
    }

    public QReleaseItemFormat(Class<? extends ReleaseItemFormat> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.releaseItem = inits.isInitialized("releaseItem") ? new QReleaseItem(forProperty("releaseItem")) : null;
    }

}

