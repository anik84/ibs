package com.wellsfargo.batch7.group1.IBS.ui;

import java.sql.SQLException;
<<<<<<< HEAD
=======
import java.time.LocalDate;
import java.util.List;
>>>>>>> 7dc73a75b5e18529308d1d5fd5b0675b0573d976
import java.util.Scanner;
import com.wellsfargo.batch7.group1.IBS.dto.Account;
import com.wellsfargo.batch7.group1.IBS.exception.AccountException;
import com.wellsfargo.batch7.group1.IBS.services.AccountService;
import com.wellsfargo.batch7.group1.IBS.services.AccountServiceImpl;

public class AccountManagementApplication {
	
	static AccountService accountService;
	static Scanner scan;

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		accountService=new AccountServiceImpl();
		scan = new Scanner(System.in);
		
		int choice = -1;
		
		while(choice!=4) { //quit option is 4
			System.out.println("Choice\t\tAccountManagementOperation");
			System.out.println("============================================");
			System.out.println("1\t\tAddAccount");
			System.out.println("2\t\tWithdraw");
			System.out.println("3\t\tDeposit");
			System.out.println("4\t\tBalance");
			System.out.println("5\t\tQuit");
			
			System.out.print("Choice> ");
			choice = scan.nextInt();
			
			switch(choice) {
			case 1: doAddAccount(); break;
			case 2: doWithdraw(); break;
			case 3: doDeposit(); break;
			case 4: balance(); break;
			case 5: System.out.println("APP CLOSED"); break;
			default:System.out.println("Unknown Choice!"); break;
			}
		}
		
	}

	static void doDeposit() throws SQLException {
		
        
		System.out.print("Account Number: ");
		int acctNumber=scan.nextInt();
		System.out.print("Amount: ");
		int Amount=scan.nextInt();
		try {
			accountService.deposit(Amount,acctNumber);
<<<<<<< HEAD
			System.out.println("Amount deposited Successfully in Account");
=======
			System.out.println("Amount deposited Successfully in Account"+acctNumber+":"+Amount);
>>>>>>> 7dc73a75b5e18529308d1d5fd5b0675b0573d976
		} catch (AccountException e) {
			System.out.println("Err: " + e.getMessage());
		}
	}
	
	static void balance() {
		
<<<<<<< HEAD
		
=======
		Account account =new Account();
>>>>>>> 7dc73a75b5e18529308d1d5fd5b0675b0573d976
        	
		System.out.print("Account Number: ");
		int account1=scan.nextInt();
		
		try {
<<<<<<< HEAD
			Account account=accountService.balance(account1);
	        System.out.println("Balance:");
	        System.out.println(account.getAcctNumber()+"\t" +account.getAcctBalance()+"\t"+account.getAcctType()+"\t"+account.getAccountUCI());
=======
			accountService.balance(account1);
	        System.out.println("Balance:");
>>>>>>> 7dc73a75b5e18529308d1d5fd5b0675b0573d976
		} catch (AccountException e) {
			System.out.println("Err: " + e.getMessage());
		}
	}
	
	static void doWithdraw() {
		
		System.out.print("Account Number: ");
		int  acctNumber =scan.nextInt();
		System.out.print("Amount to withdraw: ");
		int amount=scan.nextInt();
		
		try {
<<<<<<< HEAD
			accountService.withdraw(amount,acctNumber);
			System.out.println("Amount withdraw Successfully in Account ");
=======
			accountService.withdraw(acctNumber, amount);
			System.out.println("Amount withdraw Successfully in Account "+acctNumber+":"+amount);
>>>>>>> 7dc73a75b5e18529308d1d5fd5b0675b0573d976
		} catch (AccountException e) {
			System.out.println("Err: " + e.getMessage());
		}
	}
	
<<<<<<< HEAD
	static void doAddAccount() throws SQLException {
=======
	static void doAddAccount() {
>>>>>>> 7dc73a75b5e18529308d1d5fd5b0675b0573d976
		Account account =new Account();
		
		System.out.print("Account Number: ");
		account.setAcctNumber(scan.nextInt());
<<<<<<< HEAD
		System.out.print("Amount: ");
		account.setAcctBalance(scan.nextInt());
		System.out.print("Account Type: ");
		account.setAcctType(scan.next());
		System.out.print("UCI: ");
		account.setAccountUCI(scan.nextLong());
=======
		System.out.print("Account Type: ");
		account.setAcctType(scan.next());
		System.out.print("UCI: ");
		account.setAccountUCI(scan.nextInt());
		System.out.print("Amount: ");
		account.setAcctBalance(scan.nextInt());
>>>>>>> 7dc73a75b5e18529308d1d5fd5b0675b0573d976
		
		
		try {
			accountService.addAccount(account);
			System.out.println("Account Details Saved!");
		} catch (AccountException e) {
			System.out.println("Err: " + e.getMessage());
		}
	}
	
}
