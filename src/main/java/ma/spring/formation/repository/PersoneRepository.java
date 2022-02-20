package ma.spring.formation.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import ma.spring.formation.entires.Personne;

public interface PersoneRepository extends JpaRepository<Personne, Integer>{
	
	public List<Personne> findByNamePersone(String name);
	
    @Query(value="SELECT * FROM personne p Where p.id = :id",nativeQuery = true)
	public List<Personne> getId(@Param("id") Integer id);
	
}
