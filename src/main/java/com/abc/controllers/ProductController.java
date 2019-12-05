package com.abc.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

	@GetMapping(value = "/demo")
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
	
	@GetMapping(value = "/all")
	public List<ProductDto> getAllProducts() {
		return productService.getProducts();

	}
	
	@PostMapping(value = "")
	public void createProduct(@RequestBody ProductDto pd) {
		//productService.createProduct(pd);
		System.out.println(pd.toString());
	}
	
	
	@GetMapping(value = "/{id}/details")
	public ProductDto getProductByIdAgain(@PathVariable(value = "id") Integer productId) {
		return productService.getProductById(productId);

	}
	
	
	

	public ProductService getProductService() {
		return productService;
	}

	public void setProductService(ProductService productService) {
		this.productService = productService;
	}

}
