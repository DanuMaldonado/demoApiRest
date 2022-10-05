package com.apirest.demo.ApiRest.controllers;



import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apirest.demo.ApiRest.models.TarjetasCredito;
import com.apirest.demo.ApiRest.services.TarjetasCreditoService;

@RestController
@RequestMapping("api")
public class ApiDemo{

@Autowired
TarjetasCreditoService tarjetasCreditoService;

@GetMapping("/saludar")
public String saludar( ) {return "Hola";}

@GetMapping("/all")
public ArrayList<TarjetasCredito> getAllUser(){
	return tarjetasCreditoService.getAllUser();
	
}

@GetMapping("/find/{id}")
public Optional<TarjetasCredito> getUserById(@PathVariable("id") long id){
	return tarjetasCreditoService.getUserByid(id);
}



}
