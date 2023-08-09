package com.example.indiano;

import org.springframework.boot.SpringApplication;
//import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
//@ComponentScan(basePackages = {"com.example.indiano.controller"} )
//@ComponentScan(basePackages = {"indiano\\src\\main\\java\\com\\example\\indiano\\controller"} )

public class IndianoApplication {

	public static void main(String[] args) {
		SpringApplication.run(IndianoApplication.class, args);
	}

}
