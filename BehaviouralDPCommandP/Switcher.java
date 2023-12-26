package com.design.designpattern.BehaviouralDPCommandP;

import java.util.ArrayList;
import java.util.List;

//Invoker - Knows how to execute the command
// It knows only about the command execution  
public class Switcher {

	private List<Command> commands;

	public Switcher() {
		this.commands = new ArrayList<>();
	}

	public void addCommand(Command command) {
		this.commands.add(command);

	}

	public void exeuteCommand() {
		for (Command c : commands) {
			c.execute();
		}

	}

}
