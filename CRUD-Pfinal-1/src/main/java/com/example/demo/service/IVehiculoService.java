package com.example.demo.service;

import java.util.List;
import com.example.demo.entity.Vehiculo;

public interface IVehiculoService {
	public List<Vehiculo> listarTodos();
	public void grabar(Vehiculo vehiculo);
	public Vehiculo buscarPorId(Long id);
	public void eliminar(Long id);
}
