package com.vfariase.springboot.app.productos.service;

import java.util.List;

import com.vfariase.springboot.app.productos.entity.Producto;

public interface IProductoService  {

	public List<Producto> findAll();
	public Producto findById(Long id);
	
}
