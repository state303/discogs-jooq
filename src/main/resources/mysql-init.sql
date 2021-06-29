create table if not exists artist
(
    id               bigint auto_increment
        primary key,
    created_at       timestamp                  not null,
    last_modified_at timestamp                  not null,
    data_quality     varchar(255) charset utf8  null,
    name             varchar(1000) charset utf8 null,
    profile          longtext                   null,
    real_name        varchar(2000) charset utf8 null
);

create table if not exists artist_alias
(
    id               bigint auto_increment
        primary key,
    created_at       timestamp not null,
    last_modified_at timestamp not null,
    alias_id         bigint    not null,
    artist_id        bigint    not null,
    constraint uq_artist_alias_artist_id_alias_id
        unique (artist_id, alias_id),
    constraint fk_artist_alias_alias_id_artist
        foreign key (alias_id) references artist (id),
    constraint fk_artist_alias_artist_id_artist
        foreign key (artist_id) references artist (id)
);

create table if not exists artist_group
(
    id               bigint auto_increment
        primary key,
    created_at       timestamp not null,
    last_modified_at timestamp not null,
    artist_id        bigint    not null,
    group_id         bigint    not null,
    constraint uq_artist_group_artist_id_group_id
        unique (artist_id, group_id),
    constraint fk_artist_group_artist_id_artist
        foreign key (artist_id) references artist (id),
    constraint fk_artist_group_group_id_artist
        foreign key (group_id) references artist (id)
);

create table if not exists artist_member
(
    id               bigint auto_increment
        primary key,
    created_at       timestamp not null,
    last_modified_at timestamp not null,
    artist_id        bigint    not null,
    member_id        bigint    not null,
    constraint uq_artist_member_artist_id_member_id
        unique (artist_id, member_id),
    constraint fk_artist_member_artist_id_artist
        foreign key (artist_id) references artist (id),
    constraint fk_artist_member_member_id_artist
        foreign key (member_id) references artist (id)
);

create table if not exists artist_name_variation
(
    id               bigint auto_increment
        primary key,
    created_at       timestamp                  not null,
    hash             int                        not null,
    last_modified_at timestamp                  not null,
    name_variation   varchar(2000) charset utf8 not null,
    artist_id        bigint                     not null,
    constraint uq_artist_name_variation_artist_id_hash
        unique (artist_id, hash),
    constraint fk_artist_name_variation_artist_id_artist
        foreign key (artist_id) references artist (id)
);

create table if not exists artist_url
(
    id               bigint auto_increment
        primary key,
    created_at       timestamp                  not null,
    last_modified_at timestamp                  not null,
    hash             int                        not null,
    url              varchar(5000) charset utf8 not null,
    artist_id        bigint                     not null,
    constraint uq_artist_url_artist_id_hash
        unique (artist_id, hash),
    constraint fk_artist_url_artist_id_artist
        foreign key (artist_id) references artist (id)
);

create table if not exists genre
(
    name varchar(255) charset utf8 not null
        primary key
);

create table if not exists label
(
    id               bigint auto_increment
        primary key,
    created_at       timestamp                 not null,
    last_modified_at timestamp                 not null,
    contact_info     longtext                  null,
    data_quality     varchar(255) charset utf8 null,
    name             varchar(255) charset utf8 null,
    profile          longtext                  null
);

create table if not exists label_sub_label
(
    id               bigint auto_increment
        primary key,
    created_at       timestamp not null,
    last_modified_at timestamp not null,
    parent_label_id  bigint    not null,
    sub_label_id     bigint    not null,
    constraint uq_label_sub_label_parent_label_id_sub_label_id
        unique (parent_label_id, sub_label_id),
    constraint fk_label_sub_label_parent_label_id_label
        foreign key (parent_label_id) references label (id),
    constraint fk_label_sub_label_sub_label_id_label
        foreign key (sub_label_id) references label (id)
);

create table if not exists label_url
(
    id               bigint auto_increment
        primary key,
    created_at       timestamp     not null,
    last_modified_at timestamp     not null,
    hash             int           not null,
    url              varchar(5000) not null,
    label_id         bigint        not null,
    constraint uq_label_url_label_id_hash
        unique (label_id, hash),
    constraint fk_label_url_label_id_label
        foreign key (label_id) references label (id)
);

create table if not exists master
(
    id               bigint auto_increment
        primary key,
    created_at       timestamp                  not null,
    last_modified_at timestamp                  not null,
    data_quality     varchar(255) charset utf8  null,
    title            varchar(2000) charset utf8 null,
    year             smallint                   null,
    main_release_id  bigint                     null
);

