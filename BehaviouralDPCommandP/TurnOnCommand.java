package com.design.designpattern.BehaviouralDPCommandP;


// Concrete Command - This implements Command and it knows everything about 
// Reciever 
public class TurnOnCommand  implements Command  {
   
	private Light light ;
	
	public TurnOnCommand( Light light) 
	{
		this.light = light ;	
	}
	
	@Override
	public void execute() {	
		light.turnOn();	
	}

}
