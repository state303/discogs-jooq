package io.dsub.discogs.common.style.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QStyle is a Querydsl query type for Style
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QStyle extends EntityPathBase<Style> {

    private static final long serialVersionUID = -344194700L;

    public static final QStyle style = new QStyle("style");

    public final io.dsub.discogs.common.entity.QBaseEntity _super = new io.dsub.discogs.common.entity.QBaseEntity(this);

    public final StringPath name = createString("name");

    //inherited
    public final NumberPath<Long> version = _super.version;

    public QStyle(String variable) {
        super(Style.class, forVariable(variable));
    }

    public QStyle(Path<? extends Style> path) {
        super(path.getType(), path.getMetadata());
    }

    public QStyle(PathMetadata metadata) {
        super(Style.class, metadata);
    }

}

