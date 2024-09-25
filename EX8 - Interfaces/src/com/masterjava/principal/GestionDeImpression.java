package com.masterjava.principal;


import com.masterjava.modelos.Factura;
import com.masterjava.modelos.Pagina;

public class GestionDeImpression {

	public static void main(String[] args) {
		Pagina p1 = new Pagina(5,50);
		Factura f1 = new Factura(8,41283);
		
		p1.getnLineas(); 
		p1.getnPagina(); 
		p1.informeCorto();
		p1.informeLargo(); System.out.println();
		
		f1.getnFactura();
		f1.getCodigoCliente();
		f1.informeCorto();
		f1.informeLargo();

	}

}
