package home.Springboot.jpa.repository;

import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import home.Springboot.jpa.domain.Client;

public interface ClientRepository extends JpaRepository<Client, Integer>{
	//Collection<Client> findBySystemclientId(Long id);
	//Collection<Client> FindOneBySystemclientIdandId(Long id, String id1);
	List<Client> findAll();
	Collection<Client> findBySystemclientid(Integer id);
	Client findOneBySystemclientid(Integer id);
}
