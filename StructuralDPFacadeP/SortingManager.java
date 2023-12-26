package com.design.designpattern.StructuralDPFacadeP;

// This is Nothing but the Facade Layer 
public class SortingManager {

	private BubbleSort bubbleSort;
	private QuickSort quickSort;
	private MergeSort mergeSort;

	public SortingManager() {
		this.bubbleSort = new  BubbleSort() ;
		this.quickSort =  new QuickSort() ;
		this.mergeSort =  new  MergeSort() ;
	}

	public void doBubbleSort() {
		this.bubbleSort.sort();

	}

	public void doQuickSort() {
		this.quickSort.sort();
	}
	
	public void doMergerSort() 
	{
		this.mergeSort.sort();
	}

}
