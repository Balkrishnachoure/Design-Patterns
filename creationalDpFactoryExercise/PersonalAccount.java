package com.design.designpattern.creationalDpFactoryExercise;

public class PersonalAccount  implements BankAccount {
	
	
	public void validateUser() {
		System.out.println("Validating personal Account user  >> ");
	}
	
	public void calculateInterestRate()
	{
		System.out.println(" Validating Personal Account Interest Rate >> " );
	}
	public void registerAccount()
	{
		System.out.println("  Registering Personal Account  User   >>  ");
	}

	
	

}
