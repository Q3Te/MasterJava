package com.masterjava.ex1;
	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.Comparator;
	import java.util.List;


public class Equipo {
	private String nombre;
	private ArrayList<Jugador> jugadores;
	private static List<Equipo> equipos = new ArrayList<>(); //List para instanciar un arrayList
	private int p_Ganados;
	
	public Equipo(String nombre) {
		this.nombre=nombre;
		this.jugadores=new ArrayList<>();
		this.p_Ganados=0;
	}

	public String getNombre() {
		return nombre;
	}

	public int getP_Ganados() {
		return p_Ganados;
	}
	
	public void p_Ganados(){
		this.p_Ganados++;
	}
	
	public int getPartidosGanados() {
	    return p_Ganados; 
	}


	public void annadeJugador(Jugador jugador) {	//References jugador when using proper method of Añadir Jugador
		jugadores.add(jugador);
	}
	
    public List<Jugador> getJugadores() { //References Partido Class asignarGolesAleatorios to asign goles to players
        return jugadores;
    }
    
  public static void crearEquipo(String nombreEquipo) {
	if(nombreEquipo!=null && !nombreEquipo.isEmpty())
    {
		Equipo equipo = new Equipo(nombreEquipo);
        equipos.add(equipo);
        System.out.println("Equipo con nombre: ["+nombreEquipo+"] creado.");
    } 
    else 
    {
        System.out.println("Error al crear un equipo");
    }
}

  public void annadirJugador(String nombreJugador) {
      if (nombreJugador!=null && !nombreJugador.isEmpty())
      {
          Jugador jugador = new Jugador(nombreJugador);
          this.annadeJugador(jugador);           	//equipos.add(jugador); NO, BC THAT TRIES TO ADD JUGADOR TO EQUIPOS LIST (EQIPOS OBJECT) AND NOT JUGADOR OBJECT	
          System.out.println("Jugador  con nombre: ["+nombreJugador+"] añadido");
      }
      else
      {
          System.out.println("Error al añadir el jugador");
      }
  }

  public static Equipo buscarEquipoPorNombre(String nombreEquipo) {  //USED TO LOOK FOR RECENTLY CREATED TEAM
      for (Equipo equipo : equipos)
      {
          if(equipo.getNombre().equals(nombreEquipo))
          {
              return equipo;
          }
      }
      return null;
  }
//  
//  public static Equipo buscarJugadorPorNombre(String nombreJugador) {  //USED TO LOOK FOR PLAYERS
//      for (Jugador jugador : jugadores)
//      {
//          if(jugador.getNombre().equals(nombreEquipo))
//          {
//              return equipo;
//          }
//      }
//      return null;
//  }
  
  public void addEquipoToLiga(Equipo equipo) {
	    equipos.add(equipo);
	}
  
  public void mostrarEquipo() {
	    System.out.println("Equipo: "+nombre);
	    System.out.println("Jugadores:");
	    for (Jugador jugador : jugadores)
	    {
	        System.out.println("- "+jugador.getNombre());
	    }
	}

	public List<Jugador> jugadoresPorGoles(){ //References Liga Class listar to get jugadores in JugadoresDeEquiposOrdenadosPorGoles
		Collections.sort(jugadores, Comparator.comparingInt(Jugador::getG_Marcados).reversed()); //jugadores is sorted by number the G_Marcados from Jugador class
		return jugadores;
	}
	
	@Override
	public String toString() {
		return "Equipo ["+nombre+" con "+p_Ganados+" partidos ganados]";
	}
}