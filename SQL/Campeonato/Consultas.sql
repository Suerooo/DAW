select cdconcur, nombre, fecha_inscri, cuota_inscri
	where cuota_inscri between (50, 100)
    and year(cuota_inscri) = year(2019)
    and month(cuota_inscri) between (month(3, 9))
    order by cuota_inscri;