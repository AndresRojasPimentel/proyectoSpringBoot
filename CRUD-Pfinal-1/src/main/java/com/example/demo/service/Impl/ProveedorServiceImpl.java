package com.example.demo.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IProveedorDao;
import com.example.demo.entity.Proveedor;
import com.example.demo.service.IProveedorService;

import jakarta.transaction.Transactional;

@Service
public class ProveedorServiceImpl implements IProveedorService {
	@Autowired
	private IProveedorDao repository;
	
	@Override
	public List<Proveedor> listarTodos() {
		List<Proveedor> lista= (List<Proveedor>) repository.findAll(); 
		return lista;
	}
	
	@Transactional(rollbackOn=Exception.class)
	@Override
	public void grabar(Proveedor proveedor) {
		// TODO Auto-generated method stub
		repository.save(proveedor);
		
	}

	@Override
	public Proveedor buscarPorId(Long id) {
		// TODO Auto-generated method stub
		Proveedor bean= repository.findById(id).orElse(null);
		return bean;
	}

	@Override
	public void eliminar(Long id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

}
