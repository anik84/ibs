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
	
	public static final String INS_QRY = "INSERT INTO accountdetails(AcctNumber,UCI,AcctHolderName,AcctType,Amount,AcctOpenDate,AcctStatus,MaturityDate) VALUES(?,?,?,?,?,?,?,?)";
	public static final String DEP_QRY = "UPDATE accountdetails SET Amount = ( Amount + ?) from AccountDetails WHERE AcctNumber = ?";
	public static final String WITHDRAW_QRY = "UPDATE accountdetails SET Amount = (Amount - ?) from AccountDetails WHERE AcctNumber=?";
	public static final String SELECT_BY_AMT_QRY = "SELECT Amount FROM accountdetails WHERE AcctNumber= ? ";
	public static final String SELECT_BY_ID_QRY = "SELECT Amount FROM accountdetails WHERE AcctNumber = ? ";
	public static final String SELECT_ALL_QRY = "SELECT AcctNumber,UCI,AcctHolderName,AcctType,Amount,AcctOpenDate,AcctStatus,MaturityDate FROM accountdetails";
	
	
	Logger log = Logger.getLogger("dao");
	
	

	@Override
	public Account addAccount(Account account) throws AccountException {
		// TODO Auto-generated method stub
		if (account != null) {
			try (Connection con = ConnectionProvider.getConn(); PreparedStatement ps = con.prepareStatement(INS_QRY)) {

				ps.setString(1, account.getAcctNumber());
				ps.setString(2, account.getUCI());
				ps.setString(3, account.getAcctHolderName());
				ps.setString(4, account.getAcctType());
				ps.setDouble(5,account.getAmount());
				ps.setDate(6, Date.valueOf(account.getAcctOpenDate()));
				ps.setString(7, account.getAcctStatus());
				ps.setDate(8, Date.valueOf(account.getMaturityDate()));

				ps.executeUpdate();
			} catch (SQLException exp) {
				log.error(exp);
				throw new AccountException("Operation Failed Due To An Error!");
			}
		}
		return account;
	}


		
	






	@Override
	public int balance(String AcctNumber) throws AccountException {
		// TODO Auto-generated method stub
		int Amount=0;
		try (Connection con = ConnectionProvider.getConn(); 
				PreparedStatement ps = con.prepareStatement("SELECT_BY_AMT_QRY"
						)) {
			
			ps.setString(1, AcctNumber);

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
	public void deposit(String AcctNumber, int NewAmount) throws SQLException {
		// TODO Auto-generated method stub
		try (Connection con = ConnectionProvider.getConn(); PreparedStatement ps = con.prepareStatement(DEP_QRY)) {
			
			ps.setString(2,AcctNumber);
			ps.setInt(1,NewAmount);
			ps.executeUpdate();
			try (Connection con1 = ConnectionProvider.getConn(); 
					PreparedStatement ps1 = con1.prepareStatement(SELECT_BY_ID_QRY)) {
            
				ps1.setString(1,AcctNumber);
				

				ResultSet rs = ps1.executeQuery();
				
				if(rs.next()) {
					
				 
				 rs.getInt(1);
					
				}
			} catch (SQLException exp) {
				exp.getMessage();
				/*log.error(exp);
				throw new AccountException("Operation Failed Due To An Error!");*/
			}
		} catch (SQLException exp) {
			/*log.error(exp);
			throw new AccountException("Operation Failed Due To An Error!");*/
			exp.getMessage();
		}
		
	}










	@Override
	public void withdraw(String AcctNumber, int NewAmount) throws AccountException {
try (Connection con = ConnectionProvider.getConn(); PreparedStatement ps = con.prepareStatement(WITHDRAW_QRY)) {
			
			ps.setString(2,AcctNumber);
			ps.setInt(1,NewAmount);
			ps.executeUpdate();
			try (Connection con1 = ConnectionProvider.getConn(); 
					PreparedStatement ps1 = con1.prepareStatement(SELECT_BY_ID_QRY)) {
            
				ps1.setString(1,AcctNumber);
				

				ResultSet rs = ps1.executeQuery();
				
				if(rs.next()) {
					
				 
				 rs.getInt(1);
					
				}
			} catch (SQLException exp) {
				exp.getMessage();
				/*log.error(exp);
				throw new AccountException("Operation Failed Due To An Error!");*/
			}
		} catch (SQLException exp) {
			/*log.error(exp);
			throw new AccountException("Operation Failed Due To An Error!");*/
			exp.getMessage();
		}
	
	}



	@Override
	public void transfer(String AcctNumber, int Amount) throws AccountException {
		// TODO Auto-generated method stub
		Account account=null;
		try (Connection con = ConnectionProvider.getConn(); PreparedStatement ps = con.prepareStatement(WITHDRAW_QRY)) {			
			ps.setDouble(5, Amount);
			ps.executeUpdate();
		} catch (SQLException exp) {
			log.error(exp);
			throw new AccountException("Operation Failed Due To An Error!");
		}
	
	
	}



}
