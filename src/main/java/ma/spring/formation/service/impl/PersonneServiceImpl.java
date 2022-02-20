package ma.spring.formation.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.spring.formation.dao.PersonneDao;
import ma.spring.formation.entires.Personne;
import ma.spring.formation.repository.PersoneRepository;
import ma.spring.formation.service.PersonneService;

@Service
public class PersonneServiceImpl implements PersonneService{

	@Autowired
	private PersonneDao PersonneDao;
	
	@Autowired
	private PersoneRepository personneRepo;
	
	
	@Override
	public List<Personne> getAll() {
		return personneRepo.findByNamePersone("N1");
	}

	@Override
	@Transactional
	public Personne add(Personne p) {
		return  personneRepo.save(p);
	}

}
