package com.design.designpattern.BehaviouralDPCommandP;


//  Concrete Command - It implement the Command and knows everythin about 
// Receiver 
public class TurnOffCommand implements Command {
	private Light light;
	
	public TurnOffCommand(Light light) {
		this.light = light;
	}
	@Override
	public void execute() {
		light.turnOff();
	}

}
