package com.design.designpattern.BehaviouralDPCommandP2;

// Reciever -Does the work itself 
public class Task {
	int id;
	public Task(int id) {
		this.id = id;
	}
	public void solveProblem()
	{
		System.out.println(" Solving the problem "+id);
	}
}
