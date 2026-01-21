create role entrenador;
grant create on *.* to entrenador;
grant insert, select on baloncesto.* to entrenador;

create user raul_ae1;
grant entrenador to raul_ae1;
set default role all to raul_ae1;

grant drop, references on *.* to entrenador;
grant create user, alter on *.* to entrenador with grant option;

grant super on *.* to raul_ae1;