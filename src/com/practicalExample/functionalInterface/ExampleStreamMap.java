package com.practicalExample.functionalInterface;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class ExampleStreamMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Product> myListOfProducts=ExampleData.getProducts();
		
		myListOfProducts.stream().map(p->p.getName()).filter(p->!p.contains("a")).forEach(s->System.out.println(s));;
		

	}

}
