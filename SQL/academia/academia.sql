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

alter table alumno add edad tinyint;
alter table alumno add constraint alu_eda_che check(edad >= 14 and edad <= 65);
alter table alumno modify sexo varchar(1);

alter table curso add constraint cur_dur_che check(duracion_hora in (30, 40, 60));
alter table curso add constraint cur_num_che check(numero_alumno >= 15);

alter table profesor drop direccion;

alter table curso drop constraint cur_nif_fk;
alter table curso drop nif;
alter table profesor drop primary key;

alter table profesor add constraint pro_nom_ape_pk primary key(nombre, apellido_paterno, apellido_materno);
alter table curso add nombre varchar(255);
alter table curso add apellido_paterno varchar(255);
alter table curso add apellido_materno varchar(255);
alter table curso add constraint cur_nom_ape_fk foreign key(nombre, apellido_paterno, apellido_materno) references profesor(nombre, apellido_paterno, apellido_materno);


rename table profesor to tutor;

drop table alumno;