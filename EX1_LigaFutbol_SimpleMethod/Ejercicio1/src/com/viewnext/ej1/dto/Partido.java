package com.viewnext.ej1.dto;

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
		
		if(golesLocal>golesVisitante) {
			eLocal.pGanados(golesLocal);	
		}
		else if (golesVisitante>golesLocal) {
			eVisitante.pGanados(golesVisitante); 
		}
	}
		
	public String resultadoFinal() {
		return eLocal.getNombre()+" "+golesLocal+"-"+golesVisitante+" "+eVisitante.getNombre();
	}
		
}
