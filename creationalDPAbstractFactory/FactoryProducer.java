package com.design.designpattern.creationalDPAbstractFactory;

public class FactoryProducer {

	public static AbstractFactory getFactory(String factory) {

		if (factory.equalsIgnoreCase("Electric")) {
			return new ElectricCarFactory();
		} else if (factory.equalsIgnoreCase("Petrol")) {
			return new PetrolCarFactory();
		}
		return null;
	}

}
