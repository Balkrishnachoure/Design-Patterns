package com.design.designpattern.BehaviouralDPStrategyPattern;

public class Multiplication implements Strategy {

	public void execute( int num1 , int num2)
	{
		System.out.println("Multiplication >>" +(num1*num2));
	}
	
	
}
