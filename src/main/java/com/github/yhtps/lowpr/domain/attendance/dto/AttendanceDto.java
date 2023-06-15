package com.github.yhtps.lowpr.domain.attendance.dto;

import java.time.LocalDate;
import java.time.LocalTime;

import com.github.yhtps.lowpr.domain.common.enums.AttStatus;

import lombok.Data;

@Data
public class AttendanceDto {

	private long no;

	private LocalDate date;

	private LocalTime onTime;

	private LocalTime offTime;

	private AttStatus status;

}
