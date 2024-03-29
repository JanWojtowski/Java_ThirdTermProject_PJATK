create table anime (episodes integer, mal_id integer, year integer, id bigserial not null, rank bigint, rating varchar(255), season varchar(255), status varchar(255), title varchar(255), title_english varchar(255), title_japanese varchar(255), url varchar(255), primary key (id));
create table anime_genres (anime_id bigint not null, genres_id bigint not null);
create table anime_studios (anime_id bigint not null, studios_id bigint not null);
create table genre (id bigserial not null, mal_id bigint not null, name varchar(255), type varchar(255), url varchar(255), primary key (id));
create table studio (id bigserial not null, mal_id bigint not null, name varchar(255), type varchar(255), url varchar(255), primary key (id));
alter table if exists anime_genres add constraint FK7dauwimrka5a2dnc2195f5whq foreign key (genres_id) references genre;
alter table if exists anime_genres add constraint FKorrk6ybv1u14qh4bd1tndm125 foreign key (anime_id) references anime;
alter table if exists anime_studios add constraint FK1uhasaqf03urbq34vq36jdpor foreign key (studios_id) references studio;
alter table if exists anime_studios add constraint FKqb9vo4fy4r3y9csl1j3lqc9gy foreign key (anime_id) references anime;