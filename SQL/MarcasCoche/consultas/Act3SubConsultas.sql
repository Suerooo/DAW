select distinct dni from ventas where cifc in (select cifc from concesionario where ciudad like 'MADRID');

select codcoche from distribucion where cifc in (select cifc from concesionario where ciudad like 'BARCELONA');

select color from ventas where cifc in (select cifc from concesionario where nombre like 'ACAR');

select codcoche from ventas where dni in (select dni from clientes where ciudad like 'MADRID');

select codcoche from ventas where cifc in (select cifc from concesionario where ciudad like 'MADRID');

select nombre, apellidos from clientes where dni < (select dni from clientes where nombre like 'juan' and apellidos like 'martin'); 

select nombre, apellidos from clientes where dni < all (select (dni) from clientes where ciudad like 'barcelona');

select nombre, apellidos from clientes where nombre like 'A%' and dni > all (select dni from clientes where ciudad like 'madrid');

select nombre, apellidos from clientes where nombre like 'A%' and dni > any (select dni from clientes where ciudad like 'madrid');

select nombre, apellidos from clientes where nombre like 'A%' and (dni > any (select dni from clientes where ciudad like 'madrid') or dni < all (select dni from clientes where ciudad like 'valencia'));

select nombre, apellidos from clientes where dni in (select dni from ventas where color like 'blanco' and color like 'rojo');

select dni from clientes where ciudad = (select max(ciudad) from concesionario);

select nombre, modelo from coches where codcoche in (select codcoche from ventas where cifc in (select cifc from concesionario where ciudad like 'barcelona'));

select nombre, apellidos from clientes where dni in (select dni from ventas where cifc in (select cifc from concesionario where nombre like 'dcar'));

select nombre, apellidos from clientes where dni in (select dni from ventas where color like 'blanco' and codcoche in (select codcoche from coches where modelo like 'gti'));

select codcoche from ventas where dni in (select dni from clientes where ciudad like 'madrid') and cifc in (select cifc from concesionario where ciudad like 'madrid');

select nombre, apellidos, ciudad from clientes where dni in (select dni from ventas where cifc in (select cifc from concesionario where cifc in (select cifc from distribucion where cantidad >= 1 and codcoche in (select codcoche from coches where modelo like 'gti'))));

select cifc, nombre from concesionario where ciudad not like 'madrid' and cifc in (select cifc from distribucion group by cifc having avg(cantidad) >= all (select avg(cantidad) from distribucion group by cifc));

select nombre from clientes where dni not in (select dni from ventas where color like 'rojo' and cifc in (select cifc from concesionario where ciudad like 'madrid'));