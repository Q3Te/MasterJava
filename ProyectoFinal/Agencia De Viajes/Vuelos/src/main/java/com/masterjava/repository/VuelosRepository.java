package com.masterjava.repository;
	import org.springframework.data.jpa.repository.JpaRepository;	
	import com.masterjava.modelos.Vuelo;
	//import org.springframework.data.repository.query.Param;

public interface VuelosRepository extends JpaRepository<Vuelo, Integer> {
//	@Query("SELECT v from Vuelo v WHERE v.id_vuelo = :id_vuelo")
//	Vuelo findByVueloId(@Param("id_vuelo")int id_vuelo	//Retorna un solo Vuelo objeto  & Es distinto a findById que es una anotacion de JPA
}