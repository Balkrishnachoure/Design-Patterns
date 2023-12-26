package com.design.designpattern.BehaviouralDPObserverP2;

public class App {

	public static void main( String [] args)
	{
		EmailSubjectToGenerateInfo emalEmailSubjectToGenerateInfo = new EmailSubjectToGenerateInfo() ;
		UserObserverGettingUpdates userObserverGettingUpdates = new  UserObserverGettingUpdates(emalEmailSubjectToGenerateInfo) ;
		 
		emalEmailSubjectToGenerateInfo.setnotification("Notification Send to the User >>");
		
		
		
	}
	
	
}
