package com.wellsfargo.batch7.group1.IBS.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.sql.Date;
import org.apache.log4j.Logger;
import com.wellsfargo.batch7.group1.IBS.dto.Transaction;
import com.wellsfargo.batch7.group1.IBS.exception.AccountException;

public class TransactionOperationImpl implements TransactionOperation{
	
    public static final String SELECT_for_Mini_Stmt_QRY = "SELECT TransId,AcctNumber,TransDateTime,TransType,Amount FROM TransactionDetails where AcctNumber=?";
    public static final String SELECT_By_Period_QRY = "SELECT TransId,AcctNumber,TransDateTime,TransType,Amount FROM TransactionDetails where AcctNumber=? AND TransDateTime=?";
    
	Logger log = Logger.getLogger("dao");

	@Override
	public Transaction reqMiniStmt(String AcctNumber) throws AccountException {
		// TODO Auto-generated method stub
		Transaction transaction=null;
		try (Connection con = ConnectionProvider.getConn(); 
				PreparedStatement ps = con.prepareStatement(SELECT_for_Mini_Stmt_QRY)) {
			
			ps.setString(2, transaction.getAcctNumber());
	
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				transaction = new Transaction();
				transaction.setTransId(rs.getString(1));
				transaction.setAcctNumber(rs.getString(2));
				transaction.setTransDateTime(rs.getDate(3).toLocalDate());
				transaction.setTransType(rs.getString(4));
				transaction.setAmount(rs.getDouble(5));
			}
		} catch (SQLException exp) {
			log.error(exp);
			throw new AccountException("Operation Failed Due To An Error!");
		}		
		return transaction;
	}
	

	@Override
	public Transaction reqPeriodicStmt(String AcctNumber, LocalDate TransDateTime) throws AccountException {
		// TODO Auto-generated method stub
		Transaction transaction=null;
		try (Connection con = ConnectionProvider.getConn(); 
				PreparedStatement ps = con.prepareStatement(SELECT_By_Period_QRY)) {
			
			ps.setString(2, transaction.getAcctNumber());
			ps.setDate(4, Date.valueOf(transaction.getTransDateTime()));

			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				transaction = new Transaction();
				transaction.setTransId(rs.getString(1));
				transaction.setAcctNumber(rs.getString(2));
				transaction.setTransDateTime(rs.getDate(3).toLocalDate());
				transaction.setTransType(rs.getString(4));
				transaction.setAmount(rs.getDouble(5));
			}
		} catch (SQLException exp) {
			log.error(exp);
			throw new AccountException("Operation Failed Due To An Error!");
		}		
		return transaction;
	}

}
