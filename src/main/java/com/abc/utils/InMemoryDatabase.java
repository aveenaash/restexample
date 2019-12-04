package com.abc.utils;

import java.util.HashMap;
import java.util.Map;

import com.abc.dtos.ProductDto;

public class InMemoryDatabase {
	
	public static Map<Integer, ProductDto> productList;
	
	static{
		productList = new HashMap<Integer, ProductDto>();
		
		ProductDto pd1 = new ProductDto();
		pd1.setId(20);
		pd1.setName("Iohone 11");
		pd1.setDescription("this is laterst iphone");
		productList.put(20, pd1);
		
		ProductDto pd2 = new ProductDto();
		pd2.setId(21);
		pd2.setName("Mac");
		pd2.setDescription("this is macbook");
		productList.put(21, pd2);
		
		ProductDto pd3 = new ProductDto();
		pd3.setId(22);
		pd3.setName("samsumg");
		pd3.setDescription("this is note samsun");
		productList.put(22, pd3);
		
		
	}

}
