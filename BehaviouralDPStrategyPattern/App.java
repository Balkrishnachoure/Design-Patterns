package com.design.designpattern.BehaviouralDPStrategyPattern;

public class App {
	
	
	public static void main(String [] args)
	{
		 OperationManager operationManager = new OperationManager() ; 
		 operationManager.setStrategy( new Addition());
		 operationManager.execute(2, 5);	
	}

}
