delimiter $$ 
drop procedure if exists llenar;
create procedure llenar(in nombreCoche varchar(15))
begin 
insert into coches_old (codcoche, nombre, modelo, cifm) 
	select codcoche, nombre, modelo, cifm from coches where nombre like nombreCoche;

end $$
delimiter ;

call llenar("Ibiza");