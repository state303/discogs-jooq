package io.dsub.discogs.common.release.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QReleaseItemGenre is a Querydsl query type for ReleaseItemGenre
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QReleaseItemGenre extends EntityPathBase<ReleaseItemGenre> {

    private static final long serialVersionUID = 1658275548L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QReleaseItemGenre releaseItemGenre = new QReleaseItemGenre("releaseItemGenre");

    public final io.dsub.discogs.common.entity.QBaseTimeEntity _super = new io.dsub.discogs.common.entity.QBaseTimeEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final io.dsub.discogs.common.genre.entity.QGenre genre;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> lastModifiedAt = _super.lastModifiedAt;

    public final QReleaseItem releaseItem;

    //inherited
    public final NumberPath<Long> version = _super.version;

    public QReleaseItemGenre(String variable) {
        this(ReleaseItemGenre.class, forVariable(variable), INITS);
    }

    public QReleaseItemGenre(Path<? extends ReleaseItemGenre> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QReleaseItemGenre(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QReleaseItemGenre(PathMetadata metadata, PathInits inits) {
        this(ReleaseItemGenre.class, metadata, inits);
    }

    public QReleaseItemGenre(Class<? extends ReleaseItemGenre> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.genre = inits.isInitialized("genre") ? new io.dsub.discogs.common.genre.entity.QGenre(forProperty("genre")) : null;
        this.releaseItem = inits.isInitialized("releaseItem") ? new QReleaseItem(forProperty("releaseItem")) : null;
    }

}

