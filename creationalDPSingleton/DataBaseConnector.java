package com.design.designpattern.creationalDPSingleton;

public class DataBaseConnector {
	
	private static DataBaseConnector INSTANCE ;
	
	// So that we cannot Instantiate the class 
	private DataBaseConnector()
	{	
	}
	
	public static DataBaseConnector getInstance() 
	{
		if(INSTANCE ==null)
		{		 
			INSTANCE = new DataBaseConnector() ;
		}
		return INSTANCE ;
	}
	
	public void connect()
	{
		System.out.println("Connecting to DB >>>>>" );
	}
	
	

}
