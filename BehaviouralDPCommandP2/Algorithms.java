package com.design.designpattern.BehaviouralDPCommandP2;

import java.util.concurrent.BlockingQueue;

// Invoker - It knows how to excecute  the command  also it do not know anything about the concrete
// commands , it knows only about command interface ...

public class Algorithms {

	private BlockingQueue<Command> commands;

	public Algorithms() {
		this.commands = commands;
	}

	public void produce() {
		try {
			for (int i = 0; i < 10; i++) {
				commands.put(new TaskSolver(new Task(i + 1)));
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void consume() {
		try {
			for (int i = 0; i < 10; i++) {
				Thread.sleep(1000);
				commands.take().execute();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
