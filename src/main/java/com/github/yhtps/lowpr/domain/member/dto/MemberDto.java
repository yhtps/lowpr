package com.github.yhtps.lowpr.domain.member.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MemberDto {

	private long no;

	private String email;

	private String password;

	private String nickname;

	private String name;

	private String telNum;

	private LocalDate birth;

	private byte gender;

	private LocalDateTime createdDate;

	private LocalDateTime updatedDate;

	private boolean hide;

}
