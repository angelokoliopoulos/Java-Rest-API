package com.ang.rest.services;

import com.ang.rest.domain.entities.ProductEntity;
import jakarta.transaction.Transactional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface ProductService {


    ProductEntity createProduct(ProductEntity product);

    List<ProductEntity> findAll();

    // Page<ProductEntity> findAll(Pageable pageable);


    Optional<ProductEntity> findOne(Long id);

    boolean isExists(Long id);

//    List<ProductEntity> findByTransactionId(Long id);

//    Page<ProductEntity> findByTransactionId(Long id,Pageable pageable);
//    void deleteProductFromTransaction(Long tid, Long pid);

    void deleteProduct(Long productId);
}
