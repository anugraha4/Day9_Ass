package com.nestjavatraining.utility;

import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nestjavatraining.entity.Account;
import com.nestjavatraining.service.Service;

public class Main {
	
	public static void main(String[] args) {
		
		Service theService;
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
		
		Account account = new Account("AC001","WomenSavingsAccount","Savings Account",1000);
		
		int choice;
		
		do {
		
			System.out.println("1.ATMWIthdrawl 2.CashDeposit 3.CashWithdrawl 4.CheckDeposit 5.Exit");
			
			Scanner scanner= new Scanner(System.in);
			
			choice=scanner.nextInt();
		
			switch(choice) {
			
			case 1:
				theService=context.getBean("atmWithdrawl",Service.class);
				
				System.out.println("Enter the amount");
				double amount=scanner.nextDouble();
				
				System.out.println(theService.getStatus(account, amount));
				
				break;
				
			case 2:
				theService=context.getBean("cashDeposit",Service.class);
				
				System.out.println("Enter the amount");
				double amount1=scanner.nextDouble();
				
				System.out.println(theService.getStatus(account,amount1));
				
				break;
				
			case 3:
				theService=context.getBean("cashWithdrawl",Service.class);
				
				System.out.println("Enter the amount");
				double amount2=scanner.nextDouble();
				
				System.out.println(theService.getStatus(account, amount2));
				
				break;
				
			case 4:
				
				theService=context.getBean("checkDeposit",Service.class);
				
				System.out.println("Balance amount is =" + account.getBalance());
				
				break;
				
				
			case 5:
				System.out.println("Thank you");
				
				
				break;
				
			default:
				
				System.out.println("Invalid choice");
			}
		}while(choice<5||choice>5);
		context.close();
		
		
	}

}