create table if not exists master_artist
(
    id               bigint auto_increment
        primary key,
    created_at       timestamp not null,
    last_modified_at timestamp not null,
    artist_id        bigint    not null,
    master_id        bigint    not null,
    constraint uq_master_artist_master_id_artist_id
        unique (master_id, artist_id),
    constraint fk_master_artist_artist_id_artist
        foreign key (artist_id) references artist (id),
    constraint fk_master_artist_master_id_master
        foreign key (master_id) references master (id)
);

create table if not exists master_genre
(
    id               bigint auto_increment
        primary key,
    created_at       timestamp                 not null,
    last_modified_at timestamp                 not null,
    genre            varchar(255) charset utf8 not null,
    master_id        bigint                    not null,
    constraint uq_master_genre_master_id_genre
        unique (master_id, genre),
    constraint fk_master_genre_genre_genre
        foreign key (genre) references genre (name),
    constraint fk_master_genre_master_id_master
        foreign key (master_id) references master (id)
);

create table if not exists master_video
(
    id               bigint auto_increment
        primary key,
    created_at       timestamp                   not null,
    last_modified_at timestamp                   not null,
    hash             int                         not null,
    description      varchar(15000) charset utf8 null,
    title            varchar(1000) charset utf8  null,
    url              varchar(1000) charset utf8  null,
    master_id        bigint                      not null,
    constraint uq_master_video_master_id_hash
        unique (master_id, hash),
    constraint fk_master_video_master_id_master
        foreign key (master_id) references master (id)
);

create table if not exists release_item
(
    id                  bigint auto_increment
        primary key,
    created_at          timestamp                   not null,
    last_modified_at    timestamp                   not null,
    country             varchar(255) charset utf8   null,
    data_quality        varchar(255) charset utf8   null,
    has_valid_day       bit                         null,
    has_valid_month     bit                         null,
    has_valid_year      bit                         null,
    is_master           bit                         null,
    master_id           bigint                      null,
    listed_release_date varchar(255) charset utf8   null,
    notes               text                        null,
    release_date        date                        null,
    status              varchar(255) charset utf8   null,
    title               varchar(10000) charset utf8 null,
    constraint fk_release_item_master_id_master
        foreign key (master_id) references master (id)
);

create table if not exists label_item_release
(
    id                bigint auto_increment
        primary key,
    created_at        timestamp                 not null,
    last_modified_at  timestamp                 not null,
    category_notation varchar(255) charset utf8 null,
    label_id          bigint                    not null,
    release_item_id   bigint                    not null,
    constraint uq_label_item_release_release_item_id_label_id
        unique (release_item_id, label_id),
    constraint fk_label_release_label_id_label
        foreign key (label_id) references label (id),
    constraint fk_label_release_release_item_id_release_item
        foreign key (release_item_id) references release_item (id)
);

alter table master
    add constraint fk_master_main_release_id_release_item
        foreign key (main_release_id) references release_item (id);

create table if not exists release_item_artist
(
    id               bigint auto_increment
        primary key,
    created_at       timestamp not null,
    last_modified_at timestamp not null,
    artist_id        bigint    not null,
    release_item_id  bigint    not null,
    constraint uq_release_item_artist_release_item_id_artist_id
        unique (release_item_id, artist_id),
    constraint fk_release_item_artist_artist_id_artist
        foreign key (artist_id) references artist (id),
    constraint fk_release_item_artist_release_item_id_release_item
        foreign key (release_item_id) references release_item (id)
);

create table if not exists release_item_credited_artist
(
    id               bigint auto_increment
        primary key,
    created_at       timestamp                   not null,
    last_modified_at timestamp                   not null,
    hash             int                         not null,
    role             varchar(20000) charset utf8 null,
    artist_id        bigint                      not null,
    release_item_id  bigint                      not null,
    constraint uq_release_item_credited_artist_release_item_id_artist_id_hash
        unique (release_item_id, artist_id, hash),
    constraint fk_release_item_credited_artist_artist_id_artist
        foreign key (artist_id) references artist (id),
    constraint fk_release_item_credited_artist_release_item_id_release_item
        foreign key (release_item_id) references release_item (id)
);

