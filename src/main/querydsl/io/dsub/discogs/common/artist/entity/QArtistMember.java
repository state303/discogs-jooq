package io.dsub.discogs.common.artist.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QArtistMember is a Querydsl query type for ArtistMember
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QArtistMember extends EntityPathBase<ArtistMember> {

    private static final long serialVersionUID = -1648310410L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QArtistMember artistMember = new QArtistMember("artistMember");

    public final io.dsub.discogs.common.entity.QBaseTimeEntity _super = new io.dsub.discogs.common.entity.QBaseTimeEntity(this);

    public final QArtist artist;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> lastModifiedAt = _super.lastModifiedAt;

    public final QArtist member;

    //inherited
    public final NumberPath<Long> version = _super.version;

    public QArtistMember(String variable) {
        this(ArtistMember.class, forVariable(variable), INITS);
    }

    public QArtistMember(Path<? extends ArtistMember> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QArtistMember(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QArtistMember(PathMetadata metadata, PathInits inits) {
        this(ArtistMember.class, metadata, inits);
    }

    public QArtistMember(Class<? extends ArtistMember> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.artist = inits.isInitialized("artist") ? new QArtist(forProperty("artist")) : null;
        this.member = inits.isInitialized("member") ? new QArtist(forProperty("member")) : null;
    }

}

