package com.domain.models.repos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.domain.models.entities.Product;

// DAO
public interface ProductRepo extends CrudRepository<Product, Long> {

    List<Product> findByNameContains(String name);
}
