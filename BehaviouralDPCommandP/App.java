package com.design.designpattern.BehaviouralDPCommandP;

public class App {
	
	public static void main(String [] args) throws InterruptedException 
	{ 
		 
		 Light light = new Light() ;
		//Concrete command Reciever Lega 
		TurnOnCommand turnOnCommand =new TurnOnCommand(light) ;
		
		
		
		//Switcher - Add the Commands and Execute it   
		Switcher switcher =new Switcher() ;
		switcher.addCommand(turnOnCommand);
		
		switcher.exeuteCommand();
		Thread.sleep(1000);
//		
//		TurnOffCommand turnOffCommand = new TurnOffCommand(light) ;
//		switcher.addCommand(turnOffCommand);
//		 switcher.exeuteCommand();
//		
		
	}

}
