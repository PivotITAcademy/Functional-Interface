package com.exampleOfFunctionalInterface;

public class ExampleMain {

	public static void main(String[] args) {
		Dealership ds=new Honda();
	
		ds.verifyVin();
		
		ds.itsDefault();
		
		Dealership.itsStatic();
		
		
		Dealership ds1=new Dealership() {
			
			@Override
			public void verifyVin() {
				System.out.println("Verify VIN in Main class");
				
			}
		};
		
		ds1.verifyVin();
		
		Dealership ds2=()-> System.out.println("Verify VIN using lambda");
		
		ds2.verifyVin();

	}

}
