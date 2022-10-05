package com.apirest.demo.ApiRest.services;

import java.util.ArrayList;
import java.util.Optional;

import com.apirest.demo.ApiRest.models.TarjetasCredito;

public interface TarjetasCreditoService {
	
	ArrayList<TarjetasCredito> getAllUser();
	Optional<TarjetasCredito> getUserByid(long id);
	TarjetasCredito saveUser(TarjetasCredito tc);
	boolean deleteUserById(long id);
}
