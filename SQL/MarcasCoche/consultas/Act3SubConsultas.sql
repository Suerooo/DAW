select distinct dni from ventas where cifc in (select cifc from concesionario where ciudad like 'MADRID');

select codcoche from distribucion where cifc in (select cifc from concesionario where ciudad like 'BARCELONA');

select color from ventas where cifc in (select cifc from concesionario where nombre like 'ACAR');

select codcoche from ventas where dni in (select dni from clientes where ciudad like 'MADRID');

select codcoche from ventas where cifc in (select cifc from concesionario where ciudad like 'MADRID');