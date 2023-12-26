package com.design.designpattern.creationalDpFactoryExercise;

public class SavingAccount implements BankAccount  {
	
	public void validateUser() {
		System.out.println("Validating Saving Account user  >> ");
	}
	
	public void calculateInterestRate()
	{
		System.out.println(" Validating Saving Account Interest Rate >> " );
	}
	public void registerAccount()
	{
		System.out.println("  Registering Saving  Account  User   >>  ");
	}

}
