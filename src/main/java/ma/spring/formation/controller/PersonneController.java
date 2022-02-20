package ma.spring.formation.controller;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ma.spring.formation.entires.Personne;
import ma.spring.formation.service.PersonneService;

@RestController
@RequestMapping("personne")
public class PersonneController {

	@Autowired
	private PersonneService personneSevice;
	
	@GetMapping("")
	public List<Personne> getAll() {
		return personneSevice.getAll();	
	}
	
	@PostMapping("")
	public Personne add(@RequestBody Personne p) {
		return personneSevice.add(p);	
	}
	
	

}
