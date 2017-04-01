drop database if exists bestbuy;
create database if not exists bestbuy;

use bestbuy;

drop table if exists requests;

create table if not exists requests(
id int not null auto_increment primary key comment 'unique id of a request',
user_name varchar(100) not null comment 'name of a user',
store_id int not null comment 'unique id of a store',
product_id int not null comment 'unique id of a product',
request_accept tinyint(2) default 0 not null comment '0 is not accepted by any blueshirt, 1 is accepted',
by_blueshirt_id int not null comment 'unique id of a blueshirt'
);