# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table news (
  id                        bigint not null,
  header                    varchar(255),
  short_text                varchar(255),
  text                      varchar(255),
  date                      timestamp,
  constraint pk_news primary key (id))
;

create table picture (
  id                        bigint not null,
  name                      varchar(255),
  news_letter_id            bigint,
  constraint pk_picture primary key (id))
;

create table account (
  email                     varchar(255) not null,
  name                      varchar(255),
  password                  varchar(255),
  constraint pk_account primary key (email))
;

create sequence news_seq;

create sequence picture_seq;

create sequence account_seq;

alter table picture add constraint fk_picture_newsLetter_1 foreign key (news_letter_id) references news (id);
create index ix_picture_newsLetter_1 on picture (news_letter_id);



# --- !Downs

drop table if exists news cascade;

drop table if exists picture cascade;

drop table if exists account cascade;

drop sequence if exists news_seq;

drop sequence if exists picture_seq;

drop sequence if exists account_seq;

