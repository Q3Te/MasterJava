package com.curso.fechas;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class ChronoUnit1 {

	public static void main(String[] args) {
		
		//Años, meses y días transcurridos entre dos fechas
		
		LocalDate fNacimiento = LocalDate.of(2002, Month.MAY, 15);
		
		System.out.println("Tu edad es de " +
		  ChronoUnit.YEARS.between(fNacimiento, LocalDate.now())
		  + " años."
		);
		System.out.println("Desde tu nacimiento han pasado  " +
				  ChronoUnit.MONTHS.between(fNacimiento, LocalDate.now())
				  + " meses."
				);
		System.out.println("Tu edad es de " +
				  ChronoUnit.DAYS.between(fNacimiento, LocalDate.now())
				  + " días."
				);

	}

}
