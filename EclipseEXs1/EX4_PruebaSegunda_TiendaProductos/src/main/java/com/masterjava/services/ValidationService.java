package com.masterjava.services;
	import java.util.ArrayList;
	import java.util.List;
	import com.masterjava.enums.Categoria;
	import com.masterjava.modelos.Producto;

public class ValidationService {
	 private static List<Producto> listaProductos = new ArrayList<Producto>();
	 
	 static {
		 Producto p1=new Producto("Chocolate",3.41,12,Categoria.DULCES);
		 Producto p2=new Producto("Camiseta de Zara",39.99,20,Categoria.ROPA);
		 Producto p3=new Producto("Café con Leche",0.90,45,Categoria.BEBIDAS);
		 Producto p4=new Producto("ProductoACambiar",10.00,50,Categoria.MUEBLES);
	 		
		 listaProductos.add(p1);
		 listaProductos.add(p2);
		 listaProductos.add(p3);
		 listaProductos.add(p4);
	 }

	 public void annadirProducto(Producto producto) {
		    listaProductos.add(producto);
		}

	 
	 public Producto buscarParaEliminar(String nombre){
		 	for(Producto p:listaProductos)
		 	{
		 		if(p.getNombre().equals(nombre))
		 		{
		 			return p;
		 		}
		 	}
		 	return null;
	  }
	 
	 
	 public void eliminarProducto(Producto producto) {
		    listaProductos.remove(producto);
		}

	 
	 public void modificarProducto(Producto producto) {
	 }

	 public Producto buscarParaModificar(String nombre){
		 	for(Producto p:listaProductos)
		 	{
		 		if(p.getNombre().equals(nombre))
		 		{
		 			return p;
		 		}
		 	}
		 	return null;
	  }
	 
	 public Producto buscarUno(String nombre){
	 	for(Producto p:listaProductos)
	 	{
	 		if(p.getNombre().equals(nombre))
	 		{
	 			return p;
	 		}
	 	}
	 	return null;
	  }
	 
	 public List<Producto> getListaProductos(){		
		 return listaProductos;
	 }	 
}