CREATE TABLE Categorias (
  nombre VARCHAR(255) NOT NULL PRIMARY KEY,
  descripcion VARCHAR(255) NOT NULL
);

CREATE TABLE Libros (
  isbn VARCHAR(255) NOT NULL PRIMARY KEY,
  titulo VARCHAR(255) NOT NULL,
  autor VARCHAR(255) NULL,
  precio INT NOT NULL,
  categorias_nombre VARCHAR(255) NULL,
  FOREIGN KEY (categorias_nombre) REFERENCES Categorias(nombre)
);

/*2º Method
CREATE TABLE Libros (
  isbn VARCHAR(255) NOT NULL PRIMARY KEY,
  titulo VARCHAR(255) NOT NULL,
  autor VARCHAR(255) NULL,
  precio INT NOT NULL,
  categorias_nombre VARCHAR(255) NULL
);
ALTER TABLE Libros ADD CONSTRAINT Libros_fk0 FOREIGN KEY (categorias_nombre) REFERENCES Categorias(nombre);*/
