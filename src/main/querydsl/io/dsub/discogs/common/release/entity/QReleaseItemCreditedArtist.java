package io.dsub.discogs.common.release.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QReleaseItemCreditedArtist is a Querydsl query type for ReleaseItemCreditedArtist
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QReleaseItemCreditedArtist extends EntityPathBase<ReleaseItemCreditedArtist> {

    private static final long serialVersionUID = 702152070L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QReleaseItemCreditedArtist releaseItemCreditedArtist = new QReleaseItemCreditedArtist("releaseItemCreditedArtist");

    public final io.dsub.discogs.common.entity.QBaseTimeEntity _super = new io.dsub.discogs.common.entity.QBaseTimeEntity(this);

    public final io.dsub.discogs.common.artist.entity.QArtist artist;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> lastModifiedAt = _super.lastModifiedAt;

    public final QReleaseItem releaseItem;

    public final StringPath role = createString("role");

    //inherited
    public final NumberPath<Long> version = _super.version;

    public QReleaseItemCreditedArtist(String variable) {
        this(ReleaseItemCreditedArtist.class, forVariable(variable), INITS);
    }

    public QReleaseItemCreditedArtist(Path<? extends ReleaseItemCreditedArtist> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QReleaseItemCreditedArtist(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QReleaseItemCreditedArtist(PathMetadata metadata, PathInits inits) {
        this(ReleaseItemCreditedArtist.class, metadata, inits);
    }

    public QReleaseItemCreditedArtist(Class<? extends ReleaseItemCreditedArtist> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.artist = inits.isInitialized("artist") ? new io.dsub.discogs.common.artist.entity.QArtist(forProperty("artist")) : null;
        this.releaseItem = inits.isInitialized("releaseItem") ? new QReleaseItem(forProperty("releaseItem")) : null;
    }

}

