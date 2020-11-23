package com.wellsfargo.batch7.group1.ui;

import java.io.File;
import java.io.FileInputStream;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.wellsfargo.batch7.group1.entities.Account;
import com.wellsfargo.batch7.group1.entities.BankEmployee;
import com.wellsfargo.batch7.group1.entities.Beneficiaries;
import com.wellsfargo.batch7.group1.entities.Customer;
import com.wellsfargo.batch7.group1.entities.Serviceprovider;
import com.wellsfargo.batch7.group1.entities.User;
import com.wellsfargo.batch7.group1.util.Jpautil;

public class Maindriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User u = new User(null, "Ramya", "linux", "User");
		/*File file = new File("img/JBDFav300.png");
		byte[] picInBytes = new byte[(int) file.length()];
		FileInputStream fileInputStream = new FileInputStream(file);
		fileInputStream.read(picInBytes);
		fileInputStream.close();*/
		Customer c=new Customer(null, "Ramya", "linux", "User","ramya","ela","ramya@gmail.com","Bangalore","9611654834","linux","yes","new","file","TRUE");
		c.setCustUCI(new Account(c,12345,"Savings",7000));
		BankEmployee e=new BankEmployee(null, "Ramya", "linux", "User","Sai","AccountExecutive");
		Account a=new Account(c,12345,"Savings",7000);
		Beneficiaries b=new Beneficiaries(a,20000.0,45678,5000.0,123456,9000.0,4568901);
		//Serviceprovider s=new Serviceprovider(123456,"ela","9611654834","linux","file");
		EntityManager em = Jpautil.getEntityManager();
		EntityTransaction txn = em.getTransaction();
		txn.begin();
		em.persist(u);
		em.persist(c);
		em.persist(e);
		em.persist(b);
		//em.persist(s);
		txn.commit();
		em.close();
	}

}
