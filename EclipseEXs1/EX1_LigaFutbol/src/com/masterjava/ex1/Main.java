package com.masterjava.ex1;

import java.util.Scanner;

public class Main {
	 private static Liga liga = new Liga(); 

private static void crearEquipo(Scanner teclado) {	
	String nombreEquipo, nombreJugador;
    char resp;

    System.out.println("Nombre equipo: ");
    nombreEquipo=teclado.nextLine();
    Equipo.crearEquipo(nombreEquipo);
    
    Equipo equipo = Equipo.buscarEquipoPorNombre(nombreEquipo);
    if(equipo ==null)
    {
        System.out.println("Error al buscar equipo creado.");
        return;
    }
    
    System.out.println("Ahora vas a añadir jugadores: (Minimo 1)");
    System.out.println("Nombre jugador: ");
    nombreJugador=teclado.nextLine();
    equipo.annadirJugador(nombreJugador);
  
    System.out.println("Desea añadir otro jugador (s/n): ");
	resp=teclado.next().charAt(0);
	teclado.nextLine();
  		
	while(resp=='s')
	{
		System.out.println("Nombre jugador: ");
		nombreJugador=teclado.nextLine();
		equipo.annadirJugador(nombreJugador);
		
		System.out.println("Desea añadir otro jugador (s/n): ");
		resp = teclado.next().charAt(0);
		teclado.nextLine();
	}
    
	equipo.mostrarEquipo(); 
	liga.annadeEquipo(equipo);
}

private static void jugarPartido(Scanner teclado) {
	String equipLocal, equipVisi;
	int gLocal, gVisi;
    System.out.println("Nombre equipo local:");
    equipLocal = teclado.nextLine();
    Equipo local = liga.buscarEquipoPorNombre(equipLocal);

    System.out.println("Nombre equipo visitante:");
    equipVisi = teclado.nextLine();
    Equipo visitante = liga.buscarEquipoPorNombre(equipVisi);

    if(local!=null && visitante!=null)
    {
        System.out.println("Goles equipo local:");
        gLocal = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Goles equipo visitante:");
        gVisi = teclado.nextInt();
        teclado.nextLine();

        Partido partido = new Partido(local, visitante, gLocal, gVisi);
        partido.proceso_Resultado(gLocal,gVisi);  
        liga.annadirPartido(local, visitante, gLocal, gVisi);
        System.out.println("Partido jugado "+partido);
    }
    else
    {
        System.out.println("Uno o ambos equipos no encontrados.");
    }
}

private static void partidosConResultados() {
    liga.listarPartidosConResultados();
}

private static void jugadoresOrdenadosPorGoles() {
    liga.listarJugadoresDeEquiposOrdenadosPorGoles();
}

private static void equiposOrdenadosPorPartidosGanados() {
    liga.listarEquiposPorPartidosGanados();
}

private static void mostrarLiga() {
	liga.mostrarLiga();
}


public static void main(String[] args) {
			Scanner teclado = new Scanner(System.in);
			Liga liga = new Liga();
			
			int op;
			  do {
			          System.out.println("Elige una opción: \n\n"
			                  + "1- Crear equipo con jugadores\n"
			                  + "2- Jugar partido\n"
			                  + "3- Listar partidos con sus resultados\n"
			                  + "4- Listar jugadores de cada equipo ordenados por goles marcados\n"
			          		  + "5- Listar equipos de liga ordenados por partidos ganados\n"
			          		  + "6- Mostrar Liga\n"
			          		  + "7- Salir\n");
			          op=teclado.nextInt();
			          teclado.nextLine();
			
			          switch (op) {
			              case 1:
			            	  crearEquipo(teclado);
			              	break;
			              	
			              case 2:
			            	  jugarPartido(teclado);
			              	break;
			              	
			              case 3:
			            	  partidosConResultados();
			              	break;
			              case 4:
			            	  jugadoresOrdenadosPorGoles();
			          	break;
			              case 5:
			          			equiposOrdenadosPorPartidosGanados();
			          	break;
			              case 6:
			          			mostrarLiga();
			          	break;
			              case 7:
			                  	System.out.println("Saliendo del sistema.");
			                  break;
			              default:
			                  	System.out.println("Opción no válida.");
			          }
			  } while (op<=6);
	}
}