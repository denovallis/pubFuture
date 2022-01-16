package tst.pubfuture.java.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public abstract class HiberEMFactory {
	
	private static EntityManagerFactory factory;
		
	public static EntityManager getEntityManager() {
		if(factory == null) {
			factory = Persistence.createEntityManagerFactory("tst.pubfuturedb.hibernate");

		}
		
		return factory.createEntityManager();
	}
	
	
	
	

}