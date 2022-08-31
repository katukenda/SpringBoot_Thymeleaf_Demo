package com.katukenda.loginregistration.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.katukenda.loginregistration.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
