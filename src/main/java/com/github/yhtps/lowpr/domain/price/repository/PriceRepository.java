package com.github.yhtps.lowpr.domain.price.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import com.github.yhtps.lowpr.domain.price.PriceEntity;

@Transactional(readOnly = true)
public interface PriceRepository extends JpaRepository<PriceEntity, Long>, PriceRepositoryCustom {
}
