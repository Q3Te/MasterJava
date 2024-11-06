package com.masterjava.service;
	import org.springframework.stereotype.Service;

/**
* Clase MessageService
* @author Manuel Portal
* @version 4.3.3, 30 oct 2024
*/

@Service
public class MessageService {
	public String message() {
		return "Testing from Spring Service";
	}
}