package moles.db.examples.repositories;

import moles.db.examples.entities.Cash;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CashRepository  extends PagingAndSortingRepository<Cash, Integer> {
}
