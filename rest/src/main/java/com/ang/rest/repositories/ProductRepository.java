package com.ang.rest.repositories;

import com.ang.rest.domain.entities.Product;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.OptionalInt;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long>,
        PagingAndSortingRepository<Product,Long> {


    @Query("SELECT 1 FROM Product p WHERE p.name = :name")
    boolean findByCustomCriteria(@Param("name") String name);

}
