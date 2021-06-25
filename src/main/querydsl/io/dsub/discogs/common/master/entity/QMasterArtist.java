package io.dsub.discogs.common.master.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMasterArtist is a Querydsl query type for MasterArtist
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QMasterArtist extends EntityPathBase<MasterArtist> {

    private static final long serialVersionUID = 1682445977L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QMasterArtist masterArtist = new QMasterArtist("masterArtist");

    public final io.dsub.discogs.common.entity.QBaseTimeEntity _super = new io.dsub.discogs.common.entity.QBaseTimeEntity(this);

    public final io.dsub.discogs.common.artist.entity.QArtist artist;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> lastModifiedAt = _super.lastModifiedAt;

    public final QMaster master;

    //inherited
    public final NumberPath<Long> version = _super.version;

    public QMasterArtist(String variable) {
        this(MasterArtist.class, forVariable(variable), INITS);
    }

    public QMasterArtist(Path<? extends MasterArtist> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QMasterArtist(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QMasterArtist(PathMetadata metadata, PathInits inits) {
        this(MasterArtist.class, metadata, inits);
    }

    public QMasterArtist(Class<? extends MasterArtist> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.artist = inits.isInitialized("artist") ? new io.dsub.discogs.common.artist.entity.QArtist(forProperty("artist")) : null;
        this.master = inits.isInitialized("master") ? new QMaster(forProperty("master")) : null;
    }

}

