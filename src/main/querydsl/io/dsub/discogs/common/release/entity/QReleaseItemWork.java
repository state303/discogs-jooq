package io.dsub.discogs.common.release.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QReleaseItemWork is a Querydsl query type for ReleaseItemWork
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QReleaseItemWork extends EntityPathBase<ReleaseItemWork> {

    private static final long serialVersionUID = 746715800L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QReleaseItemWork releaseItemWork = new QReleaseItemWork("releaseItemWork");

    public final io.dsub.discogs.common.entity.QBaseTimeEntity _super = new io.dsub.discogs.common.entity.QBaseTimeEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final io.dsub.discogs.common.label.entity.QLabel label;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> lastModifiedAt = _super.lastModifiedAt;

    public final QReleaseItem releaseItem;

    //inherited
    public final NumberPath<Long> version = _super.version;

    public final StringPath work = createString("work");

    public QReleaseItemWork(String variable) {
        this(ReleaseItemWork.class, forVariable(variable), INITS);
    }

    public QReleaseItemWork(Path<? extends ReleaseItemWork> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QReleaseItemWork(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QReleaseItemWork(PathMetadata metadata, PathInits inits) {
        this(ReleaseItemWork.class, metadata, inits);
    }

    public QReleaseItemWork(Class<? extends ReleaseItemWork> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.label = inits.isInitialized("label") ? new io.dsub.discogs.common.label.entity.QLabel(forProperty("label")) : null;
        this.releaseItem = inits.isInitialized("releaseItem") ? new QReleaseItem(forProperty("releaseItem")) : null;
    }

}

