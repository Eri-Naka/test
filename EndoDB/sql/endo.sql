drop database if exists endo;
create database endo;
use endo;

create table shop(
item_name varchar(255),
price int
);

insert into shop values("apple",120);
insert into shop values("orange",110);
insert into shop values("peach",200);
insert into shop values("grape",250);

