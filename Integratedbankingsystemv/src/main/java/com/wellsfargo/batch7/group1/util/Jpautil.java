package com.wellsfargo.batch7.group1.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Jpautil {
	
private static EntityManagerFactory emf;
	
	static {
		emf = Persistence.createEntityManagerFactory("mysqlPU");
	}

	public static EntityManager getEntityManager() {
		return emf.createEntityManager();
	}

}
