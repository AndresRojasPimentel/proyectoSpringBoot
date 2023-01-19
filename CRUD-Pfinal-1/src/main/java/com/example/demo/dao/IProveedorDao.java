package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.Proveedor;

public interface IProveedorDao extends CrudRepository<Proveedor, Long> {

}
