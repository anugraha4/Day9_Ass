package com.nestjavatraining.service;

import com.nestjavatraining.entity.Account;

public class ATMWithdrawl {
	
	public String getStatus(Account account, double amount) {
		
		String status;
		
		if(account.getBalance()> amount+1) {
			
			account.setBalance(account.getBalance() - (amount + 1));
			
			status = "Cash withdrawed successfully.ATM fee will be debited";
			
			
		}
		else
		
		{
			
			status="Sorry this transaction is cancelled";
		}
		
		return status;
	}

}
