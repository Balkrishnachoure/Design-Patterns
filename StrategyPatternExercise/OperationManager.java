package com.design.designpattern.StrategyPatternExercise;

public class OperationManager {
	
	private Strategy strategy ; 
	
	public void setStrategy( Strategy strategy   )
	{
		this.strategy =strategy ;
	}
	
	public void showImage()
	{
		this.strategy.showImage();
	}

}
