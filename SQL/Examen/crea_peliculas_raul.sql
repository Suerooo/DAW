create database peliculas_raul;

use peliculas_raul;

create table pelicula (
	cip varchar(10),
    titulo varchar(20),
    ano_produccion varchar(20),
    nacionalidad varchar(20),
    presupuesto int unsigned,
    duracion_min int unsigned,
    constraint pel_cip_pk primary key (cip),
    constraint pel_pre_che check (presupuesto >= 0),
    constraint pel_dur_che check (duracion_min >= 0)
);

create table cine (
	cine varchar(20),
    ciudad varchar(20),
    direccion varchar(20),
    provincia varchar(20),
	constraint cin_cin_pro_pk primary key (cine, provincia)
);

create table sala (
	cine varchar(20),
    sala varchar(5),
    aforo tinyint unsigned,
    constraint sal_sal_pk primary key (sala),
    constraint sal_cin_fk foreign key (cine) references cine(cine),
    constraint sal_afo_che check (aforo >= 0)
);

create table proyeccion (
	cine varchar(20),
    sala varchar(5),
    cip varchar(10),
    fecha_estreno varchar(20),
    dias_estreno varchar(20),
    espectadores int unsigned,
    recaudacion int unsigned,
    constraint pro_cin_sal_cip_fec_pk primary key (cine, sala, cip, fecha_estreno),
    constraint pro_cin_fk foreign key (cine) references cine(cine),
    constraint pro_sal_fk foreign key (sala) references sala(sala),
    constraint pro_cip_fk foreign key (cip) references pelicula(cip),
    constraint pro_esp_che check (espectadores >= 0),
    constraint pro_rec_che check (recaudacion >= 0)
);