package com.design.designpattern.BehaviouralDPStrategyPattern;

public class Addition  implements Strategy{
	
	public void execute( int num1 , int num2)
	{
		System.out.println( "Addition >>" +(num1 +num2));
	}

}
