package com.github.yhtps.lowpr.domain.member.dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
public class MemberInsertDTO {

	private String email;

	private String password;

	private String nickname;

	private String name;

	private String telNum;

	private LocalDate birth;

	private byte gender;

}
