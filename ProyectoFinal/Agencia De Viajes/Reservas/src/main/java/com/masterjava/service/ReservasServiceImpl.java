package com.masterjava.service;
	import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.masterjava.modelos.Reserva;
import com.masterjava.repository.ReservasRepository;

@Service
public class ReservasServiceImpl implements ReservasService {
	@Autowired
	ReservasRepository repository;
	
	@Autowired
	RestTemplate template; //Para poder trabajar entre carpetas diferentes
	private String url1="http://localhost:8000/";
	private String urlfinal="2023-03-25/250";
//	private String url1="http://localhost:8000/listaVuelosDisponibles";
	
	private String url2="http://localhost:7000/hotelesidpornombre/";
    
	@Override
	public void registroReserva(Reserva reserva) {

		repository.save(reserva);
		//template.put(url1+"actualizarVuelo/"+reserva.getIdVuelo()+"/"+reserva.getNumPersonaQueFormanReserva()+"/"+urlfinal, null);
		template.put("http://localhost:8000/actualizarVueloDeReserva/1/15",null);
				 
	}
	
	@Override
	public List<Reserva> reservas() {
		return repository.findAll();
	}
	
	@Override
	public List<Reserva> reservasExistentes(String nombreHotel){     
        int idHotel = template.getForObject(url2+nombreHotel, Integer.class);    // Llama a HotelService para obtener idHotel
        return repository.findByHotelId(idHotel);	//Query a ReservaRepo con idHotel
}
	
//	//BELONGS TO ReservasRepository
//    public List<Reserva> findByNombreCliente(String nombre_cliente) {
//        return repository.findByNombreCliente(nombre_cliente);
//    }
}