package com.service;

import java.util.List;


import com.entity.Productos;


public interface IProductoService {
	public List<Productos>listarTodos();
	public void grabar(Productos productos);
	public Productos buscarPorId(Long id);
	public void eliminar(Long id);
}


