package io.dsub.discogs.common.master.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMasterVideo is a Querydsl query type for MasterVideo
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QMasterVideo extends EntityPathBase<MasterVideo> {

    private static final long serialVersionUID = -65164567L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QMasterVideo masterVideo = new QMasterVideo("masterVideo");

    public final io.dsub.discogs.common.entity.QBaseTimeEntity _super = new io.dsub.discogs.common.entity.QBaseTimeEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final StringPath description = createString("description");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> lastModifiedAt = _super.lastModifiedAt;

    public final QMaster master;

    public final StringPath title = createString("title");

    public final StringPath url = createString("url");

    //inherited
    public final NumberPath<Long> version = _super.version;

    public QMasterVideo(String variable) {
        this(MasterVideo.class, forVariable(variable), INITS);
    }

    public QMasterVideo(Path<? extends MasterVideo> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QMasterVideo(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QMasterVideo(PathMetadata metadata, PathInits inits) {
        this(MasterVideo.class, metadata, inits);
    }

    public QMasterVideo(Class<? extends MasterVideo> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.master = inits.isInitialized("master") ? new QMaster(forProperty("master")) : null;
    }

}

