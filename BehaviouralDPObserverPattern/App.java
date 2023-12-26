package com.design.designpattern.BehaviouralDPObserverPattern;

public class App {
	
	
	public static void main(String [] args)
	{
		WhetherStation  whetherStation = new WhetherStation() ; 
		DisplayToObserve displayToObserve =new DisplayToObserve(whetherStation) ;
		
		// DisplayToObserve displayToObserve1 =new DisplayToObserve(whetherStation) ;
		whetherStation.setPressure(10);
		whetherStation.setTemperature(22);
		whetherStation.setHumidity(5);
	}

}
