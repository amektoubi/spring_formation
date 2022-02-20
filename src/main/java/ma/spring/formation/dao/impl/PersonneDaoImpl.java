package ma.spring.formation.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import ma.spring.formation.dao.PersonneDao;
import ma.spring.formation.entires.Personne;

@Repository
public class PersonneDaoImpl implements PersonneDao{
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public List<Personne> getAll() {
		return  entityManager.createNativeQuery("SELECT * FROM personne p Where p.name = :nameVare",Personne.class)
				  .setParameter("nameVare", "N1")
				  .getResultList();
				
	}

	@Override
	public Personne add(Personne p) {
		 entityManager.persist(p);
		 return p;
	}

}
