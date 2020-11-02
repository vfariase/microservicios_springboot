package com.vfariase.springboot.app.productos.service;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.vfariase.springboot.app.productos.entity.Producto;
import com.vfariase.springboot.app.productos.models.ProductoDAO;

@Service
public class ProductoServiceImpl implements IProductoService{

	@Autowired
	private ProductoDAO productoDAO;
	
	@Override
	@Transactional(readOnly = true)
	public List<Producto> findAll() {
		return productoDAO.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Producto findById(Long id) {
		return productoDAO.findById(id).orElse(null); 
	}

}
