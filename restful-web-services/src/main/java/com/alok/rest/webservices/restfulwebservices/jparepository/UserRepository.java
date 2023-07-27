package com.alok.rest.webservices.restfulwebservices.jparepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alok.rest.webservices.restfulwebservices.user.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
