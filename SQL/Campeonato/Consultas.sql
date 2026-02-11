/*1a. */
select cdconcur as codigo, nombre as jugador, fecha_inscri as fecha, cuota_inscri as cuota
	from concursante
	where cuota_inscri between 50 and 100
    and year(fecha_inscri) = 2019
    and month(fecha_inscri) between 3 and 9
    and sexo = "H"
    order by cuota_inscri DESC;

/*1b. */
select cdconcur as codigo, nombre as jugador, fecha_inscri as fecha, cuota_inscri as cuota
	from concursante
	where cuota_inscri >= 50 and cuota_inscri <= 100
    and year(fecha_inscri) = 2019
    and month(fecha_inscri) >= 3 and month(fecha_inscri) <= 9
    and sexo = "H"
    order by cuota_inscri DESC;

/*2a. */
select * 
	from equipo
    where comunidad in ("andalucia", "murcia", "galicia")
    and anio_funda = 2019
    order by comunidad;
    
/*2b. */
select * 
	from equipo
    where (comunidad = "andalucia" or comunidad = "murcia" or comunidad = "galicia")
    and anio_funda = 2019
    order by comunidad;
    
/*3. */
select * from juego where megusta in 
	(select max(megusta) from juego);
    
/*4. */
select * 
	from juego
	join equipo
    on juego.cdequipo = equipo.cdequipo
    and juego.megusta is not null
    and equipo.nombre is not null;
    
/*5. */
select * 
	from juego 
    where cdequipo in 
    (select cdequipo from juego where nombre = "elvenar");