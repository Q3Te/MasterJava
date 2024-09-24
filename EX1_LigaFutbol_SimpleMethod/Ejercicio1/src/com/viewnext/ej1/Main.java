package com.viewnext.ej1;

import com.viewnext.ej1.dto.Equipo;
import com.viewnext.ej1.dto.Jugador;
import com.viewnext.ej1.dto.Liga;
import com.viewnext.ej1.dto.Partido;

public class Main{
public static void main (String args[]){
	Liga liga = new Liga();
	
	Equipo equipo1 = new Equipo("atletico varillas");
	Equipo equipo2 = new Equipo("atletico del madrid");
	Equipo equipo3 = new Equipo("atleti de bilbao");
	Equipo equipo4 = new Equipo("getafe");
	
	Jugador jugador1 = new Jugador("carlos");
	Jugador jugador2 = new Jugador("juan");
	Jugador jugador3 = new Jugador("jesus");
	Jugador jugador4 = new Jugador("daniel");
	Jugador jugador5 = new Jugador("david");
	Jugador jugador6 = new Jugador("Pablo");
	Jugador jugador7 = new Jugador("manuel");
	Jugador jugador8 = new Jugador("messi");
	
	equipo1.addJugador(jugador1);
	equipo1.addJugador(jugador2);
	equipo2.addJugador(jugador3);
	equipo2.addJugador(jugador4);
	equipo3.addJugador(jugador5);
	equipo3.addJugador(jugador6);
	equipo4.addJugador(jugador7);
	equipo4.addJugador(jugador8);
	
	liga.addEquipo(equipo1);
	liga.addEquipo(equipo2);
	liga.addEquipo(equipo3);
	liga.addEquipo(equipo4);
	
	Partido partido1 = new Partido(equipo1,equipo2);
	Partido partido2 = new Partido(equipo3,equipo4);
	Partido partido3 = new Partido(equipo2,equipo3);
	Partido partido4 = new Partido(equipo4,equipo1);

	partido1.proceso_Resultado(2,3);
	liga.addPartido(partido1);
	partido2.proceso_Resultado(4,1);
	liga.addPartido(partido2);
	partido3.proceso_Resultado(7,3);
	liga.addPartido(partido3);
	partido4.proceso_Resultado(1,4);
	liga.addPartido(partido4);
	
	jugador1.masGoles(2);
	jugador2.masGoles(4);
	jugador3.masGoles(4);
	jugador4.masGoles(6);
	jugador5.masGoles(5);
	jugador6.masGoles(2);
	jugador7.masGoles(3);
	jugador8.masGoles(2);
	
	System.out.println();
	for(Partido p: liga.partidos()){
		System.out.println(p.resultadoFinal());
	}
	System.out.println();
	for(Equipo e: liga.getEquipos()){
	System.out.println(e.getNombre()+" Partidos Ganados: "+e.getPGanados());
	}
	System.out.println();
	for(Equipo e: liga.getEquipos()) {
		System.out.println(e.ordenarGoles());
	}
	
	}
}
 