create table if not exists release_item_format
(
    id               bigint auto_increment
        primary key,
    created_at       timestamp                   not null,
    last_modified_at timestamp                   not null,
    hash             int                         not null,
    description      varchar(10000) charset utf8 null,
    name             varchar(255) charset utf8   null,
    quantity         bigint                      null,
    text             varchar(5000) charset utf8  null,
    release_item_id  bigint                      not null,
    constraint uq_release_item_format_release_item_id_hash
        unique (release_item_id, hash),
    constraint fk_release_item_format_release_item_id_release_item
        foreign key (release_item_id) references release_item (id)
);

create table if not exists release_item_genre
(
    id               bigint auto_increment
        primary key,
    created_at       timestamp                 not null,
    last_modified_at timestamp                 not null,
    genre            varchar(255) charset utf8 not null,
    release_item_id  bigint                    not null,
    constraint uq_release_item_genre_release_item_id_genre
        unique (release_item_id, genre),
    constraint fk_release_item_genre_genre_genre
        foreign key (genre) references genre (name),
    constraint fk_release_item_genre_release_item_id_release_item
        foreign key (release_item_id) references release_item (id)
);

create table if not exists release_item_identifier
(
    id               bigint auto_increment
        primary key,
    created_at       timestamp not null,
    last_modified_at timestamp not null,
    hash             int       not null,
    description      longtext  null,
    type             longtext  null,
    value            longtext  null,
    release_item_id  bigint    not null,
    constraint uq_release_item_identifier_release_item_id_hash
        unique (release_item_id, hash),
    constraint fk_release_item_identifier_release_item_id_release_item
        foreign key (release_item_id) references release_item (id)
);

create table if not exists release_item_image
(
    id               bigint auto_increment
        primary key,
    created_at       timestamp not null,
    last_modified_at timestamp not null,
    hash             int       not null,
    file_name        longtext  null,
    release_item_id  bigint    not null,
    constraint uq_release_item_image_release_item_id_hash
        unique (release_item_id, hash),
    constraint fk_release_item_image_release_item_id_release_item
        foreign key (release_item_id) references release_item (id)
);

create table if not exists release_item_track
(
    id               bigint auto_increment
        primary key,
    created_at       timestamp not null,
    last_modified_at timestamp not null,
    hash             int       not null,
    duration         longtext  null,
    position         longtext  null,
    title            longtext  null,
    release_item_id  bigint    not null,
    constraint uq_release_item_track_release_item_id_hash
        unique (release_item_id, hash),
    constraint fk_release_item_track_release_item_id_release_item
        foreign key (release_item_id) references release_item (id)
);

create table if not exists release_item_video
(
    id               bigint auto_increment
        primary key,
    created_at       timestamp not null,
    last_modified_at timestamp not null,
    hash             int       not null,
    description      longtext  null,
    title            longtext  null,
    url              longtext  null,
    release_item_id  bigint    not null,
    constraint uq_release_item_video_release_item_id_hash
        unique (release_item_id, hash),
    constraint fk_release_item_video_release_item_id_release_item
        foreign key (release_item_id) references release_item (id)
);

create table if not exists release_item_work
(
    id               bigint auto_increment
        primary key,
    created_at       timestamp                  not null,
    last_modified_at timestamp                  not null,
    hash             int                        not null,
    work             varchar(5000) charset utf8 null,
    label_id         bigint                     not null,
    release_item_id  bigint                     not null,
    constraint uq_release_item_work_release_item_id_label_id_hash
        unique (release_item_id, label_id, hash),
    constraint fk_release_item_work_label_id_label
        foreign key (label_id) references label (id),
    constraint fk_release_item_work_release_item_id_release_item
        foreign key (release_item_id) references release_item (id)
);

create table if not exists style
(
    name varchar(255) charset utf8 not null
        primary key
);

create table if not exists master_style
(
    id               bigint auto_increment
        primary key,
    created_at       timestamp                 not null,
    last_modified_at timestamp                 not null,
    master_id        bigint                    not null,
    style            varchar(255) charset utf8 not null,
    constraint uq_master_style_master_id_style
        unique (master_id, style),
    constraint fk_master_style_master_id_master
        foreign key (master_id) references master (id),
    constraint fk_master_style_style_style
        foreign key (style) references style (name)
);

create table if not exists release_item_style
(
    id               bigint auto_increment
        primary key,
    created_at       timestamp                 not null,
    last_modified_at timestamp                 not null,
    release_item_id  bigint                    not null,
    style            varchar(255) charset utf8 not null,
    constraint uq_release_item_style_release_item_id_style
        unique (release_item_id, style),
    constraint fk_release_item_style_release_item_id_release_item
        foreign key (release_item_id) references release_item (id),
    constraint fk_release_item_style_style_style
        foreign key (style) references style (name)
);