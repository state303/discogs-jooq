package io.dsub.discogs.common.artist.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QArtistNameVariation is a Querydsl query type for ArtistNameVariation
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QArtistNameVariation extends EntityPathBase<ArtistNameVariation> {

    private static final long serialVersionUID = -1278294164L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QArtistNameVariation artistNameVariation = new QArtistNameVariation("artistNameVariation");

    public final io.dsub.discogs.common.entity.QBaseTimeEntity _super = new io.dsub.discogs.common.entity.QBaseTimeEntity(this);

    public final QArtist artist;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> lastModifiedAt = _super.lastModifiedAt;

    public final StringPath name = createString("name");

    //inherited
    public final NumberPath<Long> version = _super.version;

    public QArtistNameVariation(String variable) {
        this(ArtistNameVariation.class, forVariable(variable), INITS);
    }

    public QArtistNameVariation(Path<? extends ArtistNameVariation> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QArtistNameVariation(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QArtistNameVariation(PathMetadata metadata, PathInits inits) {
        this(ArtistNameVariation.class, metadata, inits);
    }

    public QArtistNameVariation(Class<? extends ArtistNameVariation> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.artist = inits.isInitialized("artist") ? new QArtist(forProperty("artist")) : null;
    }

}

