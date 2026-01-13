create user raul1 identified by 'raul1';

create user raul2 identified by 'raul2';
grant all on tienda_virtual.* to 'raul2';
grant select, update on tienda_virtual.producto to 'raul1';

create user raul3 identified by 'raul3';
grant all on tienda_virtual.* to 'raul3';
revoke insert on tienda_virtual.* from 'raul3';
