# SQL – DAW

![MySQL](https://img.shields.io/badge/MySQL-Base%20de%20Datos-lightblue?style=for-the-badge)
![Curso](https://img.shields.io/badge/curso-1º%20DAW-green?style=for-the-badge)
![Estado](https://img.shields.io/badge/estado-en%20desarrollo-blue?style=for-the-badge)

Carpeta dedicada a los **ejercicios, prácticas y exámenes de bases de datos** realizados durante el curso **1º de Desarrollo de Aplicaciones Web (DAW)**, centrados en **MySQL**.

Aquí se incluyen:

- Modelos de bases de datos en **MySQL Workbench** (`.mwb`).
- Scripts SQL (`.sql`) de creación, inserción y modificación.
- Enunciados y exámenes en formato **PDF**.

El objetivo es practicar desde el **diseño de modelos entidad–relación** hasta la **implementación y manipulación de bases de datos** en MySQL.

---

## 📂 Estructura de la carpeta `SQL/`

Dentro de `SQL/` encontrarás varias carpetas, cada una asociada a una base de datos o proyecto:

- **`TiendaVirtual/`**  
  Modelado y scripts de una base de datos para una tienda online.

- **`Academia/`**  
  Base de datos para una academia (alumnos, cursos, matrículas, etc.).

- **`RestauranteMouro/`** (u otros proyectos similares)  
  Bases de datos para contextos concretos (reservas, pedidos, clientes…).

Cada carpeta de proyecto suele incluir:

- Ficheros **`.mwb`** – modelo de la base de datos en MySQL Workbench.
- Ficheros **`.sql`** – scripts para crear, modificar o poblar la base de datos.
- (Opcional) Carpeta **`Examen/`** – ejercicios y scripts asociados a pruebas evaluables.

> Nota: Los nombres exactos de las carpetas y archivos pueden variar ligeramente según el ejercicio o la práctica.

---

## 🧱 Ejemplo de estructura: carpeta de Examen

En algunos proyectos hay una carpeta `Examen/` con:

- `crea_peliculas_raul.mwb`  
  Modelo de la base de datos de ejemplo (p. ej. una base de datos de películas).

- `crea_peliculas_raul.sql`  
  Script de **creación** de la base de datos y sus tablas.

- `modifica_peliculas_raul.sql`  
  Script con **modificaciones** sobre el esquema o datos (ALTER, UPDATE, INSERT, etc.).

- `examen.pdf`  
  Enunciado del examen o práctica evaluable, donde se definen los requisitos de la base de datos y las operaciones a realizar.

Este patrón se repite con otros nombres de examen o proyecto.

---

## 🧰 Contenidos habituales

Aunque cada carpeta/proyecto es distinto, normalmente se trabajan estos bloques:

- **Diseño de bases de datos**
  - Identificación de entidades y relaciones.
  - Modelado con diagramas E/R (en `.mwb`).
  - Normalización básica.

- **Definición de datos (DDL)**
  - Creación de bases de datos y tablas (`CREATE DATABASE`, `CREATE TABLE`).
  - Definición de claves primarias y foráneas.
  - Modificación de estructuras (`ALTER TABLE`).

- **Manipulación de datos (DML)**
  - Inserción de datos (`INSERT`).
  - Actualización (`UPDATE`).
  - Borrado (`DELETE`).

- **Consultas (SELECT)**
  - Selección simple.
  - Filtros con `WHERE`.
  - Ordenación (`ORDER BY`).
  - Agrupaciones (`GROUP BY`, `HAVING`).
  - Joins entre tablas.

---

## ▶️ Cómo usar los archivos de SQL

1. **Requisitos recomendados**
   - **MySQL 8 o superior**.
   - Cliente SQL:
     - MySQL Workbench, DBeaver, phpMyAdmin o similar.

2. **Modelos (`.mwb`)**
   - Abrir los archivos `.mwb` con **MySQL Workbench**.
   - Revisar el diagrama entidad–relación.
   - (Opcional) Generar el script a partir del modelo si fuera necesario.

3. **Scripts (`.sql`)**
   - Abrir el archivo en tu cliente SQL.
   - Ejecutar primero los scripts de **creación** (por ejemplo, los que empiezan por `crea_`).
   - Después, ejecutar los scripts de **modificación** o de **población de datos** (por ejemplo, los que empiezan por `modifica_`).

4. **Exámenes (`examen.pdf`)**
   - Leer el enunciado.
   - Usar los modelos y scripts asociados como base para resolver las tareas:
     - Crear la base de datos.
     - Aplicar cambios.
     - Realizar consultas solicitadas.

---

## 🎯 Objetivo de esta carpeta

Esta carpeta sirve como:

- **Material de estudio** de bases de datos para 1º DAW.
- **Repositorio de prácticas** de modelado y SQL.
- **Banco de exámenes y ejercicios** para repasar y autoevaluarte.

Puedes usar los modelos, scripts y PDFs para:

- Practicar diseño y normalización.
- Repetir consultas y operaciones SQL típicas de examen.
- Comparar tus soluciones con las ya implementadas.

---

## 🚧 Estado

**En desarrollo.**  
Se irán añadiendo nuevos proyectos, exámenes y mejoras a medida que avance el curso y se completen más prácticas de bases de datos.
