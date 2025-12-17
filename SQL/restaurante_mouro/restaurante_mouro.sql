create database restaurante_mouro;

use restaurante_mouro;

create table empleados(
	dni varchar(9),
    nombre varchar(20) not null,
    apellidos varchar(20) not null,
    direccion varchar(20),
    ciudad varchar(20),
    telefono varchar(13) ,
    cp varchar(5),
    fecha_alta date not null default(current_date()),
    categoria varchar(20),
    salario int unsigned,
    constraint emp_dni_pk primary key (dni),
    constraint emp_sal_che check(salario >= 0)
);

create table cocineros (
	dni varchar(9),
    puesto varchar(20) not null,
    especialidad varchar(20),
	constraint coc_dni_pk primary key (dni),
    constraint coc_dni_fk foreign key (dni) references empleados(dni)
);

create table administracion (
	dni varchar(9),
    cargo varchar(20) not null,
    constraint adm_dni_pk primary key (dni),
    constraint adm_dni_fk foreign key (dni) references empleados(dni)
);

create table camareros (
	dni varchar(9),
    turno varchar(20),
    años tinyint unsigned default 0,
    dni_encargado varchar(9),
    constraint cam_dni_pk primary key (dni),
    constraint cam_dni_fk foreign key (dni) references empleados(dni),
    constraint cam_dnie_fk foreign key (dni_encargado) references camareros(dni),
    constraint cam_ani_che check (años >= 0),
    constraint cam_tur_che check (turno in ('mañana', 'tarde', 'noche'))
);

create table comederos (
	codigo_comedero varchar(20),
    nombre varchar(20) not null,
    capacidad tinyint unsigned, 
    numero_mesas tinyint unsigned,
    localizacion varchar(20),
    constraint com_cod_pk primary key (codigo_comedero),
    constraint com_cap_che check (capacidad >= 0),
    constraint com_num_che check (numero_mesas >= 0)
);

create table mesas (
	codigo_mesa varchar(20),
    codigo_comedero varchar(20),
    numero_asientos tinyint unsigned,
    dni_camarero varchar(9),
    constraint mes_codm_codc_pk primary key (codigo_mesa, codigo_comedero),
    constraint mes_dni_fk foreign key (dni_camarero) references camarero(dni),
    constraint mes_num_che check (numero_asientos >= 0)
);

create table reservas (
	numero_reserva varchar(20),
    fecha_reserva datetime default (current_date()) not null,
    nombre varchar(20) not null,
    fecha_reservada datetime default (current_date()) not null,
    comida varchar(20),
    numero_personas tinyint unsigned,
    varios tinyint unsigned,
    constraint res_numr_pk primary key (numero_reserva),
    constraint mes_nump_che check (numero_personas >= 0),
    constraint mes_var_che check (varios >= 0)
);

create table hacen (
	codigo_mesa varchar(20),
    codigo_comedero varchar(20),
    numero_reserva varchar(20),
    numero_asientos tinyint unsigned,
    constraint hac_codm_codc_numr_pr primary key (codigo_mesa, codigo_comedero, numero_reserva),
    constraint hac_codm_fk foreign key (codigo_mesa) references mesas(codigo_mesa),
    constraint hac_codc_fk foreign key (codigo_comedero) references camareros(codigo_comedero),
    constraint hac_numr_fk foreign key (numero_asientos) references reservas(numero_asientos),
    constraint hac_numa_che check (numero_asientos >= 0)
);

create table facturas (
    
);