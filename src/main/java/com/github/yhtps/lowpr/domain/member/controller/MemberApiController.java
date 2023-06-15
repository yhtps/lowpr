package com.github.yhtps.lowpr.domain.member.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.github.yhtps.lowpr.domain.member.service.MemberSvc;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class MemberApiController {

	private final MemberSvc svc;

	@PostMapping(value = "/resister/check")
	public boolean emailDuplicationCheck(@RequestParam String email) {
		return svc.existsByEmail(email);
	}

}
