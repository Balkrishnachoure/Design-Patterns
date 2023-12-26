package com.design.designpattern.creationalDpFactoryExercise;

public class App {
	
	public static void main(String [] args )
	{
		
		 BankAccount bankAccount = BankAccountFactory.createAccount(AccountType.PERSONAL) ;
		 bankAccount.validateUser();
		 bankAccount.calculateInterestRate();
		 bankAccount.registerAccount();
		
		
	}

}
