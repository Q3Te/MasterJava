package com.masterjava.modelos;

/**
*Clase Animal
*@author Manuel Portal
*@version 4.33.0, 26 sept 2024
*/
public abstract class Animal {
	protected int nPatas;

	public Animal() {
		super();
	}

	public Animal(int nPatas) {
		super();
		this.nPatas = nPatas;
	}

//	public int getnPatas() {
//		return nPatas;
//	}
//
//	public void setnPatas() {
//		
//	}
	public void andar() {
		System.out.println("Este animal anda sobre "+nPatas+" patas");
	}
	
	public void comer() {
		
	}
}
