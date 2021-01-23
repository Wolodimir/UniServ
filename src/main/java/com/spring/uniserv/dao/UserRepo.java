package com.spring.uniserv.dao;


import com.spring.uniserv.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {

    //SELECT * FROM usr WHERE email = ?
    Optional<User> findByEmail(String email);
}
