#UNIVERSIDAD#

##Ejercicio 1. 
###Alumno
    CREATE TABLE alumno (
    id NUMERIC(6) CONSTRAINT alumno_id_pk PRIMARY KEY,
	nombre VARCHAR (40),
	direccion VARCHAR (40),
	telefono VARCHAR (12)
    );
### Departamento
    CREATE TABLE departamento (
	id NUMERIC (4) CONSTRAINT departamento_id_pk PRIMARY KEY,
	nombre VARCHAR(40)
    );
### Asignatura
    CREATE TABLE asignatura (
	id NUMERIC(6) CONSTRAINT asignatura_id_pk PRIMARY KEY,
	nombre VARCHAR(50),
	num_horas NUMERIC(4) check(num_horas BETWEEN 1 AND 1000),
	precio NUMERIC(7,2),
	deparatamento_id NUMERIC(4)
    );
###Calificacion
    CREATE TABLE calificacion(
	alumno_id NUMERIC(6) ,
	asignatura_id NUMERIC(6),
	CONSTRAINT calificacion_alumno_id_asignatura_id_pk PRIMARY KEY (alumno_id, asignatura_id),
	fecha DATE,
	calificacion NUMERIC(4,2)
    );	
###Demostracion
     List of relations
     Schema |     Name     | Type  | Owner
    --------+--------------+-------+-------
     public | alumno       | table | cesar
     public | asignatura   | table | cesar
     public | calificacion | table | cesar
     public | departamento | table | cesar

###Insertar las claves foraneas


    ALTER TABLE asignatura
    ADD CONSTRAINT asignatura_departamento_id_fk FOREIGN KEY (departamento_id) REFERENCES departamento (id);

    ALTER TABLE calificacion
    ADD CONSTRAINT calificacion_alumno_id_fk FOREIGN KEY (alumno_id) REFERENCES alumno (id);

    ALTER TABLE calificacion
    ADD CONSTRAINT calificacion_asignatura_id_fk FOREIGN KEY (asignatura_id) REFERENCES asignatura (id);


##Ejercicio 2
    INSERT INTO alumno VALUES (1, 'SÁNCHEZ HERMOSILLA, ALBERTO','HIGUERUELAS 12', 654782615);
###Demostracion
     id |           nombre            |   direccion    | telefono
    ----+-----------------------------+----------------+-----------
      1 | SÁNCHEZ HERMOSILLA, ALBERTO | HIGUERUELAS 12 | 654782615

##Ejercicio 3
    INSERT INTO alumno VALUES (2, 'ALBA TORDESILLAS, ANA', 'MARÍA PICASSO 112', 632487559 );
    INSERT INTO alumno VALUES (3, 'TORRES ALMAGRO, GUILLERMO', 'ALCALÁ 415', 651235674 );
    INSERT INTO alumno VALUES (4, 'LLANOS LOPEZ, MARIA LUISA', 'ALCÁNTARA 53', 679254812 );
###Demostracion
     id |           nombre            |     direccion     | telefono
    ----+-----------------------------+-------------------+-----------
      1 | SÁNCHEZ HERMOSILLA, ALBERTO | HIGUERUELAS 12    | 654782615
      2 | ALBA TORDESILLAS, ANA       | MARÍA PICASSO 112 | 632487559
      3 | TORRES ALMAGRO, GUILLERMO   | ALCALÁ 415        | 651235674
      4 | LLANOS LOPEZ, MARIA LUISA   | ALCÁNTARA 53      | 679254812

##Ejercicio 4
    INSERT INTO departamento VALUES (1, 'PROGRAMACIÓN');
    INSERT INTO departamento VALUES (2, 'SISTEMAS OPERATIVOS');
    INSERT INTO departamento VALUES (3, 'BASES DE DATOS');
###Demostracion
     id |       nombre
    ----+---------------------
      1 | PROGRAMACIÓN
      2 | SISTEMAS OPERATIVOS
      3 | BASES DE DATOS

