select * from concesionario;

select * from clientes where ciudad="Madrid";

select nombre from coches order by nombre;

select cifc from distribucion where cantidad > 18;

select cifc from distribucion where cantidad between 10 and 18;

select cifc from distribucion where cantidad >= 10 && cantidad <= 18; 

select cifc from distribucion where cantidad > 10 || cantidad < 5;

select codcoche, nombre from coches where nombre like "C%";

select cifc from distribucion where cantidad is not null;

select cifm, nombre from marcas where ciudad like "_I%";

select cifc, codcoche, cantidad, cantidad + 5 as "nueva cantidad" from distribucion where codcoche = 6;