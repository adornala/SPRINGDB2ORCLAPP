package home.Springboot.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import home.Springboot.jpa.domain.Clnt;

public interface ClntRepository extends JpaRepository<Clnt, Long> {

}
