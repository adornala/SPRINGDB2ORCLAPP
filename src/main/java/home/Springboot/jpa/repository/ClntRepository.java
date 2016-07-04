package home.Springboot.jpa.repository;

import home.Springboot.jpa.domain.Clnt;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.math.BigDecimal;

public interface ClntRepository extends JpaRepository<Clnt, Long> {
    @Query(value = "SELECT JPA.NEXTVAL FROM DUAL", nativeQuery = true)
    BigDecimal getnextval();
}
