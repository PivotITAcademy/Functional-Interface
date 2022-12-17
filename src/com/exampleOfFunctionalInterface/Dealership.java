package com.exampleOfFunctionalInterface;

@FunctionalInterface
public interface Dealership {

	public void verifyVin();

	public static void itsStatic() {
		System.out.println("This is a static method inside Interface");
	}

	public default void itsDefault() {
		System.out.println("This is a default method");
	}

}
