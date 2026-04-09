/*1. */
insert into profesorado values (1, 'NURIA', 'ANERO GONZALEZ', '58328033X', 'MATEMATICAS', '1972-02-22', 9);

/*2. */
insert into profesorado values (2, 'MARIA LUISA', 'FABRE BERDUN', '52203423X', 'TECNOLOGIA', '1979-02-21', 2);

/*3. */
update cursos set cod_profe = 4 where codigo = 1;


/*8. */
insert into alumnado (Nombre, Apellidos, Sexo, Fecha_Nac) select Nombre, Apellidos, Sexo, Fecha_Nac from alumnado_nuevo;

