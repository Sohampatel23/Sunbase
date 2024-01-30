package com.sunbase.customerproject.repo;

import com.sunbase.customerproject.model.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepo extends CrudRepository<Customer,Long> {
}
