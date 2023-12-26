package com.design.designpattern.BehaviouralDPObserverPattern;

public class DisplayToObserve implements Observer {

	
	int pressure ;
	int temperature ;
	int humidity ;
	private  Subject subject ;
	
	
	public  DisplayToObserve( Subject subject) 
	{ 
		this.subject = subject ;
		this.subject.addObserver(this);
		
	}
	
	
	
	@Override
	public void update(int pressure, int temperature, int humidity) {
		  
		 this.pressure = pressure ;
		 this.temperature = temperature ;
		 this.humidity =humidity ;	
		 showData();
	}
	
	
	public void showData() 
	{
		System.out.println("Pressure >>" +this.pressure  +
				           "Temp >>  " +this.temperature +
				           "Humidity >>" +this.humidity   );
	}
	
	
	

}
