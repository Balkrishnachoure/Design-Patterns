package com.design.designpattern.StructuralDPDecoratorP;

public class Sugar extends BeverageDecorator {

	public Sugar(Beverage beverage) {
		super(beverage);
		// It will become Beverage beverage = new Sugar() ;

	}

	public int getCost() {
		return beverage.getCost() + 1;
	}

	public String getDescription() {
		return beverage.getDescription() + "Sugar";
	}

}
