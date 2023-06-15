package com.github.yhtps.lowpr.domain.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import com.github.yhtps.lowpr.domain.product.ProductEntity;

@Transactional(readOnly = true)
public interface ProductRepository extends JpaRepository<ProductEntity, Long>, ProductRepositoryCustom {
}
