package com.github.yhtps.lowpr.domain.attendance.service;

import org.springframework.stereotype.Service;

import com.github.yhtps.lowpr.domain.attendance.repository.AttendanceRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AttendanceSvcImpl implements AttendanceSvc {

	private final AttendanceRepository ar;

}
