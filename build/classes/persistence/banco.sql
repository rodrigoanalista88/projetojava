drop database if exists aulagit;

create database aulagit;

use aulagit;

create table produto(
	id integer auto_increment primary key,
	nome varchar(40) not null,
	preco double(10,2) not null
);

desc produto;