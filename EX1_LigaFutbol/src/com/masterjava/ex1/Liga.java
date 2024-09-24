package com.masterjava.ex1;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Collections;


public class Liga {
	private List <Equipo> equipos;
	private List <Partido> partidos;
	private List <Jugador> jugadores;
	
	public Liga() {
		equipos = new ArrayList <>();
		partidos = new ArrayList <>();
		jugadores = new ArrayList <>();
	}
	
	public void annadeEquipo(Equipo equipo) {
		equipos.add(equipo);
	}

	public void annadegoles(Jugador jugador) {
		jugadores.add(jugador);
	}
	
	public void mostrarLiga() {
	    for(Equipo equipo : equipos)
	    {
	        equipo.mostrarEquipo();
	        System.out.println();
	    }
	}
	
    public Equipo buscarEquipoPorNombre(String nombre) {	//Looks for TEAMS after user input to check that they exist
        for(Equipo equipo : equipos)
        {
            if(equipo.getNombre().equalsIgnoreCase(nombre))
            {
                return equipo;
            }
        }
        return null;
    }
    
    public void annadirPartido(Equipo local, Equipo visitante, int golesLocal, int golesVisitante) {
        Partido partido = new Partido(local, visitante, golesLocal, golesVisitante);
        partidos.add(partido);
    }
    

    public void listarPartidosConResultados() {
        if(partidos.isEmpty())
        {
            System.out.println("No hay partidos jugados.");
        }
        else
        {
            for(Partido partido : partidos)
            {
                System.out.println(partido);
            }
        }
    }

    public void listarEquiposPorPartidosGanados() {
        Collections.sort(equipos, Comparator.comparingInt(Equipo::getPartidosGanados).reversed());
        for (Equipo equipo : equipos)
        {
            System.out.println(equipo); // OR System.out.println(equipo.getNombre() + " con " + equipo.getP_Ganados() + " partidos ganados");
        }
    }

    public void listarJugadoresDeEquiposOrdenadosPorGoles() {
        for (Equipo equipo : equipos)
        {
            System.out.println("Equipo: " + equipo.getNombre());
            //List<Jugador> jugadoresOrdenados = equipo.jugadoresPorGoles(); // method sorts players¿
            for(Jugador jugador : equipo.jugadoresPorGoles())
            {
                System.out.println(jugador);
            }
        }
    }

}
