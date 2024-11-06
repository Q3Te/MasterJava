CREATE DATABASE bdd_ex2_cursobdd;
USE bdd_ex2_cursobdd;

CREATE TABLE cursos (
  cod_curso INT AUTO_INCREMENT PRIMARY KEY,  
  nombre VARCHAR(50) NULL,
  duracion_curso INT null,
  precio INT null
);

INSERT INTO cursos (nombre, duracion_curso, precio) VALUES
('Informática', 250, 196),
('Lengua', 400, 120),
('Matemáticas', 500, 110),
('Ciencias', 475, 90),
('Artes', 180, 180);