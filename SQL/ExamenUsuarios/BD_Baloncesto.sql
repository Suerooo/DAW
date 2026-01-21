create database if not exists Baloncesto;
use Baloncesto;

drop table if exists Clases;
create table Clases(
codigo char(3) primary key not null, /* Está formado por 4 letras mayúsculas, los únicos valores que puede tener este atributo son los que se han dado de alta */
grupo varchar(20) not null, /* Los únicos valores que puede tener este atributo son los que se han dado de alta */
nombre_tutor varchar(40), /* Los únicos valores que puede tener este atributo son los que se han dado de alta */
puntuacion int unsigned, /* Dos puntos por cada partido ganado*/
capitan char(7)
);

drop table if exists Puestos;
create table Puestos( /* Los únicos registros que puede tener la tabla son los que se han dado de alta */
codigo tinyint(3) primary key not null auto_increment, /* Está formado por 4 letras minúsculas, los únicos valores que puede tener este atributo son los que se han dado de alta */
nombre varchar(10) not null, /* Los únicos valores que puede tener este atributo son los que se han dado de alta */
descripcion text null
);

drop table if exists Jugadores;
create table Jugadores(
codalumno char(7) primary key not null,
nombre varchar(20) not null,
apellido varchar(20) not null,
tantos_marcados smallint unsigned default 0, 
puesto tinyint(3) not null,
clase char(3) not null,
foreign key(clase) references baloncesto.clases(codigo),
foreign key (puesto) references baloncesto.puestos(codigo)
);

/* Ahora vamos a insertar los datos en las tablas */

insert into clases VALUES ("E1A","1 ESO A","FEDERICO PEREZ",6,"E1A137"),
                         ("E1B","1 ESO B","TERESA CANO",2,"E1B015"),
						 ("E2A","2 ESO A","JAVIER GONZALEZ",0,"E2A422"),
						 ("E2B","2 ESO B","PATRICIA SANCHEZ",4,"E2B327");

/* No pueden tener otro valor que no esté en esta relación */

insert into puestos set nombre = "BASE";   -- SON 1
insert into puestos set nombre = "ALERO";    -- SON 2
insert into puestos set nombre = "ALA-PIVOT";  -- SON 2
insert into puestos set nombre = "PIVOT";   -- SON 1
insert into puestos set nombre = "ESCOLTA";   -- SON 1

INSERT INTO jugadores VALUES ("E2A666","MEPHISTO","ROZCO",16,3,"E2A"),
                             ("E2A766","MERLIN","WIZARD",16,3,"E2A"),
                             ("E2A655","MORGANA","PENDRAGON",16,1,"E2A"),
                             ("E2A676","MELQUIADES","BUHO",20,2,"E2A"),
							               ("E2A686","GIOVANNI","BERTUCCIO",16,5,"E2A"),
							               ("E2A606","ANNA","KARENINA",16,1,"E2A"),
							               ("E2A696","AL","DEGEA",16,4,"E2A"),
                             ("E1A777","ALEPH","ONSO",16,3,"E1A"),
                             ("E1A666","OLGA","SCOTT",16,3,"E1A"),
                             ("E1A888","PAUVAR","ELA",16,1,"E1A"),
                             ("E1A776","MELVIN","SQUIRRELS",20,1,"E1A"),
							               ("E1A689","JOHNNY","BERTO",16,5,"E1A"),
							               ("E1A603","ENRIQUE","ALFARERO",16,2,"E1A"),
							               ("E1A016","ALBUS","DEKA",16,4,"E1A"),							               
							               ("E2B666","EMMET","BROWN",16,3,"E2B"),
                             ("E2B626","PHIL","LIP",16,3,"E2B"),
                             ("E2B636","LINUS","STROMBERG",16,1,"E2B"),
                             ("E2B676","PAUL","FONTOFTHE",20,2,"E2B"),
							               ("E2B686","ANGEL","BIGTABLES",16,5,"E2B"),
							               ("E2B606","OSKAR","KRUM",16,1,"E2B"),
							               ("E2B696","TITTO","LOPEZ",16,4,"E2B"),
							               ("E1B777","RUCH","WORTH",16,3,"E1B"),
                             ("E1B666","ALF","MELMAC",16,3,"E1B"),
                             ("E1B996","NAZARIUS","FLINT",16,1,"E1B"),
                             ("E1B776","MELVIN","MCFLY",20,2,"E1B"),
							               ("E1B689","LORDDARTH","VADER",16,1,"E1B"),
							               ("E1B603","DRACO","MALFOY",16,1,"E1B"),
							               ("E1B016","SEVERIUS","STUKA",16,4,"E1B");							 