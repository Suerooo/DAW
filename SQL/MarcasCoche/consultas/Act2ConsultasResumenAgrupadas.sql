select count(*) as total from marcas where ciudad="madrid";

select avg(cantidad) as media from distribucion;

select max(dni) as "dni maximo" from clientes where ciudad="madrid";

select min(dni) as "minimo" from ventas where color="blanco";

select cifc, avg(cantidad) as "cantidad media" from distribucion group by cifc;

select cifc, count(*) as "total" from ventas group by cifc;

select cifc, count(*) as "total" from ventas where color="blanco" group by cifc;