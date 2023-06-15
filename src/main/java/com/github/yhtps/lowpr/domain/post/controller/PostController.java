package com.github.yhtps.lowpr.domain.post.controller;

import org.springframework.stereotype.Controller;

import com.github.yhtps.lowpr.domain.post.service.PostSvc;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class PostController {

	private final PostSvc svc;

}
