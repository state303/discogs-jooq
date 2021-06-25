package io.dsub.discogs.common.genre.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QGenre is a Querydsl query type for Genre
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QGenre extends EntityPathBase<Genre> {

    private static final long serialVersionUID = 1675708084L;

    public static final QGenre genre = new QGenre("genre");

    public final io.dsub.discogs.common.entity.QBaseEntity _super = new io.dsub.discogs.common.entity.QBaseEntity(this);

    public final StringPath name = createString("name");

    //inherited
    public final NumberPath<Long> version = _super.version;

    public QGenre(String variable) {
        super(Genre.class, forVariable(variable));
    }

    public QGenre(Path<? extends Genre> path) {
        super(path.getType(), path.getMetadata());
    }

    public QGenre(PathMetadata metadata) {
        super(Genre.class, metadata);
    }

}

