package com.servicio.producto.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.servicio.producto.model.dao.IProductoRepository;
import com.servicio.commons.model.entity.Producto;
@Service
public class ProductoServiceImpl implements IProductoService{

	@Autowired
	private IProductoRepository productorepository;
	
	@Override
	@Transactional(readOnly = true)
	public List<Producto> findAll() {
		return (List<Producto>)productorepository.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Producto findById(Long Id) {
		return productorepository.findById(Id).orElse(null);
	}

	@Override
	@Transactional
	public Producto save(Producto producto) {
		return productorepository.save(producto);
	}

	@Override
	@Transactional
	public void deleteById(Long id) {
		productorepository.deleteById(id);
	}

}
