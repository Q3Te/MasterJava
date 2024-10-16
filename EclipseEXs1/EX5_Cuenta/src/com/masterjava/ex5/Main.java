package com.masterjava.ex5;

import java.util.Scanner;

public class Main {
	
	// INITIALIZE ITEMS EACH TIME e.g Cuenta cuenta = Cuenta.XXX(YYY);
	/*
	 * Cuenta.crearCuenta() --->  Cuenta.crearNuevaCuenta()
	 * ingresarCuenta() in Main  ---> depositarEnCuenta()
	 */
	
private static void crearCuenta(Scanner teclado) {		//Personas con el mismo nombre
	int pin, pinConfi;
	double cantidad=0;
	String titular;
    	
    System.out.println("Introducir nombre: [Minúsculas]");
    titular=teclado.nextLine();
    System.out.println("Introducir PIN: (4 Números): ");
    pin=teclado.nextInt();
    teclado.nextLine();
    System.out.println("Introducir PIN otra vez: ");
    pinConfi=teclado.nextInt();
    teclado.nextLine();
    
    Cuenta.crearCuenta(titular, pin, pinConfi,cantidad);
}

private static void ingresarCuenta(Scanner teclado) {
	int pin;
	double cantIngreso;
	String nombreCheck;
	
	System.out.println("Nombre Titular Cuenta: [Minúsculas]");
    nombreCheck=teclado.nextLine();
    
    Cuenta cuenta = Cuenta.buscarCuenta(nombreCheck);
    if(cuenta!=null)
	{
        System.out.println("Introducir PIN: ");
        pin=teclado.nextInt();
        teclado.nextLine();
        
        if(Cuenta.pinBien(cuenta, pin))	//True o False boolean
        { 
            System.out.println("Cantidad a Retirar: ");
            cantIngreso = teclado.nextDouble();
            teclado.nextLine();
            cuenta.ingresar(cantIngreso);
        }
        else
        {
            System.out.println("PIN incorrecto");
        }
    }
	else
	{
        System.out.println("Cuenta no encontrada.");
    }
}

private static void retirarCuenta(Scanner teclado) {
	int pin;
	double cantRetiro;
	String nombreCheck;
	
	System.out.println("Nombre Titular Cuenta: [Minúsculas]");
	nombreCheck=teclado.nextLine();
	Cuenta cuenta = Cuenta.buscarCuenta(nombreCheck);
	
	if(cuenta!=null)
	{
        System.out.println("Introducir PIN: ");
        pin=teclado.nextInt();
        teclado.nextLine();
        
        if(Cuenta.pinBien(cuenta, pin))	//True o False boolean
        { 
            System.out.println("Cantidad a Retirar: ");
            cantRetiro=teclado.nextDouble();
            teclado.nextLine();
            cuenta.retirar(cantRetiro);
        }
        else
        {
            System.out.println("PIN incorrecto");
        }
    }
	else
	{
        System.out.println("Cuenta no encontrada.");
    }
}

    private static void visualizarDatosIndividual(Scanner teclado) {
    	int pin;
    	String nombreCheck;
    	
        System.out.println("Introducir nombre: [Minúsculas]");
        nombreCheck=teclado.nextLine();
        
        Cuenta cuenta = Cuenta.buscarCuenta(nombreCheck);
        if(cuenta!=null)
    	{
            System.out.println("Introducir PIN: ");
            pin=teclado.nextInt();
            teclado.nextLine();
            
            if(Cuenta.pinBien(cuenta, pin))	//True o False boolean
            { 
            	Cuenta.visualizarDatosIndividual(nombreCheck);
            }
            else
            {
                System.out.println("PIN incorrecto");
            }
        }
    	else
    	{
            System.out.println("Cuenta no encontrada.");
        }

    }
    
    private static void visualizarTodosDatos() {;
        Cuenta.visualizarTodosDatos();
    }

	public static void main(String[] args) {
		  Scanner teclado = new Scanner(System.in);
		  int op;
		  	
	        do {
		            System.out.println("Elige una opción: \n\n"
		                    + "1- Crear cuenta\n"
		                    + "2- Ingresar dinero\n"
		                    + "3- Retirar dinero\n"
		                    + "4- Visualizar datos individual\n"
		                    + "5- Visualizar todo los datos\n"
		            		+ "6- Salir\n");
		            op=teclado.nextInt();
		            teclado.nextLine();
	
		            switch (op) {
		                case 1:
		                		crearCuenta(teclado);
		                    break;
		                case 2:
		                		ingresarCuenta(teclado);
		                	break;
		                	
		                case 3:
		                		retirarCuenta(teclado);
		                	break;
		                	
		                case 4:
		                		visualizarDatosIndividual(teclado);
		                	break;
		                case 5:
	                			visualizarTodosDatos();
	                	break;
		                case 6:
		                    	System.out.println("Saliendo del sistema.");
		                    break;
		                default:
		                    	System.out.println("Opción no válida.");
		            }
	        } while (op<=5);

	    }

	}