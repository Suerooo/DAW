create database tienda_virtual;

use tienda_virtual;

create table familia(
cod_familia numeric(3) not null,
deno_familia varchar(50) not null,
constraint fam_cod_pk primary key (cod_familia),
constraint fam_deno_unique unique (deno_familia)
);

create table producto(
cod_producto numeric(5) not null,
deno_producto varchar(20) not null,
descripcion varchar(100),
precio_base decimal(8,2) not null,
porc_reposicion numeric(3),
unidades_minimas numeric(4) not null,
cod_familia numeric (3) not null,
constraint pro_cod_PK primary key (cod_producto),
constraint pro_pre_che check(precio_base > 0),
constraint pro_por_che check(porc_reposicion > 0),
constraint pro_uni_che check(unidades_minimas > 0),
constraint pro_cod_FK foreign key (cod_familia) references familia(cod_familia)
);

create table tienda(
    cod_tienda numeric(3) not null,
    deno_tienda varchar(20) not null,
    telefono varchar(11),
    codigo_postal varchar(5) not null,
    provincia varchar(5) not null,
    constraint tie_cod_PK primary key (cod_tienda)
);

create table stock(
	cod_tienda numeric(3) not null,
    cod_producto numeric(5) not null,
    unidades numeric(6) not null,
    constraint sto_codt_codp_PK primary key (cod_tienda, cod_producto),
    constraint sto_codt_FK foreign key (cod_tienda) references tienda(cod_tienda),
    constraint sto_codp_FK foreign key (cod_producto) references producto(cod_producto),
    constraint sto_uni_che check(unidades >= 0)
);

alter table stock add fecha_ultima_entrada datetime default(now());
alter table stock add beneficio decimal (2,1);

alter table producto drop descripcion;
alter table producto add perecedero enum('S', 'N');
alter table producto modify deno_producto varchar(50) not null;

alter table familia add iva decimal(2,2);

alter table tienda add constraint tie_sto_uni unique(codigo_postal);

rename table stock to prodxtiendas;

alter table producto drop foreign key pro_cod_FK;
alter table producto drop cod_familia;
drop table familia;