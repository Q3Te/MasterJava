package com.masterjava.ex5;

import java.util.ArrayList;
import java.util.List;

public class Cuenta {
	private String titular;
	private int pin;
	private double cantidad;
	
	private static List<Cuenta> cuentas = new ArrayList<>();
	
    public Cuenta(String titular, int pin, double cantidad) {
        this.titular=titular;
        this.pin=pin;
        this.cantidad=0;
    }
    
	public String getTitular() {
		return titular;
	}

	public double getCantidad() {
		return cantidad;
	}
	
	public int getPin() {
		return pin;
	}

	public double  ingresar(double cantidad) {
		if(cantidad>0)
		{
            this.cantidad+=cantidad;
            System.out.println("€"+cantidad+" ingresado");
            System.out.println("Tienes disponible en la cuenta: €"+this.cantidad); 
        }
		else
		{
			System.out.println("Error al ingresar cantidad");
		}
		return cantidad;	
	}

	public double retirar(double cantidad) {
	    if(this.cantidad - cantidad<0)  //double saldoActual = this.cantidad; if (saldoActual - cantidad < 0)  IF GETTING CONFUSED WITH this.cantidad
	    {
	        this.cantidad = 0;  // If amount after withdraw is negative, balance = 0
		    System.out.println("Retirar más de lo que tienes pasas a tener 0");
		    System.out.println("Tienes disponible en la cuenta: €" + this.cantidad);
	    }
	    else
	    {
	        this.cantidad -= cantidad;  // Subtract the amount from the balance
	        System.out.println("€"+cantidad+" retirado");
	        System.out.println("Tienes disponible en la cuenta: €" + this.cantidad);
	    }
	    return this.cantidad;
	}
	
	@Override
	public String toString() {
		return "Cuenta [titular= " + titular + ", con pin= " + pin + " y cantidad= " + cantidad + "]";
	}
	
    public static void crearCuenta(String titular, int pin, int pinConfi, double cantidad) {
    	if((pin>=0000&&pin<=9999) && (pin==pinConfi))  //if (pin.length() == 4 && pin==pinConfi) was wrong and fix is if(int.lenth()==X)    WOULD BE    if(String.valueOf(pin).length() == 4 && pin == pinConfi)
        {
            cuentas.add(new Cuenta(titular, pin,cantidad));
            System.out.println("Cuenta creada.");
        } 
        else 
        {
            System.out.println("PINs no coinciden O PIN no es de 4 dígitos");
        }
    }
    
   public static Cuenta buscarCuenta(String nombre) {
        for(Cuenta cuenta : cuentas)
        {
            if(cuenta.getTitular().equalsIgnoreCase(nombre)) 
            {
                return cuenta;
            }
        }
        return null;
    }
    
   public static boolean  pinBien(Cuenta cuenta, int pin) { //Antes aquí estaba mirado el nombre dado que buscaba una cuenta [Cuenta cuenta = buscarCuenta(nombre) THEN if cuenta!=null] en vez de pensar que si me pide pin, cuenta automaticamente está bien
    			
		if(cuenta.getPin()==pin)
		{
		    System.out.println("PIN correcto.");
		    return true;
		}
		else
		{
		    System.out.println("PIN incorrecto.");
		    return false;
		}
}

    public static void visualizarDatosIndividual(String nombreCheck) {
        Cuenta cuenta = buscarCuenta(nombreCheck);
        
        if(cuenta!=null)
        {
            System.out.println(cuenta);
        }

    }
    
    public static void visualizarTodosDatos() {
        if(cuentas.isEmpty())
        {
            System.out.println("No hay cuentas disponibles.");
        } 
        else
        {
            for(Cuenta cuenta : cuentas) 
            {
                System.out.println(cuenta);
            }
        }
    }

}