package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;
import com.example.demo.entity.Vehiculo;

public interface IVehiculoDao extends CrudRepository<Vehiculo, Long>{
	
}
