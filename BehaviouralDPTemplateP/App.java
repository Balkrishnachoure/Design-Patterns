package com.design.designpattern.BehaviouralDPTemplateP;

public class App {

	public static void main(String[] args) {
		int[] nums = { 1, 5, 3, -2, 10, 12, 8, 6 };

		Algorithm sorting = new BubbleSort(nums);
		sorting.sort();

	}

}
