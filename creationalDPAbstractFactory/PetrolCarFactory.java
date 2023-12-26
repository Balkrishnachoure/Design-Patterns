package com.design.designpattern.creationalDPAbstractFactory;

public class PetrolCarFactory   implements AbstractFactory{
	
	public  Car getCar(String type)
	{
		if(type.equalsIgnoreCase("FORD"))
		{
			return new PetrolFord() ;
		}else if( type.equalsIgnoreCase("TOYOTA"))
		{
			return new PetrolToyota() ;
		}
		return null  ;
		
	}
	
	

}
