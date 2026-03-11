/*4. */
select count(i.CodEmpleado) "numReparaciones", e.Apellidos, e.Nombre
	from empleados e
    inner join intervienen i
    on i.CodEmpleado = e.CodEmpleado
    group by i.CodEmpleado
    order by 1 DESC;
    
/*5. */
select e.nombre, r.fechaentrada, r.fechasalida, date_add(r.fechaentrada, interval 2 day) as SalidaPrevista
	from intervienen i
	inner join reparaciones r
    on r.IdReparacion = i.IdReparacion
    inner join empleados e
    on e.CodEmpleado = i.CodEmpleado
    where r.FechaSalida > date_add(r.fechaentrada, interval 2 day);
    
/*6. */
select e.nombre, e.categoria
	from empleados e
    inner join intervienen i
    on i.CodEmpleado = e.CodEmpleado
    group by i.CodEmpleado;
    
select r.matricula, r.km, v.marca, v.modelo, v.color
	from reparaciones r
    inner join vehiculos v
    on v.Matricula = r.Matricula
    order by r.km DESC
    limit 1;
    
select count(referencia)
	from actuaciones
    where importe > (select avg(importe) from actuaciones);
    
select r.IdReparacion, nombre, nombre, r.avería, r.fechaentrada, r.fechasalida 
	from reparaciones r
    left join clientes c
    on 
    
select r.idreparacion, r.avería, r.fechaentrada, 
	ifnull(re.IdRecambio, "***") recambio, 
    ifnull(re.descripcion, "no necestio recambio") descripcion
	from recambios re
    right join incluyen i
    on re.IdRecambio = i.IdRecambio
    right join reparaciones r
    on i.IdReparacion = r.IdReparacion
    where month(r.fechaentrada) = 1
    and year(r.fechaentrada) = 2011;