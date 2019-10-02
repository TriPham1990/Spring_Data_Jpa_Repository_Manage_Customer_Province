package tri.lo.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import tri.lo.model.Customer;

public interface CustomerRepository extends PagingAndSortingRepository<Customer, Long> {
}
