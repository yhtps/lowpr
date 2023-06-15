package com.github.yhtps.lowpr.domain.attendance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import com.github.yhtps.lowpr.domain.attendance.AttendanceEntity;

@Transactional(readOnly = true)
public interface AttendanceRepository extends JpaRepository<AttendanceEntity, Long>, AttendanceRepositoryCustom {
}
