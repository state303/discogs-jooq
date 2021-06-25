package io.dsub.discogs.common.label.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QLabelRelease is a Querydsl query type for LabelRelease
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QLabelRelease extends EntityPathBase<LabelRelease> {

    private static final long serialVersionUID = 1257263891L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QLabelRelease labelRelease = new QLabelRelease("labelRelease");

    public final io.dsub.discogs.common.entity.QBaseTimeEntity _super = new io.dsub.discogs.common.entity.QBaseTimeEntity(this);

    public final StringPath categoryNotation = createString("categoryNotation");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final QLabel label;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> lastModifiedAt = _super.lastModifiedAt;

    public final io.dsub.discogs.common.release.entity.QReleaseItem releaseItem;

    //inherited
    public final NumberPath<Long> version = _super.version;

    public QLabelRelease(String variable) {
        this(LabelRelease.class, forVariable(variable), INITS);
    }

    public QLabelRelease(Path<? extends LabelRelease> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QLabelRelease(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QLabelRelease(PathMetadata metadata, PathInits inits) {
        this(LabelRelease.class, metadata, inits);
    }

    public QLabelRelease(Class<? extends LabelRelease> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.label = inits.isInitialized("label") ? new QLabel(forProperty("label")) : null;
        this.releaseItem = inits.isInitialized("releaseItem") ? new io.dsub.discogs.common.release.entity.QReleaseItem(forProperty("releaseItem")) : null;
    }

}

