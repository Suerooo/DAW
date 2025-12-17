/*2.1*/
alter table cine add column web varchar(255) not null;

/*2.2*/
alter table sala drop constraint sal_afo_che;
alter table sala add constraint sal_afo_che check (aforo >= 1 and aforo <= 90);
alter table sala modify aforo tinyint unsigned default(00);

/*2.3*/
alter table proyeccion add constraint pro_fec_che check (fecha_estreno > 01-07-2015);

/*2.4*/
alter table pelicula add constraint pel_nac_che check (nacionalidad in ('España' 'EEUU'));

/*2.5*/
alter table pelicula drop constraint pel_nac_che;

/*2.6*/
alter table proyeccion drop foreign key pro_cip_fk;
alter table proyeccion drop foreign key pro_cin_fk;
alter table proyeccion drop foreign key pro_sal_fk;
alter table proyeccion drop primary key;
alter table proyeccion drop cip;

alter table pelicula drop primary key;
alter table pelicula add constraint pel_tit_ano_pk primary key (titulo, ano_produccion);

alter table proyeccion add titulo varchar(20);
alter table proyeccion add ano_produccion varchar(20);
alter table proyeccion add constraint pro_cin_sal_tit_ano_fec_pk primary key (cine, sala, titulo, ano_produccion, fecha_estreno);
alter table proyeccion add constraint pro_cin_fk foreign key (cine) references cine(cine);
alter table proyeccion add constraint pro_sal_fk foreign key (sala) references sala(sala);
alter table proyeccion add constraint pro_tit_ano_fk foreign key (titulo, ano_produccion) references pelicula(titulo, ano_produccion);

/*2.7*/
create table prov_ccaa (
	provincia varchar(20),
    nombre_comunidad varchar(20),
    constraint pro_pro_pk primary key (provincia)
);

/*2.8*/
alter table cine add constraint cin_pro_fk foreign key (provincia) references prov_ccaa(provincia);