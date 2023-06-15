package com.github.yhtps.lowpr.domain.auth.controller;

import org.springframework.web.bind.annotation.RestController;

import com.github.yhtps.lowpr.domain.auth.service.LoginRecordSvc;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class LoginRecordApiController {

	private final LoginRecordSvc svc;

}
