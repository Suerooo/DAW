create database agenda;

create table amigos (
	id int auto_increment,
    nombre varchar(50),
    telefono numeric(9,0),
    constraint ami_id_pk primary key(id)
);

insert into amigos value (1, 'raul', 922414141);
insert into amigos value (2, 'pedro', 922414141);
insert into amigos value (3, 'amigosamigosjuan', 922414141);

create user 'raul_ae1'@'localhost';
grant select, insert on agenda.* to 'raul_ae1'@'localhost';

create user 'raul_ae2'@'localhost';
grant select, create on *.* to 'raul_ae2'@'localhost';
grant create on agenda.* to 'raul_ae2'@'localhost';
alter user 'raul_ae2'@'localhost' with max_queries_per_hour 25 max_user_connections 2;

create role mantenimiento;
grant alter on *.* to mantenimiento;
grant create, drop on agenda.* to mantenimiento;
grant select(nombre) on agenda.amigos to mantenimiento;

grant mantenimiento to 'raul_ae1'@'localhost';
set default role mantenimiento to 'raul_ae1'@'localhost';
grant mantenimiento to 'raul_ae2'@'localhost';
set default role mantenimiento to 'raul_ae2'@'localhost';