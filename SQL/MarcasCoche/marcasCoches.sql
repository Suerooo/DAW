create database marcas_de_coches;
use marcas_de_coches;

create table marcas (
	cifm int primary key,
    nombre varchar(15),
    ciudad varchar(20)
);

create table clientes(
	dni varchar(9) primary key,
    nombre varchar(15),
    apellidos varchar(30),
    ciudad varchar(20)
);

create table coches (
	codcoche int primary key,
    nombre varchar(15),
    modelo varchar(15),
    cifm int,
    constraint coc_cif_fk foreign key(cifm) references marcas(cifm)
);

create table concesionario(
	cifc int primary key,
    nombre varchar(15),
    ciudad varchar(20)
);

create table distribucion (
	cifc int,
    codcoche int,
    cantidad int,
    constraint dis_cod_fk foreign key (codcoche) references coches(codcoche),
    constraint dis_cif_fk foreign key (cifc) references concesionario(cifc),
    constraint dis_cif_cod_pk primary key(cifc, codcoche)
);

create table ventas (
	cifc int,
    dni varchar(9),
    codcoche int,
    color varchar(10),
    constraint ven_cod_fk foreign key(codcoche) references coches(codcoche),
    constraint ven_dni_fk foreign key (dni) references clientes(dni),
    constraint ven_cif_fk foreign key (cifc) references concesionario(cifc),
    constraint ven_cif_cod_pk primary key (cifc, codcoche)
);
