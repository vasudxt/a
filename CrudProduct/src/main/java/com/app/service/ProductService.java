package com.app.service;

import java.util.List;

import com.app.pojos.Product;

public interface ProductService {
	List<Product> getAllProducts();
	Product AddProducts(Product newProduct);
}
