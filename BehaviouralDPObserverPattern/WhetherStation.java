package com.design.designpattern.BehaviouralDPObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class WhetherStation  implements Subject{

	
	int pressure ; 
	int temperature ;
	int humidity ;
	List<Observer> observer  ;
	
	public WhetherStation() 
	{
		 this.observer = new ArrayList<>() ;
	}

	@Override
	public void addObserver(Observer  o   ) {
		
		this.observer.add(o) ;
		
	}

	@Override
	public void removeObserver(Observer o ) {
		this.observer.remove(o) ;
		
	}

	@Override
	public void notifyAllObservers() {
		
		for( Observer o : observer)
		{
			o.update(pressure, temperature, humidity);
			
		}
		
	}
	
	
	public void setPressure(int pressure)
	{
		this.pressure = pressure;
		notifyAllObservers();	
	}	
	public void setTemperature(int temperature)
	{
		this.temperature = temperature ; 
		notifyAllObservers();
		
	}
	
	 public void setHumidity( int humidity) 
	 {
		 this.humidity =humidity ;
		 notifyAllObservers();
	 }

}
