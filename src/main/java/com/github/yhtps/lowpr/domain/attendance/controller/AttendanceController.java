package com.github.yhtps.lowpr.domain.attendance.controller;

import org.springframework.stereotype.Controller;

import com.github.yhtps.lowpr.domain.attendance.service.AttendanceSvc;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class AttendanceController {

	private final AttendanceSvc svc;

}
