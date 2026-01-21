set role all;
show grants;

alter table amigos rename to amigo;
create table fechas (
	fecha datetime primary key
);
drop table amigos;
select amigos.nombre;