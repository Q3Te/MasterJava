package com.masterjava.repository;
	import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.masterjava.modelos.Reserva;
//	import org.springframework.data.jpa.repository.Query;
//	import org.springframework.data.repository.query.Param;
//	import java.util.List;

public interface ReservasRepository extends JpaRepository<Reserva, Integer>{	
//	@Query("SELECT r from Reserva r WHERE r.nombre_cliente = :nombre_cliente")
//	List<Reserva> findByNombreCliente (@Param("nombre_cliente") String nombre_cliente);
	 
	@Query("SELECT r FROM Reserva r WHERE r.idHotel = :idHotel")
	List<Reserva> findByHotelId(@Param("idHotel") int idHotel);
}