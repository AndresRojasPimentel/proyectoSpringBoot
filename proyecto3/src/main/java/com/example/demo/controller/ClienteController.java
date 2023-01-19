package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Cliente;
import com.example.demo.service.IClienteService;

@RestController
@RequestMapping("/api")
public class ClienteController {
	@Autowired
	private IClienteService service;
	@GetMapping("/listar")
	public List<Cliente> getClientes(){
		return service.listarTodos();
	}
}
