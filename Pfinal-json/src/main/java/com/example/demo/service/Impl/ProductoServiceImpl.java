package com.example.demo.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IProductoDao;
import com.example.demo.entity.Producto;
import com.example.demo.service.IProductoService;

@Service
public class ProductoServiceImpl implements IProductoService{
	@Autowired
	IProductoDao repository;

	@Override
	public List<Producto> listarTodos() {
		List<Producto> lista= (List<Producto>) repository.findAll();
		return lista;
	}
	
	
}
