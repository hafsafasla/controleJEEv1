package org.sid.customersservices;

import org.sid.customersservices.entities.Customer;
import org.sid.customersservices.repository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

@SpringBootApplication
public class CustomersServicesApplication {

    public static void main(String[] args) {

        SpringApplication.run(CustomersServicesApplication.class, args);
    }
    @Bean
    CommandLineRunner start(CustomerRepository customerRepository, RepositoryRestConfiguration restConfiguration){

       restConfiguration.exposeIdsFor(Customer.class);
        return args -> {
            customerRepository.save(new Customer(null,"hafsa","hafsa@gmail.com"));
            customerRepository.save(new Customer(null,"fasla","fasla@gmail.com"));
            customerRepository.save(new Customer(null,"teste","teste@gmail.com"));
            customerRepository.save(new Customer(null,"teste2","teste2@gmail.com"));
            customerRepository.findAll().forEach(c->{
                System.out.println(c.toString());
            });


        };
    }

}

