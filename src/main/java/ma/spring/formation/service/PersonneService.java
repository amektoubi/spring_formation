package ma.spring.formation.service;

import java.util.List;

import ma.spring.formation.entires.Personne;

public interface PersonneService {

	public List<Personne> getAll();
	public Personne add(Personne p);
}