##Ejercicio 5
    INSERT INTO asignatura VALUES (1, 'FUNDAMENTOS DE PROGRAMACION', 120, 350.00, 1);
    INSERT INTO asignatura VALUES (2, 'ELEMENTOS DE HARDWARE', 75, 200.00, 2);
    INSERT INTO asignatura VALUES (3, 'PROGRAMACION AVANZADA EN JAVA', 100, 400.00, 1);
    INSERT INTO asignatura VALUES (4, 'SISTEMAS OPERATIVOS MONOPUESTO', 200, 450.00, 2);
    INSERT INTO asignatura VALUES (5, 'IMPLANTACION DE BASES DE DATOS', 90, 300.00, 3);
    INSERT INTO asignatura VALUES (6, 'BASES DE DATOS NO RELACIONALES', 250, 800.00, 3);

    INSERT INTO calificacion VALUES (2, 4, NULL, NULL);
    INSERT INTO calificacion VALUES (1, 3, NULL, NULL);
    INSERT INTO calificacion VALUES (3, 6, NULL, NULL);
    INSERT INTO calificacion VALUES (1, 2, NULL, NULL);
    INSERT INTO calificacion VALUES (2, 5, NULL, NULL);
    INSERT INTO calificacion VALUES (3, 1, NULL, NULL);
    INSERT INTO calificacion VALUES (3, 4, NULL, NULL);
###Demostracion
        id  |             nombre             | num_horas | precio | deparatamento_id
        ----+--------------------------------+-----------+--------+------------------
          1 | FUNDAMENTOS DE PROGRAMACION    |       120 | 350.00 |                1
          2 | ELEMENTOS DE HARDWARE          |        75 | 200.00 |                2
          3 | PROGRAMACION AVANZADA EN JAVA  |       100 | 400.00 |                1
          4 | SISTEMAS OPERATIVOS MONOPUESTO |       200 | 450.00 |                2
          5 | IMPLANTACION DE BASES DE DATOS |        90 | 300.00 |                3
          6 | BASES DE DATOS NO RELACIONALES |       250 | 800.00 |                3
          
        alumno_id | asignatura_id | fecha | calificacion
        -----------+---------------+-------+--------------
                 2 |             4 |       |
                 1 |             3 |       |
                 3 |             6 |       |
                 1 |             2 |       |
                 2 |             5 |       |
                 3 |             1 |       |
                 3 |             4 |       |
  
##Ejercicio 6
    INSERT INTO alumno VALUES (5, 'ROMERO CIFUENTES, ELENA', 'MARCELO USERA 24', 624155975);
    
    INSERT INTO calificacion VALUES (5, 4, NULL, NULL);
    INSERT INTO calificacion VALUES (5, 5, NULL, NULL);

###Demostracion
     id |           nombre            |     direccion     | telefono
    ----+-----------------------------+-------------------+-----------
      1 | SÁNCHEZ HERMOSILLA, ALBERTO | HIGUERUELAS 12    | 654782615
      2 | ALBA TORDESILLAS, ANA       | MARÍA PICASSO 112 | 632487559
      3 | TORRES ALMAGRO, GUILLERMO   | ALCALÁ 415        | 651235674
      4 | LLANOS LOPEZ, MARIA LUISA   | ALCÁNTARA 53      | 679254812
      5 | ROMERO CIFUENTES, ELENA     | MARCELO USERA 24  | 624155975

     alumno_id | asignatura_id | fecha | calificacion
    -----------+---------------+-------+--------------
             2 |             4 |       |
             1 |             3 |       |
             3 |             6 |       |
             1 |             2 |       |
             2 |             5 |       |
             3 |             1 |       |
             3 |             4 |       |
             5 |             4 |       |
             5 |             5 |       |

##Ejercicio 7
    SELECT TO_DATE('01/06/2021', 'DD,MM,YY');

