create user raul1 identified by 'raul1';

create user raul2 identified by 'raul2';
grant all on tienda_virtual.* to 'raul2';
grant select, update on tienda_virtual.producto to 'raul1';

create user raul3 identified by 'raul3';
grant all on tienda_virtual.* to 'raul3';
revoke insert on tienda_virtual.* from 'raul3';

create user raul4 identified by 'raul4'
	with max_queries_per_hour 20 
	max_updates_per_hour 10 
	max_connections_per_hour 5 
	max_user_connections 2;
grant all on tienda_virtual.tienda to 'raul4';
set password for 'raul4' = 'raul44';
