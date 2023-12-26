package com.design.designpattern.StrategyPatternExercise;

public class App {

	public static void main(String[] args) {
		OperationManager operationManager = new OperationManager();
		// operationManager.setStrategy(new Laptops());
		operationManager.setStrategy(new TV());
		operationManager.showImage();

	}

}
