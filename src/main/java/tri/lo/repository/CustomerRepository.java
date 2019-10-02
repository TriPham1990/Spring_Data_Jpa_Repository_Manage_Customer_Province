package tri.lo.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import tri.lo.model.Customer;
import tri.lo.model.Province;

public interface CustomerRepository extends PagingAndSortingRepository<Customer, Long> {
    Iterable<Customer> findAllByProvince(Province province);
}
