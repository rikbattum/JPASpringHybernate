package dao.impl;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hamcrest.core.Is;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import domain.Deur;



@ContextConfiguration("classpath:dao-context.xml")
public class JpaBookDaoImplTest extends AbstractTransactionalJUnit4SpringContextTests {

	@PersistenceContext
	protected EntityManager em;
	
	@Autowired
	DeurDao deurDao;

	@Test
	public void testDeurDao() throws Exception {

		Deur deur = new Deur(1);
		deurDao.saveDeur(deur);

	}

	@Test
	public void testGetListDeuren() throws Exception {

		Deur deur = new Deur(1);
		deurDao.saveDeur(deur);
		List<Deur> deuren = deurDao.listDeurs();
		for (Deur deur2 : deuren) {
			System.out.println(deur2.toString());
		}
		int rowsInTable = this.countRowsInTable("Deur");
		assertThat(1, is(rowsInTable));
	}

	@Test	
	public void testRemoveBookById() throws Exception {
		Deur deur = new Deur(1);
		deurDao.saveDeur(deur);
		assertThat(countRowsInTable("Deur"), is(1));
		deurDao.removeDeur(1);
		//em.flush();
		assertThat(countRowsInTable("Deur"), is(0));
	}

}
