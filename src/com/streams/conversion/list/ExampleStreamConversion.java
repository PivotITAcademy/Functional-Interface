package com.streams.conversion.list;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.practicalExample.functionalInterface.Category;
import com.practicalExample.functionalInterface.ExampleData;
import com.practicalExample.functionalInterface.Product;

public class ExampleStreamConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Product> myList = ExampleData.getProducts();

		List<Category> list=myList.stream().filter(product -> product.getCategory() == Category.FOOD).map(s -> s.getCategory())
				.collect(Collectors.toList());
		
		
		list.forEach(s->System.out.println(s));
		
		
		List<String> namesList=List.of("MANVIR","Kuldeep","Navjot","Swaroop");
		
		Stream<Object> secondNameList=namesList.stream().filter(s->s.contains("a")).map(s->s);
		
		secondNameList.forEach(s->System.out.println(s));

	}

}
