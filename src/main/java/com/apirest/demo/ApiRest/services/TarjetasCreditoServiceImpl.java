package com.apirest.demo.ApiRest.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apirest.demo.ApiRest.models.TarjetasCredito;
import com.apirest.demo.ApiRest.repositories.TarjetasCreditoRepository;

@Service
public class TarjetasCreditoServiceImpl implements TarjetasCreditoService {
	
	@Autowired
	TarjetasCreditoRepository tarjetasCreditoRepository;

	@Override
	public ArrayList<TarjetasCredito> getAllUser() {
		
		return (ArrayList<TarjetasCredito>) tarjetasCreditoRepository.findAll();
	}

	@Override
	public Optional<TarjetasCredito> getUserByid(long id) {

		return tarjetasCreditoRepository.findById(id);
	}

	@Override
	public TarjetasCredito saveUser(TarjetasCredito tc) {
		return tarjetasCreditoRepository.save(tc);
	}

	@Override
	public boolean deleteUserById(long id) {
		
		try {
			Optional<TarjetasCredito> tc =  getUserByid(id);
			tarjetasCreditoRepository.delete(tc.get());
			return true;
			
		}catch(Exception e){
			return false;
		}
	}

}
