package com.springData.pizzeria.persitence.repository;

import com.springData.pizzeria.persitence.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserEntity, String> {
}
