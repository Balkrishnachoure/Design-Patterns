package com.design.designpattern.creationalDPAbstractFactory;

public class App {
	
	public static void main(String [] args )
	{
		  AbstractFactory factory = FactoryProducer.getFactory("Electric") ;
		  factory.getCar("Ford").assemble(); 
		
		
	}

}
