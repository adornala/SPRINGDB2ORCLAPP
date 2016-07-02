package home.Springboot.jpa;

import java.util.Collection;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import home.Springboot.jpa.domain.Client;
import home.Springboot.jpa.repository.ClientRepository;

@SpringBootApplication
public class Db2Jpa1Application {

	public static void main(String[] args) {
		SpringApplication.run(Db2Jpa1Application.class, args);
	}

	@Bean
	public CommandLineRunner demo(ClientRepository repository) {
		return (args) -> {
			List<Client> findAll = repository.findAll();
			System.out.println(findAll.toString());
			
			Collection<Client> findBySystemclientid = repository.findBySystemclientid(1);
			
			Client findOneBySystemclientid = repository.findOneBySystemclientid(1);
			
			System.out.println(findBySystemclientid.size());
			
			System.out.println("Found by System Client Id : " +findBySystemclientid);
		};
	}
}
