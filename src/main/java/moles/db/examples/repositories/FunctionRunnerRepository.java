package moles.db.examples.repositories;

import moles.db.examples.entities.FunctionRunner;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface FunctionRunnerRepository extends CrudRepository<FunctionRunner,Integer> {

    @Query(nativeQuery = true,value = "SELECT * FROM public.addition(:a,:b);")
    Integer runAddition(@Param("a") Integer a,@Param("b") Integer b);
}
