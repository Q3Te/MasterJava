package com.masterjava.controller;
	import java.util.List;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.http.MediaType;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.PathVariable;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RestController;
	import com.masterjava.modelos.Hotel;
	import com.masterjava.service.HotelService;
	import io.swagger.v3.oas.annotations.tags.Tag;
/**
* Hotel Controller
* @author Manuel Portal
* @version 4.3.3, 7 nov 2024
*/

@Tag(name = "Hoteles", description = "La API de hoteles")
@RestController
@RequestMapping("/")
//@RequestMapping("/api/hoteles")
public class HotelController {

	@Autowired
	private HotelService hotelService;
	
	@GetMapping(value="hoteles", produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Hotel> listaHoteles() {
	    return hotelService.listaHotelesdisponibles();
	}
	
	// BELONGS TO HotelesRepository
	@GetMapping(value="datoshotel/{nombre}", produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Hotel> findByNombre (@PathVariable String nombre){
		return hotelService.findByNombre(nombre);
	}
	
	//BELONGS to Reservas para reservas existentes
//	@GetMapping(value="hotelesidpornombre/{nombreHotel}", produces=MediaType.APPLICATION_JSON_VALUE)
//    public int hotelesidpornombre(@PathVariable String nombreHotel) {
//       Hotel hotel = HotelesRepository.findByNombreReserva(nombreHotel);
//       
//   //    return hotel.getIdHotel();
//       if(hotel != null){
//           return hotel.getIdHotel();
//       }else{
//           throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Hotel no encontrado");
//       }
//    }

//    @GetMapping("/hotelesidpornombre/{nombreReserva}")
//    public int getHotelIdByNombre(@PathVariable String nombreReserva) {
//        return hotelService.getHotelIdByNombre(nombreReserva);
//    }
}