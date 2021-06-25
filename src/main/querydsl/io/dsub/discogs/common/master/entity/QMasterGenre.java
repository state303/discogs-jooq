package io.dsub.discogs.common.master.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMasterGenre is a Querydsl query type for MasterGenre
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QMasterGenre extends EntityPathBase<MasterGenre> {

    private static final long serialVersionUID = -79126543L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QMasterGenre masterGenre = new QMasterGenre("masterGenre");

    public final io.dsub.discogs.common.entity.QBaseTimeEntity _super = new io.dsub.discogs.common.entity.QBaseTimeEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final io.dsub.discogs.common.genre.entity.QGenre genre;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> lastModifiedAt = _super.lastModifiedAt;

    public final QMaster master;

    //inherited
    public final NumberPath<Long> version = _super.version;

    public QMasterGenre(String variable) {
        this(MasterGenre.class, forVariable(variable), INITS);
    }

    public QMasterGenre(Path<? extends MasterGenre> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QMasterGenre(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QMasterGenre(PathMetadata metadata, PathInits inits) {
        this(MasterGenre.class, metadata, inits);
    }

    public QMasterGenre(Class<? extends MasterGenre> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.genre = inits.isInitialized("genre") ? new io.dsub.discogs.common.genre.entity.QGenre(forProperty("genre")) : null;
        this.master = inits.isInitialized("master") ? new QMaster(forProperty("master")) : null;
    }

}

