package io.dsub.discogs.common.release.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QReleaseItemVideo is a Querydsl query type for ReleaseItemVideo
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QReleaseItemVideo extends EntityPathBase<ReleaseItemVideo> {

    private static final long serialVersionUID = 1672237524L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QReleaseItemVideo releaseItemVideo = new QReleaseItemVideo("releaseItemVideo");

    public final io.dsub.discogs.common.entity.QBaseTimeEntity _super = new io.dsub.discogs.common.entity.QBaseTimeEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final StringPath description = createString("description");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> lastModifiedAt = _super.lastModifiedAt;

    public final QReleaseItem releaseItem;

    public final StringPath title = createString("title");

    public final StringPath url = createString("url");

    //inherited
    public final NumberPath<Long> version = _super.version;

    public QReleaseItemVideo(String variable) {
        this(ReleaseItemVideo.class, forVariable(variable), INITS);
    }

    public QReleaseItemVideo(Path<? extends ReleaseItemVideo> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QReleaseItemVideo(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QReleaseItemVideo(PathMetadata metadata, PathInits inits) {
        this(ReleaseItemVideo.class, metadata, inits);
    }

    public QReleaseItemVideo(Class<? extends ReleaseItemVideo> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.releaseItem = inits.isInitialized("releaseItem") ? new QReleaseItem(forProperty("releaseItem")) : null;
    }

}

