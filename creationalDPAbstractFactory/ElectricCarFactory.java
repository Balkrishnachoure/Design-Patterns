package com.design.designpattern.creationalDPAbstractFactory;

public class ElectricCarFactory  implements AbstractFactory {
	
	
	 public Car getCar( String type  ) 
	 {
		 if( type.equalsIgnoreCase("FORD"))
		 {
			 return new ElectricFord() ;
		 }else if( type.equalsIgnoreCase("TOYOTA"))
		 {
			 return new ElectricToyota() ; 
		 }
		 return null ;
	 }

}
