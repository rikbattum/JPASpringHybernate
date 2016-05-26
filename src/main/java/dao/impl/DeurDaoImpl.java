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

@Component
@Transactional(propagation=Propagation.REQUIRES_NEW)
public class DeurDaoImpl implements DeurDao {

	@PersistenceContext
	protected EntityManager em;

	@Transactional(readOnly = true)
	public List<Deur> listDeurs() {
		TypedQuery<Deur> query = em.createQuery("select d from Deur d", Deur.class);
		return query.getResultList();
	}

	public void saveDeur(Deur deur) {
		em.merge(deur);
	}

	public void removeDeur(long id) {
		TypedQuery<Deur> query = (TypedQuery<Deur>) em.createQuery("delete from Deur Where id = :id");
		query.setParameter("id", id);
		query.executeUpdate();

	}
}
