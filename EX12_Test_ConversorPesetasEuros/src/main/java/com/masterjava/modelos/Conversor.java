package com.masterjava.modelos;

import java.math.BigDecimal;

/**
*Clase Conversor
*@author Manuel Portal
*@version 4.33.0, 3 oct 2024
*/
public class Conversor {

	public double pesetasEuros(double pesetas) {
		double valorEuroDesdePeseteas=0.00601;
		double resultado=pesetas*valorEuroDesdePeseteas;
		
		 return BigDecimal.valueOf(resultado).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
	}
	
	public double eurosPesetas(double euros) {
		double valorPesetaDesdeEuros=166386.00;
		double resultado=euros*valorPesetaDesdeEuros;
		
		return BigDecimal.valueOf(resultado).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();	// euros*valorPesetaDesdeEuros;	
	}
}