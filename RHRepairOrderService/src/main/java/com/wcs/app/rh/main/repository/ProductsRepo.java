package com.wcs.app.rh.main.repository;

import org.springframework.data.repository.CrudRepository;

import com.wcs.app.rh.main.models.Products;

public interface ProductsRepo  extends CrudRepository<Products, Integer>{

}
