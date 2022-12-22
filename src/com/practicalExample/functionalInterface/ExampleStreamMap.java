package com.practicalExample.functionalInterface;

import java.math.BigDecimal;
import java.util.List;

public class ExampleStreamMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Product> myListOfProducts=ExampleData.getProducts();
		
		myListOfProducts.stream().map(p->p.getName()).filter(p->!p.contains("a")).forEach(s->System.out.println(s));
		
		BigDecimal bg = new BigDecimal("10.00");
		myListOfProducts.stream().anyMatch(p->p.getPrice().compareTo(bg)<0);
		
		
	}

}
