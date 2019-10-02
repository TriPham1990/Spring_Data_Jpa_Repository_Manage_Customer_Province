package tri.lo.service;

import tri.lo.model.Customer;
import tri.lo.model.Province;


public interface CustomerService {
    Iterable<Customer> findAllByProvince(Province province);

    Iterable<Customer> findAll();

    Customer findById(Long id);

    void save(Customer customer);

    void remove(Long id);
}
