package com.masterjava.service;
	import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringMain {

public static void main(String[] args) {
	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
	context.register(SpringConfigurator.class);
	context.refresh();

	MessageService service = context.getBean(MessageService.class);
	System.out.println(service.message());

	context.close();
 }
}