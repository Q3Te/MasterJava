package com.masterjava.modelos;

import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.masterjava.interfaces.Conducible;

/**
*Clase Camion
*@author Manuel Portal
*@version 4.33.0, 30 sept 2024
*/
public class Camion extends Vehiculo implements Conducible {
	protected static final int ruedas=8;
	protected List<Double> tacometro; // Tacómetro que alamacena lista de volocidades de un recorrido
    private LocalTime horaArrancar;
    private int totalHoras;
    private int	totalMins;

	public Camion(String matricula, String color) {
		super(matricula, color);
		horaArrancar=LocalTime.now();
		totalHoras=0;
		totalMins=0;
		tacometro=new ArrayList<>(); //Initializamos la lista tacomentro
	}

	public List<Double> getTacometro() {
		return tacometro;
	}

	public void setTacometro(List<Double> tacometro) {
		this.tacometro = tacometro;
	}
	
    public List<Double> ordenacionTacometro() {  //It reads this and NOT get nor set
        Collections.sort(tacometro);
        return tacometro;
    } 
  	
	@Override
	public String getColor() {
		return super.getColor();
	}

	@Override
	public int getVelocidad() {
		return super.getVelocidad();
	}

	@Override
	public String getMatricula() {
		return super.getMatricula();
	}

	@Override
	public void arrancar() {
		System.out.println("Camión arrancado a las "+horaArrancar.getHour()+":"+horaArrancar.getMinute());
	}
	
	@Override
	public void conducir() {
		System.out.println("Conduciendo el camión...");		
	}
	
	@Override
	public double avanzar(int km, double velocidad) {
		double tiempoEnHoras = km/velocidad;
		long totalEnFormato= (long)(tiempoEnHoras*60);		//Convierte el teimpo en un objeto Duración
		Duration duracion =Duration.ofMinutes((totalEnFormato));
		long horas=duracion.toHours();
		long mins=totalEnFormato%60; //Why %60 bc when you do it without modulo (long mins=duracion.toMinutes();)s, you get the whole mins
		
		totalHoras += horas;
		totalMins += mins; 
		
		if(totalMins>=60)
		{
			totalHoras+=totalMins/60;
			totalMins=totalMins%60;
		}
		System.out.println("Avanzando "+km+" km a "+velocidad+" km/h. Tiempo "+horas+"hrs, "+mins+"mins");
		tacometro.add(velocidad);
		return totalEnFormato;
	}
	
	@Override
	public void retroceder() {
		System.out.println("Retrocediendo...");
	}

	@Override
	public void parar() {
		System.out.println("Camión se ha detenido; Viaje ha finalizado"); 
		LocalTime tiempoFinalizado=horaArrancar.plusHours(totalHoras).plusMinutes(totalMins); //Gives HH:MM:SS:9D
		
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("HH:mm");  //Java's internal DateFormatHelper
		String fTiempoFinalizado = tiempoFinalizado.format(formato);	//Puts it as String
		
		System.out.println(""); 
		System.out.println("\t RESUMEN VIAJE CAMIÓN"); 
		System.out.println("Camión arrancado a "+horaArrancar.getHour()+":"+horaArrancar.getMinute());
		System.out.println("Duración total de viaje "+totalHoras+"hrs, "+totalMins+"mins");
		System.out.println("Camión se ha detenido a las "+fTiempoFinalizado);
		
		ordenacionTacometro();
		System.out.println("\nVelocidades del tacómetro ordenadas: ");
		for(Double velocidad: tacometro)
		{
			System.out.println(velocidad+"km/h");
		}
	}
}