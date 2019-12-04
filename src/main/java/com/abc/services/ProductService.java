package com.abc.services;

import com.abc.dtos.ProductDto;
import com.abc.utils.InMemoryDatabase;

public class ProductService {
	
	public ProductDto getProductById(Integer id) {
		return InMemoryDatabase.productList.get(id);
	}

}
