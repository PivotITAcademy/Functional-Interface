package com.hashmap.example;

import java.util.HashMap;
import java.util.Hashtable;

public class ExampleHashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, Integer> hm = new HashMap<>();

		hm.put("Manvir", 50);
		hm.put("Sanil", 150);
		hm.put("Navjot", 250);
		hm.put("Lekshmi", 350);
		hm.put("Kuldeep", 450);
		
		//hm.entrySet().stream().filter(p->p.getValue()>275).forEach(System.out::println);
		
		System.out.println(hm.entrySet().stream().findAny());

		
		Hashtable<String, Integer> ht=new Hashtable<>();
		ht.put("Manvir", 50);
		ht.put("Sanil", 150);
		ht.put("Navjot", 250);
		ht.put("Lekshmi", 350);
		ht.put("Kuldeep", 450);
		
		System.out.println(ht.entrySet().stream().findAny());
		
	}

}
