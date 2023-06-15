package com.github.yhtps.lowpr.domain.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.github.yhtps.lowpr.domain.member.dto.MemberInsertDTO;
import com.github.yhtps.lowpr.domain.member.service.MemberSvc;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class MemberController {

	private final MemberSvc svc;

	@GetMapping(value = "/login")
	public String loginPage() {
		return "/auth/login";
	}

	@GetMapping(value = "/resister")
	public String resisterPage() {
		return "/auth/resister";
	}

	@PostMapping(value = "/resister")
	public String resisterPost(@RequestBody MemberInsertDTO dto) {
		if (!svc.existsByEmail(dto.getEmail())) svc.insertMember(dto);
		return "redirect:/login";
	}

}