##Ejercicio 8
    UPDATE calificacion SET calificacion = 6.25 WHERE alumno_id = 1 AND asignatura_id = 2;

###Demostracion
     alumno_id | asignatura_id | fecha | calificacion
    -----------+---------------+-------+--------------
             2 |             4 |       |
             1 |             3 |       |
             3 |             6 |       |
             2 |             5 |       |
             3 |             1 |       |
             3 |             4 |       |
             5 |             4 |       |
             5 |             5 |       |
             1 |             2 |       |         6.25

##Ejercicio 9
    UPDATE calificacion SET calificacion = 7.50 WHERE alumno_id = 3 AND asignatura_id = 1;

###Demostracion
     alumno_id | asignatura_id | fecha | calificacion
    -----------+---------------+-------+--------------
             2 |             4 |       |
             1 |             3 |       |
             3 |             6 |       |
             2 |             5 |       |
             3 |             4 |       |
             5 |             4 |       |
             5 |             5 |       |
             1 |             2 |       |         6.25
             3 |             1 |       |         7.50

##Ejercicio 10
    UPDATE calificacion SET calificacion = 5 WHERE asignatura_id = 6;

###Demostracion
     alumno_id | asignatura_id | fecha | calificacion
    -----------+---------------+-------+--------------
             2 |             4 |       |
             1 |             3 |       |
             2 |             5 |       |
             3 |             4 |       |
             5 |             4 |       |
             5 |             5 |       |
             1 |             2 |       |         6.25
             3 |             1 |       |         7.50
             3 |             6 |       |         5.00

##Ejercicio 11
    INSERT INTO asignatura VALUES (7, 'PROGRAMACIÓN EN PYTHON', 200, 500, 1);

###Demostracion
     id |             nombre             | num_horas | precio | deparatamento_id
    ----+--------------------------------+-----------+--------+------------------
      1 | FUNDAMENTOS DE PROGRAMACION    |       120 | 350.00 |                1
      2 | ELEMENTOS DE HARDWARE          |        75 | 200.00 |                2
      3 | PROGRAMACION AVANZADA EN JAVA  |       100 | 400.00 |                1
      4 | SISTEMAS OPERATIVOS MONOPUESTO |       200 | 450.00 |                2
      5 | IMPLANTACION DE BASES DE DATOS |        90 | 300.00 |                3
      6 | BASES DE DATOS NO RELACIONALES |       250 | 800.00 |                3
      7 | PROGRAMACIÓN EN PYTHON         |       200 | 500.00 |                1

##Ejercicio 12
    INSERT INTO calificacion VALUES (1, 7, NULL, NULL);
    INSERT INTO calificacion VALUES (3, 7, NULL, NULL);
    INSERT INTO calificacion VALUES (5, 7, NULL, NULL);

###Demostracion
     alumno_id | asignatura_id | fecha | calificacion
    -----------+---------------+-------+--------------
             2 |             4 |       |
             1 |             3 |       |
             2 |             5 |       |
             3 |             4 |       |
             5 |             4 |       |
             5 |             5 |       |
             1 |             2 |       |         6.25
             3 |             1 |       |         7.50
             3 |             6 |       |         5.00
             1 |             7 |       |
             3 |             7 |       |
             5 |             7 |       |

##Ejercicio 13
    UPDATE asignatura SET precio = precio + (precio * 0.05);

###Demostracion
     id |             nombre             | num_horas | precio | deparatamento_id
    ----+--------------------------------+-----------+--------+------------------
      1 | FUNDAMENTOS DE PROGRAMACION    |       120 | 367.50 |                1
      2 | ELEMENTOS DE HARDWARE          |        75 | 210.00 |                2
      3 | PROGRAMACION AVANZADA EN JAVA  |       100 | 420.00 |                1
      4 | SISTEMAS OPERATIVOS MONOPUESTO |       200 | 472.50 |                2
      5 | IMPLANTACION DE BASES DE DATOS |        90 | 315.00 |                3
      6 | BASES DE DATOS NO RELACIONALES |       250 | 840.00 |                3
      7 | PROGRAMACIÓN EN PYTHON         |       200 | 525.00 |                1
    (7 rows)

