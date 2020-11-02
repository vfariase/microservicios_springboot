package com.vfariase.springboot.app.productos.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.vfariase.springboot.app.productos.entity.Producto;
import com.vfariase.springboot.app.productos.service.IProductoService;
import com.vfariase.springboot.app.productos.service.ProductoServiceImpl;

@RestController
public class ProductoController {

	
	@Autowired
	private IProductoService iProductoService;
	
	@GetMapping("/listar")
	public List<Producto> listar() {
		return iProductoService.findAll();
	}
	
	
	@GetMapping("/ver/{id}")
	public Producto detalle(@PathVariable  Long id) {
		return iProductoService.findById(id);
	}
	
	
}
