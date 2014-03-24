# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table news (
  id                        bigint not null,
  header                    varchar(255),
  constraint pk_news primary key (id))
;

create table account (
  email                     varchar(255) not null,
  name                      varchar(255),
  password                  varchar(255),
  constraint pk_account primary key (email))
;

create sequence news_seq;

create sequence account_seq;




# --- !Downs

drop table if exists news cascade;

drop table if exists account cascade;

drop sequence if exists news_seq;

drop sequence if exists account_seq;

