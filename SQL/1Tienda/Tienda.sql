DROP DATABASE IF EXISTS tienda;
CREATE DATABASE tienda CHARACTER SET utf8mb4;
USE tienda;

CREATE TABLE fabricante (
  id INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
  nombre VARCHAR(100) NOT NULL
);

CREATE TABLE producto (
  id INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
  nombre VARCHAR(100) NOT NULL,
  precio DOUBLE NOT NULL,
  id_fabricante INT UNSIGNED NOT NULL,
  FOREIGN KEY (id_fabricante) REFERENCES fabricante(id)
);

INSERT INTO fabricante VALUES(1, 'Asus');
INSERT INTO fabricante VALUES(2, 'Lenovo');
INSERT INTO fabricante VALUES(3, 'Hewlett-Packard');
INSERT INTO fabricante VALUES(4, 'Samsung');
INSERT INTO fabricante VALUES(5, 'Seagate');
INSERT INTO fabricante VALUES(6, 'Crucial');
INSERT INTO fabricante VALUES(7, 'Gigabyte');
INSERT INTO fabricante VALUES(8, 'Huawei');
INSERT INTO fabricante VALUES(9, 'Xiaomi');

INSERT INTO producto VALUES(1, 'Disco duro SATA3 1TB', 86.99, 5);
INSERT INTO producto VALUES(2, 'Memoria RAM DDR4 8GB', 120, 6);
INSERT INTO producto VALUES(3, 'Disco SSD 1 TB', 150.99, 4);
INSERT INTO producto VALUES(4, 'GeForce GTX 1050Ti', 185, 7);
INSERT INTO producto VALUES(5, 'GeForce GTX 1080 Xtreme', 755, 6);
INSERT INTO producto VALUES(6, 'Monitor 24 LED Full HD', 202, 1);
INSERT INTO producto VALUES(7, 'Monitor 27 LED Full HD', 245.99, 1);
INSERT INTO producto VALUES(8, 'Portátil Yoga 520', 559, 2);
INSERT INTO producto VALUES(9, 'Portátil Ideapd 320', 444, 2);
INSERT INTO producto VALUES(10, 'Impresora HP Deskjet 3720', 59.99, 3);
INSERT INTO producto VALUES(11, 'Impresora HP Laserjet Pro M26nw', 180, 3);








select nombre from producto;
select nombre, precio from producto;
select * from producto;
select nombre, precio, precio * 1.17 as "precio en dolares" from producto;
select nombre as "nombre de producto", precio as "euros", precio * 1.17 as "dolares" from producto;
select upper(nombre) as "nombre en mayuscula", precio from producto;
select lower(nombre) as "nombre en minuscula", precio from producto;
select nombre, upper(substring(nombre, 1, 2)) as "iniciales" from fabricante;
select nombre, round(precio, 2) as "precio redondeado" from producto;
select nombre, truncate(precio, 0) as "precio sin decimal" from producto;
select id_fabricante from producto;
select distinct id_fabricante from producto;
select nombre from fabricante order by nombre;
select nombre from fabricante order by nombre DESC;
select nombre, precio from producto order by nombre, precio DESC;
select * from fabricante limit 0,5;
select * from fabricante limit 3,2;
select nombre, precio from producto order by precio limit 1;
select nombre, precio from producto order by precio DESC limit 1;
select nombre, id_fabricante from producto where id_fabricante = 2;
select nombre, precio from producto where precio <= 120;
select nombre, precio from producto where precio >= 400;
select nombre, precio from producto where not precio >= 400;
select * from producto where precio >=80 && precio <= 300;
select * from producto where precio between 80 and 200;
select * from producto where precio > 200 && id_fabricante = 6;
select * from producto where id_fabricante = 1 || id_fabricante = 3 || id_fabricante = 5;
select * from producto where id_fabricante in (1, 3, 5);
select nombre, precio * 100 as "centimos" from producto;
select nombre from fabricante where nombre like "S%";
select nombre from fabricante where nombre like "%E";
select nombre from fabricante where nombre like "%W%";
select nombre from fabricante where nombre like "____";
select nombre from producto where nombre like "%Portátil%";
select nombre from producto where nombre like "%Monitor%" && precio < 215;
select nombre, precio from producto where precio >= 180 order by precio DESC, nombre;