##Ejercicio 14
    UPDATE asignatura SET precio = precio + (precio * 0.1) WHERE num_horas < 100;

###Demostracion
     id |             nombre             | num_horas | precio | deparatamento_id
    ----+--------------------------------+-----------+--------+------------------
      1 | FUNDAMENTOS DE PROGRAMACION    |       120 | 367.50 |                1
      3 | PROGRAMACION AVANZADA EN JAVA  |       100 | 420.00 |                1
      4 | SISTEMAS OPERATIVOS MONOPUESTO |       200 | 472.50 |                2
      6 | BASES DE DATOS NO RELACIONALES |       250 | 840.00 |                3
      7 | PROGRAMACIÓN EN PYTHON         |       200 | 525.00 |                1
      2 | ELEMENTOS DE HARDWARE          |        75 | 231.00 |                2
      5 | IMPLANTACION DE BASES DE DATOS |        90 | 346.50 |                3

##Ejercicio 15
    UPDATE asignatura SET precio = precio - (precio * 0.5) WHERE id = 5;
    UPDATE asignatura SET precio = precio - (precio * 0.5) WHERE id = 6;

###Demostracion
    id |             nombre             | num_horas | precio | deparatamento_id
    ----+--------------------------------+-----------+--------+------------------
      1 | FUNDAMENTOS DE PROGRAMACION    |       120 | 367.50 |                1
      3 | PROGRAMACION AVANZADA EN JAVA  |       100 | 420.00 |                1
      4 | SISTEMAS OPERATIVOS MONOPUESTO |       200 | 472.50 |                2
      7 | PROGRAMACIÓN EN PYTHON         |       200 | 525.00 |                1
      2 | ELEMENTOS DE HARDWARE          |        75 | 231.00 |                2
      5 | IMPLANTACION DE BASES DE DATOS |        90 | 173.25 |                3
      6 | BASES DE DATOS NO RELACIONALES |       250 | 420.00 |                3

    
##Ejercicio 16
    UPDATE calificacion SET calificacion = 0 WHERE calificacion IS NULL;

###Demostracion
     alumno_id | asignatura_id | fecha | calificacion
    -----------+---------------+-------+--------------
             1 |             2 |       |         6.25
             3 |             1 |       |         7.50
             3 |             6 |       |         5.00
             2 |             4 |       |         0.00
             1 |             3 |       |         0.00
             2 |             5 |       |         0.00
             3 |             4 |       |         0.00
             5 |             4 |       |         0.00
             5 |             5 |       |         0.00
             1 |             7 |       |         0.00
             3 |             7 |       |         0.00
             5 |             7 |       |         0.00

##Ejercicio 17
    UPDATE asignatura SET deparatamento_id = 1 WHERE deparatamento_id = 3;
###Demostracion         
    id |             nombre             | num_horas | precio | deparatamento_id
    ----+--------------------------------+-----------+--------+------------------
      1 | FUNDAMENTOS DE PROGRAMACION    |       120 | 367.50 |                1
      3 | PROGRAMACION AVANZADA EN JAVA  |       100 | 420.00 |                1
      4 | SISTEMAS OPERATIVOS MONOPUESTO |       200 | 472.50 |                2
      7 | PROGRAMACIÓN EN PYTHON         |       200 | 525.00 |                1
      2 | ELEMENTOS DE HARDWARE          |        75 | 231.00 |                2
      5 | IMPLANTACION DE BASES DE DATOS |        90 | 173.25 |                1
      6 | BASES DE DATOS NO RELACIONALES |       250 | 420.00 |                1
