package com.design.designpattern.creationalDpFactoryExercise;

public class BankAccountFactory {

	public static BankAccount createAccount(AccountType type) {
		if (type == AccountType.PERSONAL) {
			return new PersonalAccount();
		} else if (type == AccountType.BUSINESS) {
			return new BusinessAccount();
		} else if (type == AccountType.SAVING) {
			return new SavingAccount();
		}
		return null;

	}

}
