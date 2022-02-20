package ma.spring.formation.dao;

import java.util.List;

import ma.spring.formation.entires.Personne;

public interface PersonneDao {

	public List<Personne> getAll();
	public Personne add(Personne p);
	
}
