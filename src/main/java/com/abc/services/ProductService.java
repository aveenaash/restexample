package com.abc.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.abc.dtos.ProductDto;
import com.abc.utils.InMemoryDatabase;

@Service
public class ProductService {
	
	public ProductDto getProductById(Integer id) {
		return InMemoryDatabase.productList.get(id);
	}
	
	
	public List<ProductDto> getProducts() {
		ArrayList<ProductDto> valueList = 
				new ArrayList<ProductDto>(InMemoryDatabase.productList.values());

		return valueList;
	}
	
//	public void createProduct(ProductDto p) {
//		InMemoryDatabase.productList.put(p.getId(), p);
//	}

}
