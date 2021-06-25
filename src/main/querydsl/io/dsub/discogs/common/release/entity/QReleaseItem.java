package io.dsub.discogs.common.release.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QReleaseItem is a Querydsl query type for ReleaseItem
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QReleaseItem extends EntityPathBase<ReleaseItem> {

    private static final long serialVersionUID = 1911982823L;

    public static final QReleaseItem releaseItem = new QReleaseItem("releaseItem");

    public final io.dsub.discogs.common.entity.QBaseTimeEntity _super = new io.dsub.discogs.common.entity.QBaseTimeEntity(this);

    public final StringPath country = createString("country");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final StringPath dataQuality = createString("dataQuality");

    public final BooleanPath hasValidDay = createBoolean("hasValidDay");

    public final BooleanPath hasValidMonth = createBoolean("hasValidMonth");

    public final BooleanPath hasValidYear = createBoolean("hasValidYear");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final BooleanPath isMaster = createBoolean("isMaster");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> lastModifiedAt = _super.lastModifiedAt;

    public final StringPath listedReleaseDate = createString("listedReleaseDate");

    public final StringPath notes = createString("notes");

    public final DatePath<java.time.LocalDate> releaseDate = createDate("releaseDate", java.time.LocalDate.class);

    public final StringPath status = createString("status");

    public final StringPath title = createString("title");

    //inherited
    public final NumberPath<Long> version = _super.version;

    public QReleaseItem(String variable) {
        super(ReleaseItem.class, forVariable(variable));
    }

    public QReleaseItem(Path<? extends ReleaseItem> path) {
        super(path.getType(), path.getMetadata());
    }

    public QReleaseItem(PathMetadata metadata) {
        super(ReleaseItem.class, metadata);
    }

}

