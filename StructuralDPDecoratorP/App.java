package com.design.designpattern.StructuralDPDecoratorP;

public class App {
	
	public static void main(String[] args)
	{
		Beverage beverage = new  PlainBeverage() ;
		System.out.println( "Cost >>"+ beverage.getCost() );
		System.out.println("Description >>" +beverage.getDescription() );
		
		Beverage beverage2 = new Milk(beverage) ;
		
		System.err.println("Adding Milk Cost >>  " +beverage2.getCost());
		System.out.println("Dsecription >>  " +beverage2.getDescription() );
	}

}
