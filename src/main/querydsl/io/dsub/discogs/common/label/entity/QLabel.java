package io.dsub.discogs.common.label.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QLabel is a Querydsl query type for Label
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QLabel extends EntityPathBase<Label> {

    private static final long serialVersionUID = 40724052L;

    public static final QLabel label = new QLabel("label");

    public final io.dsub.discogs.common.entity.QBaseTimeEntity _super = new io.dsub.discogs.common.entity.QBaseTimeEntity(this);

    public final StringPath contactInfo = createString("contactInfo");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final StringPath dataQuality = createString("dataQuality");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> lastModifiedAt = _super.lastModifiedAt;

    public final StringPath name = createString("name");

    public final StringPath profile = createString("profile");

    //inherited
    public final NumberPath<Long> version = _super.version;

    public QLabel(String variable) {
        super(Label.class, forVariable(variable));
    }

    public QLabel(Path<? extends Label> path) {
        super(path.getType(), path.getMetadata());
    }

    public QLabel(PathMetadata metadata) {
        super(Label.class, metadata);
    }

}

