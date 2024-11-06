CREATE DATABASE bdd_example5_libros;
USE bdd_example5_libros;

CREATE TABLE libros (
  isbn INT PRIMARY KEY,
  titulo VARCHAR(50) NOT NULL,
  tematica VARCHAR(50) NOT NULL
);

INSERT INTO libros (isbn, titulo, tematica) VALUES
  (1, 'Cien años de soledad', 'Realismo mágico'),
  (2, 'Don Quijote de la Mancha', 'Clásico'),
  (3, 'La sombra del viento', 'Misterio'),
  (4, 'Ficciones', 'Ficción'),
  (5, 'El amor en los tiempos del cólera', 'Romance');