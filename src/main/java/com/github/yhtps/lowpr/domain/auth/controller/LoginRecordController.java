package com.github.yhtps.lowpr.domain.auth.controller;

import org.springframework.stereotype.Controller;

import com.github.yhtps.lowpr.domain.auth.service.LoginRecordSvc;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class LoginRecordController {

	private final LoginRecordSvc svc;

}
