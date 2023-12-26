package com.design.designpattern.BehaviouralDPCommandP2;

// Concrete Command -It Know everthing about Reciever 
public class TaskSolver  implements Command {

	private Task task;
	public TaskSolver(Task task) {
		this.task = task;
	}

	public void execute() {
		this.task.solveProblem();
	}

}
