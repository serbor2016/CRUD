package com.borisov.crud.repository;

import com.borisov.crud.model.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Long> {
    // List<User> findByLastName(String lastName);


}
