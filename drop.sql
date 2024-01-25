alter table if exists anime_genres drop constraint if exists FK7dauwimrka5a2dnc2195f5whq;
alter table if exists anime_genres drop constraint if exists FKorrk6ybv1u14qh4bd1tndm125;
alter table if exists anime_studios drop constraint if exists FK1uhasaqf03urbq34vq36jdpor;
alter table if exists anime_studios drop constraint if exists FKqb9vo4fy4r3y9csl1j3lqc9gy;
drop table if exists anime cascade;
drop table if exists anime_genres cascade;
drop table if exists anime_studios cascade;
drop table if exists genre cascade;