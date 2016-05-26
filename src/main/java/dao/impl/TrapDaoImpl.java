package dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.hibernate.Query;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import domain.Deur;
import domain.Trap;

@Component
@Transactional(propagation=Propagation.REQUIRES_NEW)
public class TrapDaoImpl implements TrapDao {

	@PersistenceContext
	protected EntityManager em;


	@Transactional(readOnly = true)
	public List<Trap> listTrappen() {
		TypedQuery<Trap> query = em.createQuery("select t from Trap t", Trap.class);
		return query.getResultList();
	}

	public void saveTrap(Trap trap) {
		em.merge(trap);
	}

	public void removeTrap(long id) {
		Trap trapToBeRemoved = em.find(Trap.class, id);
		em.remove(trapToBeRemoved);	
	}
}
