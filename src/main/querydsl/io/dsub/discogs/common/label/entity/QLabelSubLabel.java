package io.dsub.discogs.common.label.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QLabelSubLabel is a Querydsl query type for LabelSubLabel
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QLabelSubLabel extends EntityPathBase<LabelSubLabel> {

    private static final long serialVersionUID = -1225920760L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QLabelSubLabel labelSubLabel = new QLabelSubLabel("labelSubLabel");

    public final io.dsub.discogs.common.entity.QBaseTimeEntity _super = new io.dsub.discogs.common.entity.QBaseTimeEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> lastModifiedAt = _super.lastModifiedAt;

    public final QLabel parent;

    public final QLabel subLabel;

    //inherited
    public final NumberPath<Long> version = _super.version;

    public QLabelSubLabel(String variable) {
        this(LabelSubLabel.class, forVariable(variable), INITS);
    }

    public QLabelSubLabel(Path<? extends LabelSubLabel> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QLabelSubLabel(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QLabelSubLabel(PathMetadata metadata, PathInits inits) {
        this(LabelSubLabel.class, metadata, inits);
    }

    public QLabelSubLabel(Class<? extends LabelSubLabel> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.parent = inits.isInitialized("parent") ? new QLabel(forProperty("parent")) : null;
        this.subLabel = inits.isInitialized("subLabel") ? new QLabel(forProperty("subLabel")) : null;
    }

}

