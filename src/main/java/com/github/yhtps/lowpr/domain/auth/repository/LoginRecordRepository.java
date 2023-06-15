package com.github.yhtps.lowpr.domain.auth.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import com.github.yhtps.lowpr.domain.auth.LoginRecordEntity;

@Transactional(readOnly = true)
public interface LoginRecordRepository extends JpaRepository<LoginRecordEntity, Long>, LoginRecordRepositoryCustom {
}
