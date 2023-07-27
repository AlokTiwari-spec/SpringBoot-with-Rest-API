package com.alok.rest.webservices.restfulwebservices.jparepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alok.rest.webservices.restfulwebservices.user.Post;

public interface PostRepository extends JpaRepository<Post, Integer>{

}
