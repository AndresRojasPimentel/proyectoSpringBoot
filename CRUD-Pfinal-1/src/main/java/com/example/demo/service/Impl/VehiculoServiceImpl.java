package com.example.demo.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Vehiculo;
import com.example.demo.dao.IVehiculoDao;
import com.example.demo.service.IVehiculoService;

import jakarta.transaction.Transactional;

@Service
public class VehiculoServiceImpl implements IVehiculoService {
	@Autowired
	private IVehiculoDao repository;
	
	@Override
	public List<Vehiculo> listarTodos() {
		List<Vehiculo> lista = (List<Vehiculo>) repository.findAll();
		return lista;
	}
	
	@Transactional(rollbackOn=Exception.class)
	@Override
	public void grabar(Vehiculo vehiculo) {
		// guardar datos de vehiculo
		repository.save(vehiculo);
		
	}

	@Override
	public Vehiculo buscarPorId(Long id) {
		// buscar por id
		Vehiculo bean = repository.findById(id).orElse(null);
		return bean;
	}

	@Override
	public void eliminar(Long id) {
		// eliminar por id
		repository.deleteById(id);
	}
}
