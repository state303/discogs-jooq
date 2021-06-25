package io.dsub.discogs.common.artist.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QArtistUrl is a Querydsl query type for ArtistUrl
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QArtistUrl extends EntityPathBase<ArtistUrl> {

    private static final long serialVersionUID = -1234430445L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QArtistUrl artistUrl = new QArtistUrl("artistUrl");

    public final io.dsub.discogs.common.entity.QBaseTimeEntity _super = new io.dsub.discogs.common.entity.QBaseTimeEntity(this);

    public final QArtist artist;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> lastModifiedAt = _super.lastModifiedAt;

    public final StringPath url = createString("url");

    //inherited
    public final NumberPath<Long> version = _super.version;

    public QArtistUrl(String variable) {
        this(ArtistUrl.class, forVariable(variable), INITS);
    }

    public QArtistUrl(Path<? extends ArtistUrl> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QArtistUrl(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QArtistUrl(PathMetadata metadata, PathInits inits) {
        this(ArtistUrl.class, metadata, inits);
    }

    public QArtistUrl(Class<? extends ArtistUrl> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.artist = inits.isInitialized("artist") ? new QArtist(forProperty("artist")) : null;
    }

}

