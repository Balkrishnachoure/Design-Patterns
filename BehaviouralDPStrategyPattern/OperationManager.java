package com.design.designpattern.BehaviouralDPStrategyPattern;


//This is the Abstraction layer 
public class OperationManager {

	private Strategy strategy  ;
	
	
	
	// To initialize the Required Object of class
	public void setStrategy(Strategy strategy)
	{
		 this.strategy = strategy ;
	}
	
	
	// To call the common method
	public void execute(int num1 ,int num2)
	{
		this.strategy.execute(num1, num2);
		
	}
	
	
	
}
