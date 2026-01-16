create database agenda;

create table amigos (
	id int auto_increment,
    nombre varchar(50),
    telefono numeric,
    constraint ami_id_pk primary key(id)
);

insert into amigos values(null, 'Raul Suero', 922414141);
insert into amigos values(null, 'Pepe', 922414141);
insert into amigos values(null, 'Juan', 922414141);

create user 'raul_ae1'@'localhost' identified by 'raul_ae1';