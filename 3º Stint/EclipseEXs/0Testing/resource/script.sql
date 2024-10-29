CREATE DATABASE bdd_testing;
USE bdd_testing;
CREATE TABLE personas (
  id INT AUTO_INCREMENT PRIMARY KEY,
  nombre VARCHAR(10) NULL,
  apellido VARCHAR(45) NULL,
  edad INT NULL
);

/* 
 		2º Method 
CREATE DATABASE bdd_testing;
USE bdd_testing;
CREATE TABLE personas (
  id INT PRIMARY KEY,
  nombre VARCHAR(10) NULL,
  apellido VARCHAR(45) NULL,
  edad INT NULL
);
*/