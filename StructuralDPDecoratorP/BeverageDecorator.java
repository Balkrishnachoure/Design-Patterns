package com.design.designpattern.StructuralDPDecoratorP;

//BeverageDecorator serve as base class for concrete class
public class BeverageDecorator implements Beverage {

	protected Beverage beverage;

	public BeverageDecorator(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public int getCost() {

		return this.beverage.getCost();
	}

	@Override
	public String getDescription() {

		return this.beverage.getDescription();
	}

}
