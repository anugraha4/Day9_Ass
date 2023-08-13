package com.nestjavatraining.service;

import com.nestjavatraining.entity.Account;

public class CashDeposit implements Service{
	
	@Override
	public String getStatus(Account account,double amount) {
		
		account.setBalance(account.getBalance() + amount);
		
		return "Cash deposited successfull";
	}

}
