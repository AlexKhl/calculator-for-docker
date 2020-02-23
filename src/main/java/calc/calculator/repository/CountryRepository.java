package calc.calculator.repository;

import calc.calculator.entity.Country;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.RepositoryDefinition;
import org.springframework.stereotype.Repository;

import java.util.List;

//@RepositoryDefinition(domainClass = Country.class, idClass = Long.class)
@Repository
public interface CountryRepository extends JpaRepository<Country, Long> {
//    List<Country> findAll(Sort sort);
}
