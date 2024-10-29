package com.masterjava.services;
	import java.util.ArrayList;
	import java.util.List;
	import com.masterjava.enums.Categoria;
	import com.masterjava.modelos.Producto;

public class ValidationService {
	 private static List<Producto> listaProductos = new ArrayList<Producto>();
	 
	 
	 static {
		 Producto p1=new Producto("Chocolate",3.41,100,Categoria.DULCES);
		 Producto p2=new Producto("Camiseta",39.99,100,Categoria.ROPA);
		 Producto p3=new Producto("Cafe",1.00,100,Categoria.BEBIDAS);
	 		
		 listaProductos.add(p1);
		 listaProductos.add(p2);
		 listaProductos.add(p3);
	 }

	 public List<Producto> getListaProductos(){		
		 return listaProductos;
	 }	
/*----------------------------------------------------------------------------------------------------------------------*/	 
	 /* COMPRA PRODUCTO*/
	 public int getStockByNombre(String nombre)  { //Aquí no hay throw Exception xq si esta mal quiero que vaya al html de error
	   for(Producto producto : listaProductos)
	   {
	       if (producto.getNombre().equalsIgnoreCase(nombre))
	       {
	    	   	return producto.getStock(); // Return stock of product if product name matches
	       }
	   }
       return -1;
	 }
	
	 public boolean  buscarNombreParaComprar(String nombre){
	 	for(Producto p:listaProductos)
	 	{
	 		if(p.getNombre().equals(nombre))
	 		{
	 			return true;
	 		}
	 	}
	 	return false;
	 }
	 
	 public double getPrecioByNombre(String nombre) {
	    for (Producto p : listaProductos)
	    {
	        if (p.getNombre().equalsIgnoreCase(nombre))
	        {
	            return p.getPrecio();	// Return precio of product if product name matches
	        }
	    }
	    throw new IllegalArgumentException("Producto no encontrado");
	 }

	 public Categoria getCategoriaByNombre(String nombre)
	 {
	    for (Producto p : listaProductos) { 
	        if (p.getNombre().equalsIgnoreCase(nombre))
	        {
	            return p.getCategoria(); // Return categoria of product if product name matches
	        }
	    }
	    throw new IllegalArgumentException("Categoria no encontrada para el producto");
	}

	 public double procesoComprarProducto(double precio, int stock) {
		 double ticketCompra=0.00;
		 
		 ticketCompra = precio*stock;
		 
		 return ticketCompra;
	 }
	 
 /*----------------------------------------------------------------------------------------------------------------------*/
	 /* ACTUALIZAR LISTA PRODUCTOS*/
	 public void getStockActualizado(int nuevoStock){} //Nº1 //Aquí no hay throw Exception xq si esta mal quiero que vaya al html de error
	
	 public List<Producto> getListaProductosActualizadoSinStock(){	//Nº3
		 return listaProductos;
	 }
//	 
	 public List<Producto> getListaProductosActualizadoFinal() {  //Nº4
		    for (Producto p : listaProductos) {
		    	int nuevoStock = p.getStock();
		        p.setStockActualizado(nuevoStock);  // Update stock for each product
		    }
		    return listaProductos;
		} 
}