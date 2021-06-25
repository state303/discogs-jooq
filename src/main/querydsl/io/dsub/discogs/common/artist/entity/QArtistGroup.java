package io.dsub.discogs.common.artist.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QArtistGroup is a Querydsl query type for ArtistGroup
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QArtistGroup extends EntityPathBase<ArtistGroup> {

    private static final long serialVersionUID = -889606621L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QArtistGroup artistGroup = new QArtistGroup("artistGroup");

    public final io.dsub.discogs.common.entity.QBaseTimeEntity _super = new io.dsub.discogs.common.entity.QBaseTimeEntity(this);

    public final QArtist artist;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final QArtist group;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> lastModifiedAt = _super.lastModifiedAt;

    //inherited
    public final NumberPath<Long> version = _super.version;

    public QArtistGroup(String variable) {
        this(ArtistGroup.class, forVariable(variable), INITS);
    }

    public QArtistGroup(Path<? extends ArtistGroup> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QArtistGroup(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QArtistGroup(PathMetadata metadata, PathInits inits) {
        this(ArtistGroup.class, metadata, inits);
    }

    public QArtistGroup(Class<? extends ArtistGroup> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.artist = inits.isInitialized("artist") ? new QArtist(forProperty("artist")) : null;
        this.group = inits.isInitialized("group") ? new QArtist(forProperty("group")) : null;
    }

}

