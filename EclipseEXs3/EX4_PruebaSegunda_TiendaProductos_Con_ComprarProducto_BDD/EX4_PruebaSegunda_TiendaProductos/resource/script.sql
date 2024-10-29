		/* 1º Método*/
CREATE DATABASE bdd_tienda_producto;
USE bdd_tienda_producto;
CREATE TABLE productos (
 /* idProducto INT NULL,*/
  nombre VARCHAR(10) NULL,
  precio DOUBLE NULL,
  stock INT NULL,
  categoria ENUM('DULCES', 'ROPA', 'BEBIDAS') NULL
);
INSERT INTO productos (nombre,precio,stock,categoria) VALUES
	("Chocolate",3.41,100,'DULCES'),
	("Camiseta",39.99,100,'ROPA'),
	("Cafe",10.00,100,'BEBIDAS');


/*		2º Método
CREATE TABLE categorias (
  id INT PRIMARY KEY,
  nombre VARCHAR(10) NULL
);

INSERT INTO categorias (id, nombre) VALUES
  (1, 'DULCES'),
  (2, 'ROPA'),
  (3, 'BEBIDAS');

CREATE TABLE productos (
  nombre VARCHAR(10) NULL,
  precio DOUBLE NULL,
  stock INT NULL,
  categoria_id INT NULL,
  FOREIGN KEY (categoria_id) REFERENCES categorias(id)
);

INSERT INTO productos (nombre, precio, stock, categoria_id) VALUES
  ('Chocolate', 3.41, 100, 1),
  ('Camiseta', 39.99, 100, 2),
  ('Cafe', 10.00, 100, 3);

*/