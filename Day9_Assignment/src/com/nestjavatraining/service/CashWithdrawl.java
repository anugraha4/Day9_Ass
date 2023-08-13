package com.nestjavatraining.service;

import com.nestjavatraining.entity.Account;

public class CashWithdrawl implements Service{
	
	
	@Override
	public String getStatus(Account account,double amount) {
		
		String status;
		
		if(account.getBalance()>amount) {
			
			account.setBalance(account.getBalance()-amount);
			status="Cash withdrawed successfull";
		}
		else {
			
			status="Sorry transaction is cancelled";
		}
		
		return status;
	}
}
