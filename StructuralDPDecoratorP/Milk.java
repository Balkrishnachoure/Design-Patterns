package com.design.designpattern.StructuralDPDecoratorP;

public class Milk extends BeverageDecorator {

	public Milk(Beverage beverage) {
		super(beverage);
		/// super() is used to call the constructor of super class - Constructor
		/// Chaining
		// So it will make - Beverage beverage = new Milk() ;
		// Subclassee of beverageDecorator can override the methods of Beverage Intefer
		/// .
	}

	public int getCost() {
		return beverage.getCost() + 3;

	}

	public String getDescription() {
		return beverage.getDescription() + "milk";

	}

}
