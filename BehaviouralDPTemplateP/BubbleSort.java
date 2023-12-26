package com.design.designpattern.BehaviouralDPTemplateP;

//Using Inheritance in Template Pattern 
public class BubbleSort extends Algorithm {

	public BubbleSort(int[] nums) {
		super(nums);
	}

	@Override
	protected void initialize() {

		System.out.println("Initializing Sorting ... !! ");

	}

	@Override
	protected void sorting() {

		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length - i - 1; j++) {
				if (nums[j] > nums[j + 1]) {
					swap(j, j + 1);
				}

			}

		}

	}

	@Override
	protected void showResult() {

		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
	}

}
