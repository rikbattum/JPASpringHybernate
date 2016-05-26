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
import domain.Trap;
import org.junit.Assert;



@ContextConfiguration("classpath:dao-context.xml")
public class JpaTrapDaoImplTest extends AbstractTransactionalJUnit4SpringContextTests {

	@PersistenceContext
	protected EntityManager em;
	
	@Autowired
	TrapDao trapDao;

	@Test
	public void testTrapDao() throws Exception {

		Trap trap = new Trap(1L);
		
		trapDao.saveTrap(trap);
		long rowsInTable = this.countRowsInTable("Trap");
		assertThat(rowsInTable	, is(1L));
	}

	@Test
	public void testGetListTrappen() throws Exception {

		Trap trap = new Trap(1L);
		trapDao.saveTrap(trap);
		
		List<Trap> listTrappen = trapDao.listTrappen();
		for (Trap trap2 : listTrappen) {
			System.out.println(trap2);
		}
		long rowsInTable = this.countRowsInTable("Trap");
		assertThat(rowsInTable, is(1L));
	}

	@Test	
	public void testRemoveBookById() throws Exception {

		Trap trap = new Trap(1L);
		trapDao.saveTrap(trap);
		assertThat(countRowsInTable("Trap"), is(1));
		trapDao.removeTrap(1);
//		em.flush();
		assertThat(countRowsInTable("Trap"), is(0));
	}

}
