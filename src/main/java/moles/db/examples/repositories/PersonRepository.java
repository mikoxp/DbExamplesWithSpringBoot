package moles.db.examples.repositories;

import moles.db.examples.entities.Person;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepository extends PagingAndSortingRepository<Person, Integer>,
        JpaSpecificationExecutor<Person> {

    List<Person> findByNameLike(String name);
}
