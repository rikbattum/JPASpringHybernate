package dao.impl;
import static org.junit.Assert.*;

import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.management.Query;
import javax.persistence.Cache;
import javax.persistence.EntityGraph;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceUnitUtil;
import javax.persistence.SynchronizationType;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.metamodel.Metamodel;
import javax.transaction.Transaction;
import javax.transaction.TransactionManager;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.notNullValue;

import org.hamcrest.core.Is;
import org.hamcrest.core.IsNull;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import domain.Huis;

public class exploreJPA {

	private EntityManager em;
	private Huis huis; 
	private Huis huis2;
	private Huis huis3;
	
	@Before
	public void initialize () {
	String persistenceUnit = "pu";
	EntityManagerFactory emf = Persistence.createEntityManagerFactory(persistenceUnit);
	em = emf.createEntityManager();
	}

//	
//	@Test
//	public void testJPA() {
//		assertThat(em,is(notNullValue()));
//	}
//
//	@Test
//	public void testPersist () {
//	em.getTransaction().begin();
//	Huis huis = new Huis ("Haarlem", 540000, 3, " Het viooltje", new Date(), 1, HuisType.VILLA);
//	em.persist(huis);
//	em.getTransaction().commit();
//	}
//	
//	@Test
//	public void testMerge () {
//		em.getTransaction().begin();
//		Huis huis = new Huis ("Haarlem", 540000, 3, " Het viooltje", new Date(), 1, HuisType.TWEEONDER1KAP);
//		em.persist(huis);
//		em.getTransaction().commit();
//		
//		//merge
//		em.getTransaction().begin();
//		huis.setHuisNaam("Pietje Puk" );
//		em.merge(huis);
//		em.getTransaction().commit();
//		
//		// find
//		Huis huisRetrieved = em.find(Huis.class, 1);
//		System.out.println (huisRetrieved.toString());
//		// assert
//		assertThat(huis, Is.is(huisRetrieved));
//		
//
//	}
//	
//	@Test 
//	public void findAll () { 
//		
//		createHouses();
//		
//		javax.persistence.Query query = em.createQuery("select h FROM Huis h");
//		List <Huis> huizen = query.getResultList();
//		for (Huis s : huizen) { 
//			System.out.println (s.toString());
//		}
//	}
//
//	private void createHouses() {
//		huis = new Huis ("Haarlem", 540000, 3, " Het viooltje", new Date(), 1, HuisType.TWEEONDER1KAP);	
//		huis2 = new Huis ("alim", 50000, 2, "Busket Case", new Date(), 2, HuisType.VILLA);
//		huis3 = new Huis ("Sventje", 1000, 3, "Mixita", new Date(), 3, HuisType.VRIJSTAAND);
//		em.getTransaction().begin();
//		em.persist(huis);
//		em.persist(huis2);
//		em.persist(huis3);
//		em.getTransaction().commit();
//	}
//		
//		@Test 
//		public void testgeneratedValue() {
//			Trap trap = new Trap();
//			em.getTransaction().begin();
//			em.persist(trap);
//			em.getTransaction().commit();
//		}
//			
		
//		@Test 
//		public void testOnetoManyRelation () {
//			em.getTransaction().begin();
//			huis = new Huis ("Haarlem", 540000, 3, " Het viooltje", new Date(), 1, HuisType.TWEEONDER1KAP);	
//			em.persist(huis);
//		
//			Deur deur1 = new Deur(1);
//			Deur deur2 = new Deur(2);
//			deur1.getEmailadressen().add(" rik van Battum");
//			deur1.getEmailadressen().add("pietje@snot.nl");
//			deur2.getEmailadressen().add("dennis@theMenace");
//			
//			
//			deur1.setHuis(huis);
//			deur2.setHuis(huis);
//			em.persist(deur1);
//			em.persist(deur2);
//		
//		
//			
//		
//			DeurKlink dk = new DeurKlink(221212);
//			em.persist(dk);
//			em.getTransaction().commit();
////			assertThat(huis.getDeuren().get(0), Is.is(deur1));
//			
//			String namedQuery="select d From Deur d"; 
//			TypedQuery <Deur> query = em.createQuery(namedQuery, Deur.class);
//			List <Deur> deuren = query.getResultList();
//			
//			for (Deur deur : deuren) { 
//				System.out.println(deur);
//			}
//			
//			em.close();
//			
//		}
	
	
	@Test
	public void testSpringJPAHibernate () {
//		EntityManagerFactory emf = new EntityManagerFactory(); 
		
	}
	}
	

	
	
	
	

