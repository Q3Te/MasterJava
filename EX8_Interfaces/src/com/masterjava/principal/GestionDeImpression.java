package com.masterjava.principal;


import java.util.ArrayList;
import java.util.List;

import com.masterjava.interfaces.Imprimible;
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
		f1.informeLargo(); System.out.println();
		
/****************************************************************************/		
	  //Instancing
      System.out.println("\t INSTANCING");
      Imprimible[] imprimible = new Imprimible[4];
      imprimible[0] = new Factura (3,45);
      imprimible[1] = new Factura (8,19);
      imprimible[2] = new Pagina(34, 89);
      imprimible[3] = new Pagina(67, 20);
      
      for(Imprimible impri: imprimible)
      {
              if (impri instanceof Factura)
              {
                      System.out.println("Soy una factura");
              }
              impri.informeCorto();
              impri.informeLargo();
              System.out.println("___________");
      }
      System.out.println();
      
/****************************************************************************/	
      	System.out.println("\t ARRAYLIST");
      
		List<Imprimible> gestionDeImpressionArrayList = new ArrayList<Imprimible>();
		
		Factura f3 = new Factura(10,30);
		Pagina p3 = new Pagina(50,100);

		gestionDeImpressionArrayList.add(f3);
		gestionDeImpressionArrayList.add(p3);

	    for(int i=0; i<gestionDeImpressionArrayList.size(); i++ )
	    {
			   System.out.println();
			   gestionDeImpressionArrayList.get(i).informeCorto();
			   gestionDeImpressionArrayList.get(i).informeLargo();
	    }		
	}

}
