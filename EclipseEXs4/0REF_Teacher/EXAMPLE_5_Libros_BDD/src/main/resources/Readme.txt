RECURSO: Libro

url --> http://localhost:8080/

GET    (Recuperar libors [/libros], Recuperar un libro [/{isbn}]  ) 
POST   (Insertar libro [/libros]  )
PUT    (Actualizar libro [/libros]  )
DELETE (Eliminar libro [/libros/{isbn}]  )
------------------------------------
Create project, Modelo datos, use anotations (@Entity, @Table, @Id)
Create Repository (com.masterjava.repository)
	create interface XXXRepository, extends JpaRepository<T,ID>  (Where T is type entity, ID is type of Primary Key
	if more methods are need in JpaRepository add
	@Query...
	tipoDevuelto metodo (tipoArg arg)
	
Lógica capa de negocio (Servicio) [Interface, Clase que implementa Inteface]
Controller (@RestController, @AutoWired, Mappings)
Configuración de Application (BDD Properties)