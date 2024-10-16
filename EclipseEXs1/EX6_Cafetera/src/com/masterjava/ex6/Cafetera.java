package com.masterjava.ex6;

public class Cafetera {
	private int capacidadMax;
	private int capacidadActual;

	public Cafetera() {
		this.capacidadMax=1000;
		this.capacidadActual=0;
	}
	public Cafetera(int capacidadMax) {
		this.capacidadMax=capacidadMax;
		this.capacidadActual=capacidadMax;
	}

	public Cafetera(int capacidadMax, int capacidadActual) {
		if(capacidadActual>capacidadMax)
		{
			capacidadActual=capacidadMax;
		}
	}

	public int getCapacidadMax() {
		return capacidadMax;
	}

	public void setCapacidadMax(int capacidadMax) {
		this.capacidadMax=capacidadMax;
	}

	public int getCapacidadActual() {
		return capacidadActual;
	}

	public void setCapacidadActual(int capacidadActual) {
		this.capacidadActual=capacidadActual;
	}

	public void llenarCafetera() {
		capacidadActual=capacidadMax;
		System.out.println("La cafetera se ha rellenado con "+capacidadMax+"g de cafe");
		
	}

	public  void servirTaza(int tazaCafe) {
		
		if(capacidadActual>=tazaCafe)
		{
			capacidadActual-=tazaCafe;
			System.out.println("Se ha servido "+tazaCafe+"g de cafe");
			System.out.println("Queda "+capacidadActual+"g de cafe en la cafetera");
		}
		else
		{
			System.out.println("No alcanza para hacer "+tazaCafe+"g de cafe ");
			capacidadActual=0;
			System.out.println("La taza se ha servido con los ultimos granos de cafe que ya quedaba");
		}
	}

	public void vaciarCafetera() {
		capacidadActual=0;
		System.out.println("La cafetera se ha vaciado");
	}

	public void rellenarCafetera(int capacidadARellenar) {
		capacidadActual+=capacidadARellenar;
		System.out.println("Se ha puesto "+capacidadActual+"g de cafe en la cafetera");
	}
}

