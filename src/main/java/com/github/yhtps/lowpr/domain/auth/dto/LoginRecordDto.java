package com.github.yhtps.lowpr.domain.auth.dto;

import java.time.LocalDateTime;

import com.github.yhtps.lowpr.domain.member.MemberEntity;

import lombok.Data;

@Data
public class LoginRecordDto {

	private long no;

	private LocalDateTime time;

	private String ipAddress;

	private MemberEntity member;

}
