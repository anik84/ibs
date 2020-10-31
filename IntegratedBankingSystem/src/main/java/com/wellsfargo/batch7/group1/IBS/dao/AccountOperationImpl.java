package com.wellsfargo.batch7.group1.IBS.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.apache.log4j.Logger;

import com.wellsfargo.batch7.group1.IBS.dto.Account;
import com.wellsfargo.batch7.group1.IBS.exception.AccountException;

public class AccountOperationImpl implements AccountOperation {
	
	public static final String INS_QRY = "INSERT INTO accounts(AcctNumber,Acctbalance,AcctType,Accountuci) VALUES (?,?,?,?)";
	public static final String DEP_QRY = " update accounts set AcctBalance = AcctBalance + ? from acounts where AcctNumber = ? ";
	public static final String WITHDRAW_QRY = "UPDATE accounts SET AcctBalance = AcctBalance - ? from accounts WHERE AcctNumber=?";
	public static final String SELECT_BY_AMT_QRY = "SELECT AcctBalance FROM accounts WHERE AcctNumber = ? ";
	public static final String SELECT_BY_ID_QRY = "SELECT AcctNumber,Acctbalance,AcctType,Accountuci FROM accounts WHERE AcctNumber = ? ";
	public static final String SELECT_ALL_QRY = "SELECT * FROM accounts";
	
	
	Logger log = Logger.getLogger("dao");
	
	

	


	@Override
	public Account addAccount(Account account) throws AccountException {
		// TODO Auto-generated method stub
		if (account != null) {
			try (Connection con = ConnectionProvider.getConn(); PreparedStatement ps = con.prepareStatement(INS_QRY)) {

				ps.setInt(1, account.getAcctNumber());
				ps.setInt(2, account.getAcctBalance());
				ps.setString(3, account.getAcctType());
				ps.setLong(4, account.getAccountUCI());
				ps.executeUpdate();
			} catch (SQLException exp) {
				/*log.error(exp);
				throw new AccountException("Operation Failed Due To An Error!");*/
				exp.printStackTrace();
			}
		}
		return account;
	}

	@Override
	public Account balance(int AcctNumber) throws AccountException {
		// TODO Auto-generated method stub
		Account account=null;
		try (Connection con = ConnectionProvider.getConn(); 
				PreparedStatement ps = con.prepareStatement(SELECT_BY_ID_QRY
						)) {
			
			ps.setInt(1,AcctNumber);

			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				
				account = new Account();
				account.setAcctNumber(rs.getInt(1));
				account.setAcctBalance(rs.getInt(2));
				account.setAcctType(rs.getString(3));
				account.setAccountUCI(rs.getLong(4));
			}
		} catch (SQLException exp) {
			exp.printStackTrace();
			
		}	
		 return account;
		 
	}

	@Override
	public Account deposit(int Amount,int AcctNumber) throws SQLException {
		// TODO Auto-generated method stub
		Account account=null;
		try (Connection con = ConnectionProvider.getConn()) {
			PreparedStatement ps = con.prepareStatement(DEP_QRY);
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
			exp.getStackTrace();
		}
		return account;	
	}










	@Override
	public Account withdraw(int  Amount, int AcctNumber) throws AccountException {
		    
		    Account account=null;
            try (Connection con = ConnectionProvider.getConn(); PreparedStatement ps = con.prepareStatement(WITHDRAW_QRY)) {
			ps.setInt(1,Amount);
			ps.setInt(2,AcctNumber);
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
			exp.printStackTrace();
		}
	    return account;
	}



	@Override
	public Account transfer(int AcctNumber, int Amount) throws AccountException {
		// TODO Auto-generated method stub
		Account account=null;
		try (Connection con = ConnectionProvider.getConn(); PreparedStatement ps = con.prepareStatement(WITHDRAW_QRY)) {			
			ps.setInt(2,Amount);
			ps.setInt(1,AcctNumber);
		} catch (SQLException exp) {
			log.error(exp);
			throw new AccountException("Operation Failed Due To An Error!");
		}
	
	   return account;
	}



}
