package io.dsub.discogs.common.artist.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QArtist is a Querydsl query type for Artist
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QArtist extends EntityPathBase<Artist> {

    private static final long serialVersionUID = -1826386500L;

    public static final QArtist artist = new QArtist("artist");

    public final io.dsub.discogs.common.entity.QBaseTimeEntity _super = new io.dsub.discogs.common.entity.QBaseTimeEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final StringPath dataQuality = createString("dataQuality");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> lastModifiedAt = _super.lastModifiedAt;

    public final StringPath name = createString("name");

    public final StringPath profile = createString("profile");

    public final StringPath realName = createString("realName");

    //inherited
    public final NumberPath<Long> version = _super.version;

    public QArtist(String variable) {
        super(Artist.class, forVariable(variable));
    }

    public QArtist(Path<? extends Artist> path) {
        super(path.getType(), path.getMetadata());
    }

    public QArtist(PathMetadata metadata) {
        super(Artist.class, metadata);
    }

}

