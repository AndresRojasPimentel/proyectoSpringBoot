package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Proveedor;

public interface IProveedorService {
	public List<Proveedor> listarTodos();
	public void grabar(Proveedor proveedor);
	public Proveedor buscarPorId(Long id);
	public void eliminar(Long id);
}
