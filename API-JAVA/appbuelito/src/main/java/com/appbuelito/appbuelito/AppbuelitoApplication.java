package com.appbuelito.appbuelito;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppbuelitoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppbuelitoApplication.class, args);
		Appbuelito persona1 = new Appbuelito("User", "default", "email@example.com", "12345");
		persona1.mostrarLogin();
		persona1.registro();
	}

}
