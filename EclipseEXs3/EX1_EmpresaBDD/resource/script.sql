CREATE DATABASE bdd_ex1_empresa;
USE bdd_ex1_empresa;
CREATE TABLE empleados (
  idEmpleado INT NULL,
  nombre VARCHAR(10) NULL,
  apellido1 VARCHAR(25) NULL,
  apellido2 VARCHAR(25) NULL,
  fechaNacimiento DATE NULL,
  salario INT NULL
);
INSERT INTO empleados (idEmpleado,nombre,apellido1,apellido2,fechaNacimiento,salario) VALUES(1,"Juan","DeRosi","Giovanni","1994-02-11",5515);
