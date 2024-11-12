package com.masterjava.service;
	import java.util.List;

import com.masterjava.modelos.Reserva;

public interface ReservasService {
	public List<Reserva> reservas();
	public void registroReserva(Reserva reserva);  //Interacts with VuelosService para actualizar las plazas disponibles al realizar la reserv
	public List<Reserva> reservasExistentes(String nombreHotel); //Lista porque puede haber mas de una reserva a un mismo hotel
}
