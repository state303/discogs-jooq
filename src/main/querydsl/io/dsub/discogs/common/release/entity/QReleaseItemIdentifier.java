package io.dsub.discogs.common.release.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QReleaseItemIdentifier is a Querydsl query type for ReleaseItemIdentifier
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QReleaseItemIdentifier extends EntityPathBase<ReleaseItemIdentifier> {

    private static final long serialVersionUID = -1349918992L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QReleaseItemIdentifier releaseItemIdentifier = new QReleaseItemIdentifier("releaseItemIdentifier");

    public final io.dsub.discogs.common.entity.QBaseTimeEntity _super = new io.dsub.discogs.common.entity.QBaseTimeEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final StringPath description = createString("description");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> lastModifiedAt = _super.lastModifiedAt;

    public final QReleaseItem releaseItem;

    public final StringPath type = createString("type");

    public final StringPath value = createString("value");

    //inherited
    public final NumberPath<Long> version = _super.version;

    public QReleaseItemIdentifier(String variable) {
        this(ReleaseItemIdentifier.class, forVariable(variable), INITS);
    }

    public QReleaseItemIdentifier(Path<? extends ReleaseItemIdentifier> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QReleaseItemIdentifier(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QReleaseItemIdentifier(PathMetadata metadata, PathInits inits) {
        this(ReleaseItemIdentifier.class, metadata, inits);
    }

    public QReleaseItemIdentifier(Class<? extends ReleaseItemIdentifier> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.releaseItem = inits.isInitialized("releaseItem") ? new QReleaseItem(forProperty("releaseItem")) : null;
    }

}

