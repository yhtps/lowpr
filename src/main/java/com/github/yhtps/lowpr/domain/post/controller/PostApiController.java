package com.github.yhtps.lowpr.domain.post.controller;

import org.springframework.web.bind.annotation.RestController;

import com.github.yhtps.lowpr.domain.post.service.PostSvc;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class PostApiController {

	private final PostSvc svc;

}
