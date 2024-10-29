
CREATE DATABASE bdd_ex3_datospersona;
USE bdd_ex3_datospersona;
CREATE TABLE personas (
  id INT AUTO_INCREMENT PRIMARY KEY,
  nombre VARCHAR(50) NOT NULL,
  apellido1 VARCHAR(50) NOT NULL,
  apellido2 VARCHAR(50),
  telefono VARCHAR(15) NOT NULL
);


INSERT INTO personas (nombre, apellido1, apellido2, telefono) VALUES
  ("Juan", "Perez", "Gomez", "123456789"),
  ("Maria", "Lopez", "Martinez", "987654321"),
  ("Luis", "Garcia", "Sanchez", "456789123"),
  ("Ana", "Lopez", "Fernandez", "789123456"),
  ("Pedro", "Fernandez", "DavidEuskon","321654987");