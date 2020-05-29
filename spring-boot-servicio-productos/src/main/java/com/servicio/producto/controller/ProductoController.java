package com.servicio.producto.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.servicio.commons.model.entity.Producto;
import com.servicio.producto.model.service.IProductoService;

@RestController
public class ProductoController {
	
	@Value("${server.port}")
	private Integer port;
	
	@Autowired
	private IProductoService pS;
	
	@GetMapping("/listar")
	public List<Producto> listar(){
		return pS.findAll().stream().map(producto->{
			producto.setPort(port);
			return producto;
		}).collect(Collectors.toList());
	}
	@GetMapping("/ver/{id}")
	public Producto detalle(@PathVariable Long id) throws Exception {
		Producto producto = pS.findById(id);
		producto.setPort(port);

		return producto;
		
		
	}
	@PostMapping("/crear")
	@ResponseStatus(HttpStatus.CREATED)
	public Producto crear(@RequestBody Producto producto) {
		return pS.save(producto);
	}
	@PutMapping("/editar/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Producto editar(@RequestBody Producto producto,@PathVariable Long id) {
		Producto productoDB = pS.findById(id);
		productoDB.setNombre(producto.getNombre());
		productoDB.setPrecio(producto.getPrecio());
		return pS.save(productoDB);
	}
	@DeleteMapping("/eliminar/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void eliminar(@PathVariable Long id) {
		pS.deleteById(id);
	}
}
