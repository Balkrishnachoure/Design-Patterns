package com.design.designpattern.BehaviouralDPObserverP2;

public class UserObserverGettingUpdates implements Observer  {

	String notification  ;
	private Subject subject ; 
	
	
	public  UserObserverGettingUpdates( Subject subject ) 
	{
		this.subject = subject ;
		this.subject.addObserver(this);
		
	}
	@Override
	public void update(String notification) {  
		this.notification= notification ;
		 showNotification();
	}
	
	public void showNotification() 
	{
		System.out.println("Notification  >>> " +notification );
		System.out.println();
	}	

}
