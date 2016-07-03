package home.Springboot.jpa.repository;

import home.Springboot.jpa.domain.Clnt;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClntIdentificationRepository extends JpaRepository<Clnt, Long> {

}
