package io.dsub.discogs.common.label.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QLabelUrl is a Querydsl query type for LabelUrl
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QLabelUrl extends EntityPathBase<LabelUrl> {

    private static final long serialVersionUID = 2029540987L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QLabelUrl labelUrl = new QLabelUrl("labelUrl");

    public final io.dsub.discogs.common.entity.QBaseTimeEntity _super = new io.dsub.discogs.common.entity.QBaseTimeEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final QLabel label;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> lastModifiedAt = _super.lastModifiedAt;

    public final StringPath url = createString("url");

    //inherited
    public final NumberPath<Long> version = _super.version;

    public QLabelUrl(String variable) {
        this(LabelUrl.class, forVariable(variable), INITS);
    }

    public QLabelUrl(Path<? extends LabelUrl> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QLabelUrl(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QLabelUrl(PathMetadata metadata, PathInits inits) {
        this(LabelUrl.class, metadata, inits);
    }

    public QLabelUrl(Class<? extends LabelUrl> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.label = inits.isInitialized("label") ? new QLabel(forProperty("label")) : null;
    }

}

