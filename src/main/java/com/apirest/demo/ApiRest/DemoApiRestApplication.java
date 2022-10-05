package com.apirest.demo.ApiRest;

import java.util.ArrayList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApiRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApiRestApplication.class, args);
		
		
		ArrayList<String> items = new ArrayList<String>();
		items.add("FirstWord");
		items.add("SecondWord");
		items.add("THIRDWORD");
		
		System.out.print(items);
		
	}
	
	

}
