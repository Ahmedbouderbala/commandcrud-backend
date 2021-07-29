package com.example.demo.repository;

import com.example.demo.model.Produits;
import com.example.demo.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface UserRepository extends MongoRepository<User, String> {
    List<User> findByNameContaining(String Name);
    List<User> findByPublished(boolean published);

}
