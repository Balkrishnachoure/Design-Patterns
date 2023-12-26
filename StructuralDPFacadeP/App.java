package com.design.designpattern.StructuralDPFacadeP;

public class App {

	public static void main(String[] args) {
		// By Facade Pattern we can chose which algo is going to be exectued
		SortingManager sortingManager = new SortingManager();
		// sortingManager.doBubbleSort();
		// sortingManager.doMergerSort();
		sortingManager.doQuickSort();

	}

}
