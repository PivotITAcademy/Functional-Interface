package com.Example.Predicate;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class ExamplePredicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Predicate<String> predicate=(String s)->s.contains("Singh");
		boolean val=predicate.test("Sahib Singh");
		System.out.println(val);
		
		
		List<String> myList=new ArrayList<>(List.of("one","two","three","Four","Five"));
		Predicate<String> pre= s->s.contains("o");
		//myList.removeIf(pre);
		
		/*
		 * for (int i = 0; i < myList.size(); i++) { System.out.println(myList.get(i));
		 * 
		 * }
		 */
		Consumer<String> consumer=s->System.out.println(s.toUpperCase());
		myList.forEach(consumer);
		
		Function<String, Integer> function=(String s)->s.length();
		
		
		Comparator<String> comparator=Comparator.comparing(s->s.length());
		
		myList.sort(comparator);
		
		System.out.println(myList);
		
		
		
		
		
	}

}
