package io.dsub.discogs.common.release.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QReleaseItemTrack is a Querydsl query type for ReleaseItemTrack
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QReleaseItemTrack extends EntityPathBase<ReleaseItemTrack> {

    private static final long serialVersionUID = 1670655652L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QReleaseItemTrack releaseItemTrack = new QReleaseItemTrack("releaseItemTrack");

    public final io.dsub.discogs.common.entity.QBaseTimeEntity _super = new io.dsub.discogs.common.entity.QBaseTimeEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final StringPath duration = createString("duration");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> lastModifiedAt = _super.lastModifiedAt;

    public final StringPath position = createString("position");

    public final QReleaseItem releaseItem;

    public final StringPath title = createString("title");

    //inherited
    public final NumberPath<Long> version = _super.version;

    public QReleaseItemTrack(String variable) {
        this(ReleaseItemTrack.class, forVariable(variable), INITS);
    }

    public QReleaseItemTrack(Path<? extends ReleaseItemTrack> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QReleaseItemTrack(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QReleaseItemTrack(PathMetadata metadata, PathInits inits) {
        this(ReleaseItemTrack.class, metadata, inits);
    }

    public QReleaseItemTrack(Class<? extends ReleaseItemTrack> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.releaseItem = inits.isInitialized("releaseItem") ? new QReleaseItem(forProperty("releaseItem")) : null;
    }

}

