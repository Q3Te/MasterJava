INSERT INTO Categorias (nombre, descripcion) VALUES
  ('programacion', 'libros de programacion'),
  ('web', 'libros web');

INSERT INTO Libros (isbn, titulo, autor, precio, categorias_nombre) VALUES
  ('1AB', 'Java', 'pepito', 3, 'programacion'),
  ('2AC', 'Java Web', 'pepito', 3, 'programacion'),
  ('3BC', 'html', 'gema', 2, 'web'),
  ('4BD', 'html5', 'andres', 2, 'web'),
  ('5BD', 'C', 'maria', 5, 'programacion'),
  ('6FG', 'PHP', NULL, 4, 'programacion');
