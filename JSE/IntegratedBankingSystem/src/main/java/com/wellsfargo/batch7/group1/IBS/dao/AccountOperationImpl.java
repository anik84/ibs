package com.wellsfargo.batch7.group1.IBS.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Date;
import org.apache.log4j.Logger;

import com.wellsfargo.batch7.group1.IBS.dto.Account;
import com.wellsfargo.batch7.group1.IBS.exception.AccountException;

public class AccountOperationImpl implements AccountOperation {
	
	public static final String INS_QRY = "INSERT INTO accountdetails(AcctNumber,Acctbalance,AcctType,AccountUCI) VALUES(?,?,?,?)";
	public static final String DEP_QRY = " update accountdetails set AcctBalance = AcctBalance + ? from accountdetails where AcctNumber = ? ";
	public static final String WITHDRAW_QRY = "UPDATE accountdetails SET AcctBalance = AcctBalance - ? from AccountDetails WHERE AcctNumber=?";
	public static final String SELECT_BY_AMT_QRY = "SELECT AcctBalance FROM accountdetails WHERE AcctNumber = ? ";
	public static final String SELECT_BY_ID_QRY = "SELECT AcctBalance FROM accountdetails WHERE AcctNumber = ? ";
	public static final String SELECT_ALL_QRY = "SELECT * FROM accountdetails";
	
	
	Logger log = Logger.getLogger("dao");
	
	

	@Override
	public Account addAccount(Account account) throws AccountException {
		// TODO Auto-generated method stub
		if (account != null) {
			try (Connection con = ConnectionProvider.getConn(); PreparedStatement ps = con.prepareStatement(INS_QRY)) {

				ps.setInt(1, account.getAcctNumber());
				ps.setInt(2, account.getAcctBalance());
				ps.setString(3, account.getAcctType());
				ps.setInt(4, account.getAccountUCI());
				ps.executeUpdate();
			} catch (SQLException exp) {
				log.error(exp);
				throw new AccountException("Operation Failed Due To An Error!");
			}
		}
		return account;
	}


		
	






	@Override
	public int balance(int AcctNumber) throws AccountException {
		// TODO Auto-generated method stub
		int Amount=0;
		try (Connection con = ConnectionProvider.getConn(); 
				PreparedStatement ps = con.prepareStatement("SELECT_BY_AMT_QRY"
						)) {
			
			ps.setInt(2, AcctNumber);

			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				
			 Amount=rs.getInt(1);
			
			}
		} catch (SQLException exp) {
			exp.printStackTrace();
			
		}	
		 return Amount;
		 
	}

	@Override
	public void deposit(int Amount,int AcctNumber) throws SQLException {
		// TODO Auto-generated method stub
		try (Connection con = ConnectionProvider.getConn()) {
			
			PreparedStatement ps = con.prepareStatement("DEP_QRY");
			ps.setInt(1,Amount);
			ps.setInt(2,AcctNumber);
			ps.executeUpdate();
		/*	try (Connection con1 = ConnectionProvider.getConn(); 
					PreparedStatement ps1 = con1.prepareStatement(SELECT_BY_ID_QRY)) {
            
				ps1.setInt(1, Amount);
				ps1.setString(2,AcctNumber);
				ResultSet rs = ps1.executeQuery();
				
				if(rs.next()) {
					
				 
					rs.getInt(1);
					 rs.getString(2);
					
				
			} catch (SQLException exp) {
				exp.getMessage();
				/*log.error(exp);
				throw new AccountException("Operation Failed Due To An Error!");*/
			}
		catch (SQLException exp) {
			/*log.error(exp);
			throw new AccountException("Operation Failed Due To An Error!");*/
			exp.getMessage();
		}
		
	}










	@Override
	public void withdraw(int  AcctNumber, int Amount) throws AccountException {
try (Connection con = ConnectionProvider.getConn(); PreparedStatement ps = con.prepareStatement(WITHDRAW_QRY)) {
			
			ps.setInt(1,AcctNumber);
			ps.setInt(2,Amount);
			ps.executeUpdate();
			/*try (Connection con1 = ConnectionProvider.getConn(); 
					PreparedStatement ps1 = con1.prepareStatement(SELECT_BY_ID_QRY)) {
				
                ps1.setInt(7, NewAmount);
                ps1.setString(1,AcctNumber);
				ResultSet rs = ps1.executeQuery();
				
				if(rs.next()) {
					
				 
				 rs.getInt(1);
				 rs.getString(2);
					
				}
			} catch (SQLException exp) {
				exp.getMessage();
				/*log.error(exp);
				throw new AccountException("Operation Failed Due To An Error!");*/
			}
		catch (SQLException exp) {
			/*log.error(exp);
			throw new AccountException("Operation Failed Due To An Error!");*/
			exp.getMessage();
		}
	
	}



	@Override
	public void transfer(int AcctNumber, int Amount) throws AccountException {
		// TODO Auto-generated method stub
		Account account=null;
		try (Connection con = ConnectionProvider.getConn(); PreparedStatement ps = con.prepareStatement(WITHDRAW_QRY)) {			
			ps.setInt(1,AcctNumber);
			ps.setInt(2,Amount);
		} catch (SQLException exp) {
			log.error(exp);
			throw new AccountException("Operation Failed Due To An Error!");
		}
	
	
	}



}
