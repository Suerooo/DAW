/*41. */
select codcoche 
	from distribucion d inner join concesionario c
    on d.cifc = c.cifc
    and ciudad like 'barcelona';

/*42. */    
select ch.codcoche, ch.nombre, ch.modelo
	from distribucion d inner join concesionario c inner join coches ch
    on d.cifc = c.cifc and d.codcoche = ch.codcoche
    and c.ciudad like 'barcelona';
    
/*43. */    
select ventas.color
	from ventas inner join concesionario
	on ventas.cifc = concesionario.cifc
    where concesionario.nombre like 'acar';

/*44. */
select codcoche
	from ventas inner join clientes
    on ventas.dni = clientes.dni
    where clientes.ciudad like 'madrid';
    
/*45. */
select coches.codcoche, coches.nombre, coches.modelo
	from ventas inner join clientes inner join coches
    on ventas.dni = clientes.dni and ventas.codcoche = coches.codcoche
    where clientes.ciudad like 'madrid';

/*46. */
select coches.codcoche, coches.nombre, coches.modelo
	from ventas inner join clientes inner join coches
    on ventas.dni = clientes.dni and ventas.codcoche = coches.codcoche
    where clientes.ciudad like 'madrid';

/*47. */
select clientes.nombre, clientes.apellidos
	from clientes inner join ventas blanco
	on clientes.dni = blanco.dni
    and b.color like 'blanco'
    inner join ventas rojo
    on clientes.dni = rojo.dni
    and r.color like 'rojo';
    
/*48. */
select coches.nombre, coches.modelo
	from coches 
    inner join ventas
    on coches.codcoche = ventas.codcoche
    inner join concesionario
    on concesionario.cifc = ventas.cifc
    and concesionario.ciudad like 'barcelona'; 
    
/*49. */
select clientes.nombre, clientes.apellidos
	from clientes
    inner join ventas
    on clientes.dni = ventas.dni
    inner join concesionario
    on concesionario.cifc = ventas.cifc
    and concesionario.nombre like 'dcar';
    
/*50. */
select ventas.codcoche 'codcoche', clientes.nombre 'nombre cliente', 
	clientes.ciudad 'ciudad cliente', concesionario.nombre 'nombre concesionario',
    concesionario.ciudad 'ciudad concesionario'
	from clientes
    inner join ventas
    on clientes.dni = ventas.dni
    and clientes.ciudad like 'madrid'
    inner join concesionario
    on concesionario.cifc = ventas.cifc
    and concesionario.ciudad like 'madrid';

/*51. */    
select clientes.*
	from clientes
    inner join ventas
    on clientes.dni = ventas.dni
    inner join concesionario
    on concesionario.cifc = ventas.cifc
    inner join distribucion
    on distribucion.cifc = concesionario.cifc and distribucion.cantidad >= 1
    inner join coches
    on distribucion.codcoche = coches.codcoche and coches.modelo like 'gti';
    
/*52. */
select clientes.nombre, clientes.apellidos, clientes.ciudad
	from clientes
    inner join ventas
    on ventas.dni = clientes.dni
    inner join concesionario
    on concesionario.cifc = ventas.cifc and concesionario.ciudad like 'madrid'
    inner join distribucion
    on distribucion.cifc = concesionario.cifc and distribucion.cantidad >= 1
    inner join coches
    on coches.codcoche = distribucion.codcoche and coches.modelo like 'gti';

/*53. */
select ventas.codcoche
	from ventas
    inner join clientes
    on clientes.dni = ventas.dni
    inner join concesionario
    on concesionario.cifc = ventas.cifc
    and clientes.ciudad = concesionario.ciudad;

/*54. */
select ventas.codcoche
	from ventas
    inner join clientes
    on clientes.dni = ventas.dni
    inner join concesionario
    on concesionario.cifc = ventas.cifc
    and clientes.ciudad <> concesionario.ciudad;
    
/*55. */
select marcas.cifm, clientes.dni 
	from clientes
    inner join marcas
    on marcas.ciudad = clientes.ciudad;
   
/*56. */
select marcas1.nombre, marcas2.nombre 
	from marcas marcas1
    inner join marcas marcas2
    on marcas1.ciudad = marcas2.ciudad
    and marcas1.nombre < marcas2.nombre;