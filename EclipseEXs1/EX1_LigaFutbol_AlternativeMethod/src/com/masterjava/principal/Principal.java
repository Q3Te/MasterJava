package com.masterjava.principal;

import com.masterjava.modelos.Equipo;
import com.masterjava.modelos.Jugador;
import com.masterjava.modelos.Liga;
import com.masterjava.modelos.Partido;

public class Principal {

	public static void main(String[] args) {
		Liga liga = new Liga();
		
		Equipo equipo1 = new Equipo("Real Madrid");
		Equipo equipo2 = new Equipo("Barcelona");
		Equipo equipo3 = new Equipo("Betis");
		Equipo equipo4 = new Equipo("Sevilla");
		
		Jugador jugador1 = new Jugador("Juan");
		Jugador jugador2 = new Jugador("Pedro");
		Jugador jugador3 = new Jugador("David");
		Jugador jugador4 = new Jugador("Qwery");
		Jugador jugador5 = new Jugador("Alex");
		Jugador jugador6 = new Jugador("Xzavier");
		Jugador jugador7 = new Jugador("Bimbo");
		Jugador jugador8 = new Jugador("Kika");
		
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

		partido1.proceso_Resultado(5,0);
		liga.addPartido(partido1);
		partido2.proceso_Resultado(3,2);
		liga.addPartido(partido2);
		partido3.proceso_Resultado(1,1);
		liga.addPartido(partido3);
		partido4.proceso_Resultado(1,4);
		liga.addPartido(partido4);
		
		jugador1.masGoles(1);
		jugador2.masGoles(3);
		jugador3.masGoles(2);
		jugador4.masGoles(1);
		jugador5.masGoles(0);
		jugador6.masGoles(0);
		jugador7.masGoles(1);
		jugador8.masGoles(0);
		
		System.out.println();
		for(Partido p: liga.partidos())
		{
			System.out.println(p.resultadoFinal());
		}
		
		System.out.println();
		for(Equipo e: liga.getEquipos())
		{
			System.out.println(e.getNombre()+" Partidos Ganados ["+e.getPGanados()+"]");
		}
		
		System.out.println();
		for(Equipo e: liga.getEquipos())
		{
			System.out.println(e.getNombre()+" -->"+e.ordenarGoles());
		}

	}
}