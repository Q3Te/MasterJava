package com.masterjava.ex1;

import java.util.Random;
import java.util.Scanner;
import java.util.List;

public class Partido {
	private Equipo e_local; //It represents an object of equipo as we can update winner, goles, who scored etc
	private Equipo e_visitante;   //It represents an object of equipo as we can update winner, goles, who scored etc
	private int g_local;  
	private int g_visitante;  
	
	public Partido(Equipo e_local, Equipo e_visitante,  int g_local, int g_visitante) {
		this.e_local=e_local;
		this.e_visitante=e_visitante;
        this.g_local = g_local;
        this.g_visitante = g_visitante;
        
        asignarGolesAleatorios(e_local, g_local);  //2 TO 1 meaning g_local al e_local
        asignarGolesAleatorios(e_visitante, g_visitante); //2 TO 1 meaning g_visitante al e_visitante

	}
	
	public void proceso_Resultado(int g_local, int g_visitante) {
		
		if(g_local>g_visitante)
		{
			e_local.p_Ganados();
		}
		else if(g_visitante>g_local)
		{
			e_visitante.p_Ganados(); 
		}
	}
		
	public String resultadoFinal() {
		return e_local.getNombre()+" "+g_local+"-"+g_visitante+" "+e_visitante.getNombre();
	}
	
	public void asignarGolesAleatorios(Equipo equipo, int goles) {
		int i;
	    List<Jugador> jugadores = equipo.getJugadores();
//	    Random random = new Random();
	    
	    for(i=0; i<goles; i++)
	    {
	        Jugador jugador = jugadores.get(new Random().nextInt(jugadores.size())); 
	        jugador.incrementarGoles();  // you could do 	jugador.incrementarGoles(1);  keeping in Jugador incrementarGoles(int goles){ g_Marcados+=goles;}
//	        Random ran = new Random(); 
//	        
//	        int nxt = ran.nextInt(3,6); 
//	        System.out.println -->  ("Randomly Number" + nxt); //= 4
	    }
	}
	

// public void asignarGolesManualmente(Equipo equipo, int golesTotales, Scanner teclado) {
//    int golesTotalesMetodo = golesTotales;
//    while(golesTotalesMetodo>0)
//    {
//        System.out.println("Quien MARCO? (Nombre jugador): ");
//        String nombreJugador = teclado.nextLine();
//        Jugador jugador = equipo.buscarJugadorPorNombre(nombreJugador);
//
//        if(jugador!=null)
//        {
//            System.out.println("Cuantos goles anotó?");
//            int goles = teclado.nextInt();
//            teclado.nextLine(); 
//            
//            if(goles<=golesTotalesMetodo)
//            {
//                jugador.incrementarGoles(goles); 
//                golesTotalesMetodo -= goles;
//            }
//            else
//            {
//                System.out.println("No puede asignar más goles que el total.");
//            }
//        }
//        else
//        {
//            System.out.println("Error al encontrado un Jugador");
//        }
//    }
//}


		
	@Override
	public String toString() {
	    return e_local.getNombre() + " " + g_local + " - " + g_visitante + " " + e_visitante.getNombre();
	}

  }



