package com.fellipegarcias.aula270.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.fellipegarcias.aula270.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {

}