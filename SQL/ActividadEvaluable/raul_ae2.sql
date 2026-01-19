set role all;
show grants;

alter table amigos rename to amigo;
create table fechas (
	fecha datetime primary key
);
select amigos.nombre;