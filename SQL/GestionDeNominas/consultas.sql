/*1. */
select codigo, nombre 
	from departamentos
    order by nombre;
    
/*2. */
select distinct mes, ejercicio
	from just_nominas
    where cod_emp in 
    (select cod_emp from empleados where nombre like "José Luis Pérez");
    
/*3. */
select cuenta, nombre 
	from empleados
    where retencion >= 10;
    
/*4. */
select codigo, nombre 
	from empleados 
    where codigo in 
    (select cod_emp from trabajan where cod_dep in 
    (select codigo from departamentos where nombre like "ventas"))
    order by nombre;
    
/*5. */
select nombre 
	from empleados 
    where codigo in 
    (select cod_emp from trabajan where cod_dep in 
    (select codigo from departamentos where nombre like "Administración"))
    and hijos > 2; 
    
/*6. */
select nombre, cuenta
	from empleados
    where nombre like "a%" or
    nombre like "j%";
    
/*7. */
select count(codigo) as "nº vendedores"
	from empleados 
    where codigo in 
    (select cod_emp from trabajan where cod_dep in 
    (select codigo from departamentos where nombre like "ventas"));
    
/*8. */
select min(nombre), max(nombre)
	from empleados;
    
/*9. */
select nombre, hijos
	from empleados
    where retencion in (8, 10, 12);
    
/*10. */
select hijos, count(codigo)
	from empleados
	group by hijos
    order by 1;
    
/*11. */
select hijos, max(retencion), min(retencion), avg(retencion)
	from empleados
    group by hijos
    order by hijos;
    
/*12. */
select e.nombre, t.funcion
	from trabajan t
    inner join empleados e
    on t.cod_emp = e.codigo
    inner join departamentos d
    on d.codigo = t.cod_dep
    where d.nombre like "marketing";
    
/*13. */
select e.nombre, d.nombre, t.funcion
	from trabajan t
    inner join empleados e
    on t.cod_emp = e.codigo
    inner join departamentos d
    on d.codigo = t.cod_dep
    where e.hijos = 1;
    
/*14. */
select e.nombre, d.nombre, e.hijos
	from trabajan t
    inner join empleados e
    on t.cod_emp = e.codigo
    inner join departamentos d
    on d.codigo = t.cod_dep
    where d.nombre like "recursos humanos" and 
    e.hijos between 1 and 3;
    
/*15. */
select distinct e.nombre, j.mes, j.ejercicio, l.numero, l.cantidad
	from just_nominas j
    inner join empleados e 
    on j.cod_emp = e.codigo
    inner join lineas l
    on l.ejercicio = j.ejercicio and l.mes = j.mes and l.cod_emp = j.cod_emp
    where e.nombre like "Encarna López López";
    
/*16. */
select e.nombre, j.mes, j.ejercicio
	from empleados e
    inner join just_nominas j
    on j.cod_emp = e.codigo
    inner join trabajan t
    on t.cod_emp = e.codigo
    inner join departamentos d
    on d.codigo = t.cod_dep
    where d.nombre like "Dirección";
    
/*17. */
select distinct e.nombre, sum((j.ingreso - j.descuento)) as "sueldo neto"
	from empleados e
    inner join just_nominas j
    on e.codigo = j.cod_emp
    group by j.cod_emp;
    
/*18. */
select e.nombre, sum((j.ingreso - j.descuento)) as "sueldo neto"
	from empleados e
    inner join just_nominas j
    on e.codigo = j.cod_emp
    where j.ejercicio = 2006 and 
    (select sum((j.ingreso - j.descuento)) from just_nominas) > 2000
    group by j.cod_emp;
    
/*19. */
select count(codigo)
	from empleados
    where hijos >
    (select avg(hijos) from empleados);
    
/*20. */
select nombre, hijos
	from empleados e
    where hijos = 
    (select min(hijos) from empleados) or
    hijos = (select max(hijos) from empleados);

/*21. */
select nombre
	from empleados
    where codigo not in 
    (select cod_emp from just_nominas);
    
/*22. */
select nombre, 
	date_format(fnacimiento, '%d / %m / %Y') as fechaCorta,
	date_format(fnacimiento, '%d de %M de %Y') as fechaLarga
	from empleados;

/*23. */
select nombre, timestampdiff(year, fnacimiento, curdate()), hijos
	from empleados
    where timestampdiff(year, fnacimiento, curdate()) > 50 and
    hijos > 0;
    
/*24. */
select e.nombre, timestampdiff(year, e.fnacimiento, curdate()), d.nombre
	from trabajan t
    inner join empleados e
    on t.cod_emp = e.codigo
    inner join departamentos d
    on d.codigo = t.cod_dep
    where (select count(cod_emp) from trabajan) > 1;
    
/*25. */
select e.nombre, timestampdiff(year, e.fnacimiento, curdate()), sum((j.ingreso - j.descuento))
	from empleados e
    inner join just_nominas j
    on j.cod_emp = e.codigo
    where e.fnacimiento = (select max(fnacimiento) from empleados) or
    e.fnacimiento = (select min(fnacimiento) from empleados)
    group by e.codigo;
    
/*26. */
select e.nombre, d.nombre
	from empleados e
    left join trabajan t
    on e.codigo = t.cod_emp
    left join departamentos d
    on d.codigo = t.cod_dep;
    
/*27. */
select e.nombre, d.nombre
	from departamentos d
    right join trabajan t
    on t.cod_dep = d.codigo
    right join empleados e
    on e.codigo = t.cod_emp;
    
/*28. */
select e.nombre, sum((j.ingreso - j.descuento)) as "sueldo neto"
	from just_nominas j
    left join empleados e
    on e.codigo = j.cod_emp
    group by j.cod_emp
    order by 2;