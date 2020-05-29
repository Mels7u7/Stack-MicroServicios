package com.servicio.producto.model.dao;

import org.springframework.data.repository.CrudRepository;

import com.servicio.commons.model.entity.Producto;

public interface IProductoRepository extends CrudRepository<Producto,Long>{

	
}
