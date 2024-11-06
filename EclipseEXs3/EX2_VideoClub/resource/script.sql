		/* 1º Método*/
CREATE DATABASE bdd_ex2_videoclub;
USE bdd_ex2_videoclub;
CREATE TABLE pelicula (
  codigo INT AUTO_INCREMENT PRIMARY KEY,
  titulo VARCHAR(50) NOT NULL,
  director VARCHAR(50) NOT NULL,
  precio_alquiler DOUBLE NOT NULL
);

INSERT INTO pelicula (titulo, director, precio_alquiler) VALUES
  ("Inception", "Christopher Nolan", 3.50),
  ("Interstellar", "Christopher Nolan", 4.00),
  ("Titanic", "Ana", 3.75),
  ("Avatar", "James Cameron", 3.25),
  ("The Matrix", "Lana Wachowski", 3.25),
  ("Creado_A_Cambiar", "Cosme", 21.95),
  ("NombreDirecto_A_Buscar", "MAlex", 12.95),
  ("Precio_A_Buscar", "Quinty", 45.27),
  ("The Grand Budapest Hotel", "Wes Anderson", 3.85);