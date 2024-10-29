CREATE DATABASE bdd_example4_jpa_persistence;
USE bdd_example4_jpa_persistence;
CREATE TABLE libros (
  isbn VARCHAR(15)  NOT NULL PRIMARY KEY,
  titulo VARCHAR(45) NULL,
  autor VARCHAR(45) NULL,
  precio INT NULL
); 

INSERT INTO libros (isbn,titulo,autor,precio) VALUES
	("1A","Qwery","David",5),
	("1B","sdf","Maria",6),
	("1C","e2dd","Bobby",12),
	("1D","gjgv","Ires",85),
	("1E","terw","Yues",98),
	("1F","ougc","Baq",2),
	("1G","ziora","Ios",99);