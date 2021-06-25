package io.dsub.discogs.common.release.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QReleaseItemStyle is a Querydsl query type for ReleaseItemStyle
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QReleaseItemStyle extends EntityPathBase<ReleaseItemStyle> {

    private static final long serialVersionUID = 1669815050L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QReleaseItemStyle releaseItemStyle = new QReleaseItemStyle("releaseItemStyle");

    public final io.dsub.discogs.common.entity.QBaseTimeEntity _super = new io.dsub.discogs.common.entity.QBaseTimeEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> lastModifiedAt = _super.lastModifiedAt;

    public final QReleaseItem releaseItem;

    public final io.dsub.discogs.common.style.entity.QStyle style;

    //inherited
    public final NumberPath<Long> version = _super.version;

    public QReleaseItemStyle(String variable) {
        this(ReleaseItemStyle.class, forVariable(variable), INITS);
    }

    public QReleaseItemStyle(Path<? extends ReleaseItemStyle> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QReleaseItemStyle(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QReleaseItemStyle(PathMetadata metadata, PathInits inits) {
        this(ReleaseItemStyle.class, metadata, inits);
    }

    public QReleaseItemStyle(Class<? extends ReleaseItemStyle> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.releaseItem = inits.isInitialized("releaseItem") ? new QReleaseItem(forProperty("releaseItem")) : null;
        this.style = inits.isInitialized("style") ? new io.dsub.discogs.common.style.entity.QStyle(forProperty("style")) : null;
    }

}

