package com.Example.Counsumer;

import java.util.function.Consumer;

public class ExampleConsumer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// Implementation using lambda
		Consumer<String> consumer= s-> System.out.println(s.contains("n"));
		consumer.accept("Manvir");
	}
	
	//Old Implementation
	public void printSomething(String s) {
		System.out.println(s.contains("n"));
	}

}
