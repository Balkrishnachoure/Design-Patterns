package com.design.designpattern.creationalDpFactoryExercise;

public class BusinessAccount   implements BankAccount{
	
	public void validateUser() {
		System.out.println("Validating  Business Account user  >> ");
	}
	
	public void calculateInterestRate()
	{
		System.out.println(" Validating Business Account Interest Rate >> " );
	}
	public void registerAccount()
	{
		System.out.println("  Registering Business Account  User   >>  ");
	}

}
