package home.Springboot.jpa;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import home.Springboot.jpa.domain.Clnt;
import home.Springboot.jpa.repository.ClntRepository;

@SpringBootApplication
public class Db2Jpa1Application {

	public static void main(String[] args) {
		SpringApplication.run(Db2Jpa1Application.class, args);
	}

	@Bean
	public CommandLineRunner demo(ClntRepository repository) {
		return (args) -> {
			List<Clnt> findAll = repository.findAll();
			System.out.println(findAll.toString());
			Clnt c = new Clnt();
		/*	Collection<Client> findBySystemclientid = repository.findBySystemclientid(1);
			
			Client findOneBySystemclientid = repository.findOneBySystemclientid(1);
			
			System.out.println(findBySystemclientid.size());
			
			System.out.println("Found by System Client Id : " +findBySystemclientid);*/
		
			c.setAccoununum("12345");
			c.setCompanyname("Amar PVT. LTD.");
		
			repository.saveAndFlush(c);
		};
	}
}
