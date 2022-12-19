package com.Example.Comparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class ExampleComparator {

	public static void main(String[] args) {

		List<String> myList = Arrays.asList("one", "two", "three", "four", "five", "six", "seven", "eight");

		// Lexiograph comparsion
		Comparator<String> comparatorLexio = (s1, s2) -> s1.compareTo(s2);
		myList.sort(comparatorLexio);
		System.out.println(myList);

		// Comparsion based on Length

		Comparator<String> comparatorLength = (s1, s2) -> Integer.compare(s1.length(), s2.length());

		myList.sort(comparatorLength);

		System.out.println(myList);

		// Comparsion based on Length -2

		Function<String, Integer> function = s -> s.length();
		Comparator<String> comparatorLength2 = Comparator.comparing(function);

		myList.sort(comparatorLength2.reversed());
		System.out.println(myList);

		User manvir = new User("Manvir", 34);
		User Swaroop = new User("Swaroop", 35);
		User sanil = new User("Sanil", 36);
		User sahib = new User("Sahib", 30);
		User navjot = new User("Navjot", 25);

		List<User> userList = Arrays.asList(manvir, Swaroop, sanil, sahib, navjot);

		// Comparison based upon Name
		Comparator<User> compName = Comparator.comparing(user -> user.getName());

		userList.sort(compName);
		userList.forEach(user -> System.out.println(user.getName()));

		// Comparison based upon Age
		Comparator<User> compAge = Comparator.comparing(user -> user.getAge());

		userList.sort(compAge);
		userList.forEach(user -> System.out.println(user.getName()));

		userList.sort(compName.thenComparing(compAge));
		userList.sort(compAge);
		userList.forEach(user -> System.out.println(user.getName()));
	}

}
