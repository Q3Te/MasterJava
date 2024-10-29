package com.masterjava.principal;
	import java.time.LocalDate;
	import java.time.format.DateTimeFormatter;
	import java.util.Scanner;
	import com.masterjava.controller.Controller;

public class Principal_EmpresaBDD {
	private static void annadirEmpleadoInput(Scanner teclado) {	
		int salario, idEmpleado;
		String nombre, apellido1, apellido2, fechaNacimientoStr;
	    char resp;

	    System.out.println("ID Empleado: ");
	    idEmpleado = teclado.nextInt();
	    teclado.nextLine();
	    
    	boolean empleadoBuscadoExiste=Controller.buscarEmpleado(idEmpleado);
	    if(!empleadoBuscadoExiste)
	    {
		    System.out.println("Nombre: ");
		    nombre=teclado.nextLine();
		    System.out.println("Apellido1: ");
		    apellido1=teclado.nextLine();
		    System.out.println("Apellido2: ");
		    apellido2=teclado.nextLine();
		    System.out.println("Fecha nacimiento (dd-mm-yyyy): ");
		    fechaNacimientoStr=teclado.nextLine();
		    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
			LocalDate fechaNacimiento = LocalDate.parse(fechaNacimientoStr, formatter);
			System.out.println("Salario: ");
		    salario = teclado.nextInt();
		    teclado.nextLine();
			Controller.annadirEmpleadoBackend(idEmpleado,nombre,apellido1,apellido2,fechaNacimiento,salario);
		    System.out.println("Desea añadir otro empleado (s/n): ");
		    
			resp=teclado.next().charAt(0);
			teclado.nextLine();

			while(resp=='s')
			{
				System.out.println("ID Empleado: ");
			    idEmpleado = teclado.nextInt();
			    teclado.nextLine();
			    System.out.println("Nombre: ");
			    nombre=teclado.nextLine();
			    System.out.println("Apellido1: ");
			    apellido1=teclado.nextLine();
			    System.out.println("Apellido2: ");
			    apellido2=teclado.nextLine();
			    System.out.println("Fecha nacimiento: ");
			    fechaNacimientoStr=teclado.nextLine();
			    formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
				fechaNacimiento = LocalDate.parse(fechaNacimientoStr, formatter);
				System.out.println("Salario: ");
			    salario = teclado.nextInt();
			    teclado.nextLine();
								
				System.out.println("Desea añadir otro empleado (s/n): ");
				resp = teclado.next().charAt(0);
				teclado.nextLine();
				 Controller.annadirEmpleadoBackend(idEmpleado,nombre,apellido1,apellido2,fechaNacimiento,salario);
			}

	    }
	    else
	    {
	    	System.out.println("Ya existe empleado con ese ID");
	    }

	}
	
	private static void modificarEmpleadoInput(Scanner teclado) {	
		int salario, idEmpleado;
		String nombre, apellido1, apellido2, fechaNacimientoStr;
	    char resp;

	    System.out.println("ID Empleado: ");
	    idEmpleado = teclado.nextInt();
	    teclado.nextLine();
	    
    	boolean empleadoBuscadoExiste=Controller.buscarEmpleado(idEmpleado);
	    if(empleadoBuscadoExiste)
	    {
	        System.out.println("Empleado encontrado");
	        System.out.println("Ahora vas a modificar datos de dicho emplead@");
	        
		    System.out.println("Nombre: ");
		    nombre=teclado.nextLine();
		    System.out.println("Apellido1: ");
		    apellido1=teclado.nextLine();
		    System.out.println("Apellido2: ");
		    apellido2=teclado.nextLine();
		    System.out.println("Fecha nacimiento (dd-mm-yyyy): ");
		    fechaNacimientoStr=teclado.nextLine();
		    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
			LocalDate fechaNacimiento = LocalDate.parse(fechaNacimientoStr, formatter);
			System.out.println("Salario: ");
		    salario = teclado.nextInt();
		    teclado.nextLine();
		    
		    Controller.modificarDatosEmpleado(nombre,apellido1,apellido2,fechaNacimiento,salario,idEmpleado);
	    }
	    else
	    {
	        System.out.println("Empleado no encontrado");
	    }
	}
	
	private  static void listarEmpleadosConSuInfo() {
		Controller.listEmpleadosConInfo();
	}
	
	private static void buscarEmpleadoPorPrimerApellidoInput(Scanner teclado) {
		String apellido1;

	    System.out.println("Apellido1: ");
	    apellido1=teclado.nextLine();
	    
    	boolean empleadoBuscadoExiste=Controller.buscarEmpleadosPorApellido1(apellido1);
	    if(empleadoBuscadoExiste)
	    {
		    Controller.mostrarEmpleadoPorPrimerApellido(apellido1);
	    }
	    else
	    {
	        System.out.println("Empleado no encontrado");
	    }
	}
	
	private static void eliminarEmpleadoInput(Scanner teclado) {	
		int idEmpleado;

	    System.out.println("ID Empleado: ");
	    idEmpleado = teclado.nextInt();
	    teclado.nextLine();
	    
    	boolean empleadoBuscadoExiste=Controller.buscarEmpleado(idEmpleado);
	    if(empleadoBuscadoExiste)
	    {		    
		    Controller.eliminarEmpleado(idEmpleado);
	    }
	    else
	    {
	        System.out.println("Empleado no encontrado");
	    }
	}
	
	private static void mostrarSalarioMedio() {	
		Controller.calcularSalarioMedio();
	}
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int op;
		  do {
		          System.out.println("Elige una opción: \n\n"
		                  + "1- Insertar Empleado\n"
		                  + "2- Modificar datos de un empleado\n"
		                  + "3- Listar empleados con su información\n"
		                  + "4- Buscar empleados por primer apellido\n"
		          		  + "5- Eliminar un empleado\n"
		          		  + "6- Mostrar salario medio\n"
		          		  + "7- Salir\n");
		          op=teclado.nextInt();
		          teclado.nextLine();
		
		          switch (op) {
		              case 1:
		            	  annadirEmpleadoInput(teclado);
		              	break;
		              case 2:
		            	  modificarEmpleadoInput(teclado);
		              	break;	
		              case 3:
		            	  listarEmpleadosConSuInfo();
		              	break;
		              case 4:
		            	  buscarEmpleadoPorPrimerApellidoInput(teclado);
		            	break;
		              case 5:
		          			eliminarEmpleadoInput(teclado);
		          		break;
		              case 6:
		          			mostrarSalarioMedio();
		          		break;
		              case 7:
		                  	System.out.println("Saliendo del sistema.");
		                break;
		              default:
		                  	System.out.println("Opción no válida.");
		          }
		  } while (op<=6);
 }
}
