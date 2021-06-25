package io.dsub.discogs.common.master.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMasterStyle is a Querydsl query type for MasterStyle
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QMasterStyle extends EntityPathBase<MasterStyle> {

    private static final long serialVersionUID = -67587041L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QMasterStyle masterStyle = new QMasterStyle("masterStyle");

    public final io.dsub.discogs.common.entity.QBaseTimeEntity _super = new io.dsub.discogs.common.entity.QBaseTimeEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> lastModifiedAt = _super.lastModifiedAt;

    public final QMaster master;

    public final io.dsub.discogs.common.style.entity.QStyle style;

    //inherited
    public final NumberPath<Long> version = _super.version;

    public QMasterStyle(String variable) {
        this(MasterStyle.class, forVariable(variable), INITS);
    }

    public QMasterStyle(Path<? extends MasterStyle> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QMasterStyle(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QMasterStyle(PathMetadata metadata, PathInits inits) {
        this(MasterStyle.class, metadata, inits);
    }

    public QMasterStyle(Class<? extends MasterStyle> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.master = inits.isInitialized("master") ? new QMaster(forProperty("master")) : null;
        this.style = inits.isInitialized("style") ? new io.dsub.discogs.common.style.entity.QStyle(forProperty("style")) : null;
    }

}

