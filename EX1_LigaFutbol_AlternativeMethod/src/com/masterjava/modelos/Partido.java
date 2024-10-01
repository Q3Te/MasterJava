package com.masterjava.modelos;

/**
*Clase Partido
*@author Manuel Portal
*@version 4.33.0, 27 sept 2024
*/
public class Partido {
	private Equipo eLocal;
	private Equipo eVisitante;
	private int golesLocal;  
	private int golesVisitante;  
	
	public Partido(Equipo eLocal, Equipo eVisitante) {
		this.eLocal=eLocal;
		this.eVisitante=eVisitante;
	}
	
	public void proceso_Resultado(int golesLocal, int golesVisitante) {
		this.golesLocal=golesLocal;
		this.golesVisitante=golesVisitante;
		
		if(golesLocal>golesVisitante)
		{
			eLocal.pGanados(golesLocal);	
		}
		else if(golesVisitante>golesLocal)
		{
			eVisitante.pGanados(golesVisitante); 
		}
	}
	public String resultadoFinal() {
		return eLocal.getNombre()+" "+golesLocal+"-"+golesVisitante+" "+eVisitante.getNombre();
	}
}
