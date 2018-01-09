package com.anthem.provider.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.anthem.provider.domain.Product;

@RepositoryRestResource

public interface ProductRepository extends CrudRepository<Product, Integer>{
}
