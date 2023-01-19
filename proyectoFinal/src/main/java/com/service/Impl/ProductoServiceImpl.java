package com.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.IProductoDao;
import com.entity.Productos;
import com.service.IProductoService;

import jakarta.transaction.Transactional;


@Service
public class ProductoServiceImpl implements IProductoService{
	@Autowired
	private IProductoDao productoDao;
	@Override
	public List<Productos> listarTodos() {
		List<Productos> lista=(List<Productos>) productoDao.findAll();
		
		return lista;
	}
	
	@Transactional(rollbackOn = Exception.class)

	@Override
	public void grabar(Productos productos) {
		// TODO Auto-generated method stub
		productoDao.save(productos);
		
	}

	@Override
	public Productos buscarPorId(Long id) {
		Productos bean= productoDao.findById(id).orElse(null);
		return bean;
	}

	@Override
	public void eliminar(Long id) {
		// TODO Auto-generated method stub
		productoDao.deleteById(id);
	}

}
