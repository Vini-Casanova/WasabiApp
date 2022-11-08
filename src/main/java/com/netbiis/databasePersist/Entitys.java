package com.netbiis.databasePersist;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public interface Entitys {
	static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("WassabiJPA"); 
	static final EntityManager em = emf.createEntityManager(); 
	static final EntityTransaction tx = em.getTransaction(); 
}
