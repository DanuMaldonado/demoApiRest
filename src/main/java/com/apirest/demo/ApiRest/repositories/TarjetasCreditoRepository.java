package com.apirest.demo.ApiRest.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.apirest.demo.ApiRest.models.TarjetasCredito;

@Repository
public interface TarjetasCreditoRepository extends CrudRepository<TarjetasCredito, Long>{

		
}
