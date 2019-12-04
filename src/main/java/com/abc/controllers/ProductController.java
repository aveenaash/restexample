package com.abc.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.abc.dtos.ProductDto;
import com.abc.services.ProductService;
import com.abc.utils.InMemoryDatabase;

@RestController
@RequestMapping("/product")
public class ProductController {

	private ProductService productService;

	@GetMapping(value = "/get")
	public ProductDto getProduct() {
		System.out.println("i am inside get product");
		ProductDto pd = new ProductDto();
		pd.setId(20);
		pd.setName("Iohone 11");
		pd.setDescription("this is laterst iphone");

		return pd;
	}

	@GetMapping(value = "")
	public ProductDto getProductById(@RequestParam(value = "id", required = true) Integer productId) {
		return productService.getProductById(productId);

	}

	public ProductService getProductService() {
		return productService;
	}

	public void setProductService(ProductService productService) {
		this.productService = productService;
	}

}
