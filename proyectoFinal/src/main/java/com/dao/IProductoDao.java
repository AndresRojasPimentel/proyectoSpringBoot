package com.dao;

import org.springframework.data.repository.CrudRepository;

import com.entity.Productos;

public interface IProductoDao extends CrudRepository<Productos, Long> {

}
