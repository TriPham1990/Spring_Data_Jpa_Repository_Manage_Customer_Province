package tri.lo.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import tri.lo.model.Customer;
import tri.lo.model.Province;


public interface CustomerService {
    Iterable<Customer> findAllByProvince(Province province);

    Page<Customer> findAllByFirstNameContaining(String firstName, Pageable pageable);

    Page<Customer> findAll(Pageable pageable);

    Customer findById(Long id);

    void save(Customer customer);

    void remove(Long id);
}
