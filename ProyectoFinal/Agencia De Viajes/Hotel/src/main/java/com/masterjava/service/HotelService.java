package com.masterjava.service;
	import java.util.List;
	import com.masterjava.modelos.Hotel;

public interface HotelService {
	public List<Hotel> listaHotelesdisponibles();
	List<Hotel> findByNombre(String nombre); //Method found in HotelRepository
	public int getHotelIdByNombre(String nombreReserva);
}