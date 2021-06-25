package io.dsub.discogs.common.release.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QReleaseItemArtist is a Querydsl query type for ReleaseItemArtist
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QReleaseItemArtist extends EntityPathBase<ReleaseItemArtist> {

    private static final long serialVersionUID = -292664050L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QReleaseItemArtist releaseItemArtist = new QReleaseItemArtist("releaseItemArtist");

    public final io.dsub.discogs.common.entity.QBaseTimeEntity _super = new io.dsub.discogs.common.entity.QBaseTimeEntity(this);

    public final io.dsub.discogs.common.artist.entity.QArtist artist;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> lastModifiedAt = _super.lastModifiedAt;

    public final QReleaseItem releaseItem;

    //inherited
    public final NumberPath<Long> version = _super.version;

    public QReleaseItemArtist(String variable) {
        this(ReleaseItemArtist.class, forVariable(variable), INITS);
    }

    public QReleaseItemArtist(Path<? extends ReleaseItemArtist> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QReleaseItemArtist(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QReleaseItemArtist(PathMetadata metadata, PathInits inits) {
        this(ReleaseItemArtist.class, metadata, inits);
    }

    public QReleaseItemArtist(Class<? extends ReleaseItemArtist> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.artist = inits.isInitialized("artist") ? new io.dsub.discogs.common.artist.entity.QArtist(forProperty("artist")) : null;
        this.releaseItem = inits.isInitialized("releaseItem") ? new QReleaseItem(forProperty("releaseItem")) : null;
    }

}

