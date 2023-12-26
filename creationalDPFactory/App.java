package com.design.designpattern.creationalDPFactory;

public class App {

	public static void main(String [] args)
	{
		
		// Holding the required object from AnimalFactory in Animal  interface reference  
		Animal animal = AnimalFactory.getAnimal(AnimalType.LION) ;
	    animal.eat(); 
		
	}
	
	
}
