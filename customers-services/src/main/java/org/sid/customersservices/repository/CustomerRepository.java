package org.sid.customersservices.repository;

import org.sid.customersservices.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource
@CrossOrigin("*")
public interface CustomerRepository extends JpaRepository<Customer,Long> {
}
