package com.github.yhtps.lowpr.domain.attendance.controller;

import org.springframework.web.bind.annotation.RestController;

import com.github.yhtps.lowpr.domain.attendance.service.AttendanceSvc;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class AttendanceApiController {

	private final AttendanceSvc svc;

}
