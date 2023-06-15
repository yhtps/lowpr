package com.github.yhtps.lowpr.domain.member.dto;

import java.time.LocalDate;

import lombok.Data;

@Data
public class MemberDto {

	private long no;

	private String email;

	private String password;

	private String nickname;

	private String name;

	private String telNum;

	private LocalDate birth;

	private byte gender;

}
