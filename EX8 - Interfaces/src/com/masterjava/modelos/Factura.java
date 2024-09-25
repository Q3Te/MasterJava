package com.masterjava.modelos;

import com.masterjava.interfaces.Imprimible;

public class Factura implements Imprimible{
	 private  int nFactura;
	 private  int codigoCliente;
	public Factura() {
		super();
	}
	public Factura(int nFactura, int codigoCliente) {
		super();
		this.nFactura = nFactura;
		this.codigoCliente = codigoCliente;
	}
	public int getnFactura() {
		return nFactura;
	}
	public void setnFactura(int nFactura) {
		this.nFactura = nFactura;
	}
	public int getCodigoCliente() {
		return codigoCliente;
	}
	public void setCodigoCliente(int codigoCliente) {
		this.codigoCliente = codigoCliente;
	}
	
	@Override
	public void informeLargo() {
		System.out.println("Número factura-"+nFactura+" del cliente con código- "+codigoCliente);
		
	}
	@Override
	public void informeCorto() {
		System.out.println("Número factura-"+nFactura);
		
	}
	 
	 
}
