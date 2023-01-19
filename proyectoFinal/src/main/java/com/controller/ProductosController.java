package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.entity.Productos;
import com.service.IProductoService;

@Controller
public class ProductosController {
	@Autowired
	private IProductoService productoService;
	
	@GetMapping("/listado")
	public String listar(Model model) {
		List<Productos> lista= productoService.listarTodos();
		model.addAttribute("titulo","LISTA DE PRODUCTOS");
		model.addAttribute("productos",lista);
		return "listado";
	}
	@GetMapping("/crear")
	public String crear(Model model) {
		Productos producto= new Productos();
		List<Productos> listaProducto=productoService.listarTodos();
		model.addAttribute("titulo", "NUEVO PRODUCTO");
		model.addAttribute("producto",producto);
		model.addAttribute("productos",listaProducto);
		return "frmEditar";
	}
	@PostMapping("/grabar")
	public String guardar(@ModelAttribute Productos producto) {
		productoService.grabar(producto);
		System.out.println("PRODUCTO GRABADO CON EXITO!!");
		return "redirect:http://localhost:8080/listado";
	}
	
	@GetMapping("/editar/{id}")
		public String editar(@PathVariable("id") Long id, Model model) {
			Productos producto = productoService.buscarPorId(id);
			List<Productos> listaProductos = productoService.listarTodos();
			model.addAttribute("titulo","EDITAR PRODUCTO ("+id+")");
			model.addAttribute("producto",producto);
			model.addAttribute("productos",listaProductos);
			return "frmEditar";
		}
	
	@GetMapping("/eliminar/{id}")
	public String eliminar(@PathVariable("id") Long id) {
		productoService.eliminar(id);
		System.out.println("PRODUCTO eliminado con exito!!");
		return "redirect:http://localhost:8080/listado"; 
	}
	
}
