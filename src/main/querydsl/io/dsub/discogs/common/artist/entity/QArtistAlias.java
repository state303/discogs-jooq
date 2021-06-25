package io.dsub.discogs.common.artist.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QArtistAlias is a Querydsl query type for ArtistAlias
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QArtistAlias extends EntityPathBase<ArtistAlias> {

    private static final long serialVersionUID = -895332876L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QArtistAlias artistAlias = new QArtistAlias("artistAlias");

    public final io.dsub.discogs.common.entity.QBaseTimeEntity _super = new io.dsub.discogs.common.entity.QBaseTimeEntity(this);

    public final QArtist alias;

    public final QArtist artist;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> lastModifiedAt = _super.lastModifiedAt;

    //inherited
    public final NumberPath<Long> version = _super.version;

    public QArtistAlias(String variable) {
        this(ArtistAlias.class, forVariable(variable), INITS);
    }

    public QArtistAlias(Path<? extends ArtistAlias> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QArtistAlias(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QArtistAlias(PathMetadata metadata, PathInits inits) {
        this(ArtistAlias.class, metadata, inits);
    }

    public QArtistAlias(Class<? extends ArtistAlias> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.alias = inits.isInitialized("alias") ? new QArtist(forProperty("alias")) : null;
        this.artist = inits.isInitialized("artist") ? new QArtist(forProperty("artist")) : null;
    }

}

