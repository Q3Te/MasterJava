package com.masterjava.service;
	import java.util.List;
	import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.masterjava.enums.Disponible;
	import com.masterjava.modelos.Hotel;
	import com.masterjava.repository.HotelesRepository;

@Service
public class HotelServiceImpl implements HotelService {

	@Autowired
	HotelesRepository repository;
	
	@Override
	public List<Hotel> listaHotelesdisponibles() {
		return repository.findByDisponible(Disponible.SI);
	}

	@Override
	public List<Hotel> findByNombre(String nombre) {
		return null;//repository.findByNombre(nombre);
	}
	
	@Override
	public int getHotelIdByNombre(String nombreReserva) {
         Hotel hotel = repository.findByNombre(nombreReserva);
     
        if(hotel== null)
        {
        	System.out.println("MAL");
            return hotel.getIdHotel(); 
        }
        else
        {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Hotel no encontrado");
        }
    }
	
	//JUnit Testing
    public boolean nombreHotelEs(Hotel hotel) {
        return "PlazaMaster".equalsIgnoreCase(hotel.getNombre());
    }

    public boolean precioHotel(Hotel hotel) {
        return hotel.getPrecio() == 150;
    }
}