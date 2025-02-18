package com.app.crudKafka.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.app.crudKafka.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}