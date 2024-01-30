package com.sunbase.customerproject.Service;

import com.sunbase.customerproject.repo.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sunbase.customerproject.model.Customer;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepo customerRepository;

    public Customer getCustomerById(Long id) {
        return customerRepository.findById(id).orElse(null);
    }

    public Customer createCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    public Customer updateCustomer(Long id, Customer updatedCustomer) {
        if (customerRepository.existsById(id)) {
            updatedCustomer.setId(id);
            return customerRepository.save(updatedCustomer);
        }
        return null; // Customer not found
    }
    public void deleteCustomer(Long id) {
        customerRepository.deleteById(id);
    }
    public List<Customer> getAllCustomers() {
        return (List) customerRepository.findAll();
    }
}
