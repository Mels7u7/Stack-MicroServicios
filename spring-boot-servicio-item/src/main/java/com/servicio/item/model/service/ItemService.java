package com.servicio.item.model.service;

import java.util.List;

import com.servicio.item.model.Item;
import com.servicio.commons.model.entity.Producto;

public interface ItemService {

	public List<Item>findAll();
	public Item findById(Long id, Integer cantidad);
	public Producto save(Producto producto);
	public Producto update(Producto producto, Long id);
	public void delete(Long id);
}
