package com.design.designpattern.creationalDPSingleton;

public class SingletonDesign {
	
	public static void main(String [] args)
	{	
   
    // For Single Thread  Database Connection 		
	//	DataBaseConnector.getInstance().connect() ;
		
    //For Multiple Thread Connection:
	// But this is slow performance wise 
	//	DataBaseConnectorForMultipleThreads.getInstance().connect();
		
	// For Enum Based  
    // In this Enum makes the instance Thread safe by Default bcz enums are complie 
	// time constant .	
	// DataBaseConnectorUsingEnum.INSTANCE.connect();	
	
	}
	
	
	
}
