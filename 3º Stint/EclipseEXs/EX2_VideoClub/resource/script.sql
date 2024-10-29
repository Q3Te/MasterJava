		/* 1º Método*/
CREATE DATABASE bdd_ex2_videoclub;
USE bdd_ex2_videoclub;
CREATE TABLE peliculas (
  codigo INT AUTO_INCREMENT PRIMARY KEY,
  titulo VARCHAR(50) NOT NULL,
  director VARCHAR(50) NOT NULL,
  precio_alquiler DOUBLE NOT NULL
);

INSERT INTO peliculas (titulo, director, precio_alquiler) VALUES
  ("Inception", "Christopher Nolan", 3.50),
  ("Interstellar", "Christopher Nolan", 4.00),
  ("Titanic", "James Cameron", 3.75),
  ("Avatar", "James Cameron", 4.50),
  ("The Matrix", "Lana Wachowski", 3.25),
  ("Amélie", "Jean-Pierre Jeunet", 2.95),
  ("The Grand Budapest Hotel", "Wes Anderson", 3.85);