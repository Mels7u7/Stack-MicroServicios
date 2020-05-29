package com.servicio.producto.model.service;

import java.util.List;

import com.servicio.commons.model.entity.Producto;

public interface IProductoService {

	public List<Producto>findAll();
	public Producto findById(Long Id);
	public Producto save(Producto producto);
	public void deleteById(Long id);
}
