package tri.lo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import tri.lo.model.Customer;
import tri.lo.repository.CustomerRepository;
import tri.lo.service.CustomerService;


public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public Iterable<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public Customer findById(Long id) {
        return customerRepository.findOne(id);
    }

    @Override
    public void save(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    public void remove(Long id) {
        customerRepository.delete(id);
    }
}
