package com.videnov.cloudproject.repository;

import com.videnov.cloudproject.domain.Product;
import org.springframework.data.repository.CrudRepository;


public interface ProductRepository extends CrudRepository<Product, Long> {

}
