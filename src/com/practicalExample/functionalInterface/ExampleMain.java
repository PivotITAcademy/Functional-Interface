package com.practicalExample.functionalInterface;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class ExampleMain {

	public static void main(String[] args) {

		List<Product> myProductsList = ExampleData.getProducts();

		for (Product product : myProductsList) {
			if (product.getName().equalsIgnoreCase("oranges")) {
				System.out.println(product.getPrice());
			}
		}

		myProductsList.stream().filter(p -> p.getName().equalsIgnoreCase("oranges"))
				.forEach(p -> System.out.println(p.getPrice()));

		// Different way of generating Streams
		Stream<Product> sp = myProductsList.stream();

		Stream<String> sp1 = Stream.of("one", "two", "three");
		sp1.sorted().forEach(s->System.out.println(s));

		// Difference from collection iteration

		// Find First
		Optional<Product> findFirstProduct = myProductsList.stream().findFirst();

		System.out.println(findFirstProduct.get().getName());

		// Find Any
		Optional<Product> findAnyProduct = myProductsList.stream().findAny();

		System.out.println(findAnyProduct.get().getName());

	}

	public static Optional<String> getName() {
		return Optional.empty();
	}

	public static String getName2() {
		return null;
	}

}
