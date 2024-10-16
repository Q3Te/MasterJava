package com.masterjava.principal;

import java.util.ArrayList;
import java.util.List;

import com.masterjava.modelos.Flauta;
	import com.masterjava.modelos.Guitarra;
	import com.masterjava.modelos.GuitarraElectrica;
	import com.masterjava.modelos.Instrumento;
	import com.masterjava.modelos.Tambor;

public class Principal {

	public static void main(String[] args) {
		Flauta f1 = new Flauta("Flauta_W","TipoA","ModeloXS");
		Guitarra g1 = new Guitarra("Classica","TipoB",6);
		GuitarraElectrica ge1 = new GuitarraElectrica("Elite","TipoA",6,44);
		Tambor t1 = new Tambor("Tambor_M","TipoB",5);
		
		//Calling to method
		System.out.println("\t LLAMADAS AL OBJETO");
		f1.getNombre();
		f1.getTipo();
		f1.getModelo();
		f1.tocar();
		g1.tocar();
		ge1.tocar();
		t1.aporrear();
		System.out.println();
		
/****************************************************************************/		
		//Instancing
		System.out.println("\t INSTANCING");
		Instrumento[] instrumento = new Instrumento[4];
		instrumento[0]= new Flauta("Flauta_W","TipoA","ModeloXS");
		instrumento[1]= new Guitarra("Classica","TipoB",6);
		instrumento[2]= new GuitarraElectrica("Elite","TipoA",6,44);
		instrumento[3]= new Tambor("Tambor_M","TipoB",5);
           
		for (Instrumento instru: instrumento)
		{
			if(instru instanceof Flauta)
           {
               System.out.println("Soy una Flauta\n");
           }
           instru.tocar();                
      }
      System.out.println();
           
/****************************************************************************/	
			System.out.println("\t ARRAYLIST");
			
			List<Instrumento> instrumentosArrayList = new ArrayList<Instrumento>();
			
			Flauta f2 = new Flauta("Flauta_W","TipoA","ModeloXS");
			Guitarra g2 = new Guitarra("Guitarra Classica","TipoB",6);
			GuitarraElectrica ge2 = new GuitarraElectrica("GuitarraElectrica Elite","TipoA",6,44);
			Tambor t2 = new Tambor("Tambor_M","TipoB",5);
			

			instrumentosArrayList.add(f2);
			instrumentosArrayList.add(g2);
			instrumentosArrayList.add(ge2);
			instrumentosArrayList.add(t2); //  Diff set
		    for(int i=0; i<instrumentosArrayList.size(); i++ )
		    {
			   if(instrumentosArrayList.get(i).equals(t2))
			   {
				   System.out.println();
				   t2.aporrear();
			   }
			   else
			   {
				   System.out.println();
				   instrumentosArrayList.get(i).afinar();
				   instrumentosArrayList.get(i).tocar();
			   }
		    }		
}
}	