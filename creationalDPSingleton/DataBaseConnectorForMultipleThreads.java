package com.design.designpattern.creationalDPSingleton;

public class DataBaseConnectorForMultipleThreads {

	private static DataBaseConnectorForMultipleThreads INSTANCE;

	// Constructor is private so taht we cant instantiate the class
	private DataBaseConnectorForMultipleThreads() {
	}

	public static DataBaseConnectorForMultipleThreads getInstance() {
		if (INSTANCE == null) {
			synchronized (DataBaseConnectorForMultipleThreads.class) {
				INSTANCE = new DataBaseConnectorForMultipleThreads();
			}
		}
		return INSTANCE;

	}
	
	public void connect() 
	{
		System.out.println("Connecting to DataBase >>>>> " );
	}
	

}
