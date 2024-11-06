CREATE DATABASE ex3_apirest_empleados;
USE ex3_apirest_empleados;

CREATE TABLE empleados (
  id_empleado INT AUTO_INCREMENT PRIMARY KEY,  
  nombre VARCHAR(50) NULL,
  apellido VARCHAR(50) NULL,
  email VARCHAR(50) NULL
);

INSERT INTO empleados (nombre, apellido, email) VALUES
('Alex', 'Bustamaq', 'bustamaqa@gmail.com'),
('David', 'Genesis', 'genesisd@gmail.com'),
('Mark', 'Quamacane', 'quamacanem@gmail.com'),
('Qwerty', 'Grealishshen', 'grealishshenq@gmail.com'),
('Piszq', 'Tripplew', 'tripplewp@gmail.com');