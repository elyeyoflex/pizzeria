package com.springData.pizzeria.persitence.repository;

import com.springData.pizzeria.persitence.entity.CustomerEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.ListCrudRepository;

public interface CustomerRepository extends ListCrudRepository<CustomerEntity, String> {

    @Query(value ="select c from CustomerEntity c where c.phoneNumber = :phone")
    CustomerEntity findByPhone(String phone);
}
