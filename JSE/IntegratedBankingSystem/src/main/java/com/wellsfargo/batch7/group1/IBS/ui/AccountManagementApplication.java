package com.wellsfargo.batch7.group1.IBS.ui;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;
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
		String acctNumber=scan.next();
		System.out.print("Amount: ");
		int NewAmount=scan.nextInt();
		try {
			accountService.deposit(acctNumber,NewAmount);
			System.out.println("Amount deposited Successfully in Account"+acctNumber+":"+NewAmount);
		} catch (AccountException e) {
			System.out.println("Err: " + e.getMessage());
		}
	}
	
	static void balance() {
		
		Account account =new Account();
        	
		System.out.print("Account Number: ");
		String account1=scan.next();
		
		try {
			accountService.balance(account1);
	        System.out.println(account.getAmount());
		} catch (AccountException e) {
			System.out.println("Err: " + e.getMessage());
		}
	}
	
	static void doWithdraw() {
		
		System.out.print("Account Number: ");
		String  acctNumber =scan.next();
		System.out.print("Amount to withdraw: ");
		int Newamount=scan.nextInt();
		
		try {
			accountService.withdraw(acctNumber, Newamount);
			System.out.println("Amount withdraw Successfully in Account "+acctNumber+":"+Newamount);
		} catch (AccountException e) {
			System.out.println("Err: " + e.getMessage());
		}
	}
	
	static void doAddAccount() {
		Account account =new Account();
		
		System.out.print("Account Number: ");
		account.setAcctNumber(scan.next());
		System.out.print("Account Holder Name: ");
		account.setAcctHolderName(scan.next());
		System.out.print("Account Type: ");
		account.setAcctType(scan.next());
		System.out.print("UCI: ");
		account.setUCI(scan.next());
		System.out.print("Amount: ");
		account.setAmount(scan.nextInt());
		System.out.println("Account Open Date(yyyy-MM-dd): ");
		account.setAcctOpenDate(LocalDate.parse(scan.next()));
		System.out.print("Account Status: ");
		account.setAcctStatus(scan.next());
		System.out.println("Maturity Date(yyyy-MM-dd): ");
		account.setMaturityDate(LocalDate.parse(scan.next()));
		
		try {
			accountService.addAccount(account);
			System.out.println("Account Details Saved!");
		} catch (AccountException e) {
			System.out.println("Err: " + e.getMessage());
		}
	}
	
}
