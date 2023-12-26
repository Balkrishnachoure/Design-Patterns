package com.design.designpattern.BehaviouralDPStrategyPattern;

public class Division implements Strategy{
	
	
	public void execute( int num1 , int num2)
	{
		System.out.println("Division >>> " +(num1/num2));
		
	}

}
