create database academia;

use academia;

create table profesor(
	nombre varchar(255),
    apellido_paterno varchar(255),
    apellido_materno varchar(255),
    nif varchar(255),
    direccion varchar(255),
    titulacion varchar(255),
    salario decimal(10,2) not null,
    constraint pro_nif_pk primary key(nif),
    constraint pro_nom_apep_apem_uni unique(nombre, apellido_paterno, apellido_materno)
);

create table curso (
	nombre_curso varchar(255),
    codigo_curso int unsigned not null auto_increment,
    nif varchar(255),
    numero_alumno tinyint unsigned,
    fecha_inicio date,
    fecha_final date,
    duracion_hora int unsigned not null,
    constraint cur_cod_pk primary key(codigo_curso),
    constraint cur_nif_fk foreign key(nif) references profesor(nif),
    constraint cur_nom_uni unique(nombre_curso),
    constraint cur_fec_che check(fecha_final >= fecha_inicio)
); 

create table alumno(
	nombre varchar(255),
    apellido_paterno varchar(255),
    apellido_materno varchar(255),
    nif varchar(255),
    direccion varchar(255),
    sexo enum('H', 'M'),
    fecha_nacimiento date,
    codigo_curso int unsigned,
    constraint alu_nif_pk primary key(nif),
    constraint alu_cod_fk foreign key(codigo_curso) references curso(codigo_curso)    
);