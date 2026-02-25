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
    where cdequipo = 
    (select cdequipo from juego where nombre = "elvenar");
        
/*6. */
select juego.*, equipo.nombre, equipo.comunidad
	from juego 
    inner join equipo
    on juego.cdequipo = equipo.cdequipo
    where juego.cdequipo = (select cdequipo from juego where nombre = "elvenar");
    
/*7. */
select concursante.nombre, participa.*
	from concursante
    inner join participa
    on concursante.cdconcur = participa.cdconcur
    order by cdconcur;
    
/*8. */
select c.cdconcur, c.nombre, 
	ifnull(e.nombre, 'SIN EQUIPO') 'equipo', 
	ifnull(j.nombre, 'SIN JUEGO') 'juego',
    ifnull(p.puntos, 'SIN PUNTOS') 'puntos'
	from concursante c
    left join equipo e 
    on c.cdequipo = e.cdequipo
    left join juego j
    on c.cdequipo = j.cdequipo
    left join participa p
    on j.cdjuego = p.cdjuego;
    
/*9. */
select concursante.nombre, concursante.cdconcur, round(avg(participa.puntos), 2)
	from concursante
    inner join participa
    on concursante.cdconcur = participa.cdconcur
    group by concursante.cdconcur, concursante.nombre;
    
/*10. */
select concursante.nombre, concursante.cdconcur, 
	round(avg(participa.puntos), 2) 'media', 
	idolo.cdconcur, idolo.nombre
	from concursante
    inner join participa
    on concursante.cdconcur = participa.cdconcur
    left join concursante idolo
    on concursante.cdidolo = idolo.cdconcur 
    GROUP BY concursante.nombre, concursante.cdconcur, idolo.cdconcur, idolo.nombre 
    order by 3 desc
    LIMIT 5;

/**/