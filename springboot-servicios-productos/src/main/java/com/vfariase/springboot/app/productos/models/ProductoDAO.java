package com.vfariase.springboot.app.productos.models;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vfariase.springboot.app.productos.entity.Producto;

public interface ProductoDAO extends JpaRepository<Producto, Long> {

}
