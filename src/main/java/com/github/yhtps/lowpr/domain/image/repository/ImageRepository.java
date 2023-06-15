package com.github.yhtps.lowpr.domain.image.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import com.github.yhtps.lowpr.domain.image.ImageEntity;

@Transactional(readOnly = true)
public interface ImageRepository extends JpaRepository<ImageEntity, Long>, ImageRepositoryCustom {
}
