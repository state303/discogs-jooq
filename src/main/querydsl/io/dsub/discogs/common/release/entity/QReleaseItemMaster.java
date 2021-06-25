package io.dsub.discogs.common.release.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QReleaseItemMaster is a Querydsl query type for ReleaseItemMaster
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QReleaseItemMaster extends EntityPathBase<ReleaseItemMaster> {

    private static final long serialVersionUID = 35166249L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QReleaseItemMaster releaseItemMaster = new QReleaseItemMaster("releaseItemMaster");

    public final io.dsub.discogs.common.entity.QBaseTimeEntity _super = new io.dsub.discogs.common.entity.QBaseTimeEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> lastModifiedAt = _super.lastModifiedAt;

    public final io.dsub.discogs.common.master.entity.QMaster master;

    public final QReleaseItem releaseItem;

    //inherited
    public final NumberPath<Long> version = _super.version;

    public QReleaseItemMaster(String variable) {
        this(ReleaseItemMaster.class, forVariable(variable), INITS);
    }

    public QReleaseItemMaster(Path<? extends ReleaseItemMaster> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QReleaseItemMaster(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QReleaseItemMaster(PathMetadata metadata, PathInits inits) {
        this(ReleaseItemMaster.class, metadata, inits);
    }

    public QReleaseItemMaster(Class<? extends ReleaseItemMaster> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.master = inits.isInitialized("master") ? new io.dsub.discogs.common.master.entity.QMaster(forProperty("master")) : null;
        this.releaseItem = inits.isInitialized("releaseItem") ? new QReleaseItem(forProperty("releaseItem")) : null;
    }

}

