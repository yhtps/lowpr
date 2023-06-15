package com.github.yhtps.lowpr.domain.category.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import com.github.yhtps.lowpr.domain.category.CategoryEntity;

@Transactional(readOnly = true)
public interface CategoryRepository extends JpaRepository<CategoryEntity, Long>, CategoryRepositoryCustom {
}
