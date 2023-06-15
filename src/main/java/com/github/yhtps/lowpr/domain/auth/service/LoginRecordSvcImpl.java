package com.github.yhtps.lowpr.domain.auth.service;

import org.springframework.stereotype.Service;

import com.github.yhtps.lowpr.domain.auth.repository.LoginRecordRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class LoginRecordSvcImpl implements LoginRecordSvc {

	private final LoginRecordRepository lr;

}
