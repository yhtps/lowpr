package com.github.yhtps.lowpr.domain.comment.controller;

import org.springframework.web.bind.annotation.RestController;

import com.github.yhtps.lowpr.domain.comment.service.CommentSvc;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class CommentApiController {

	private final CommentSvc svc;

}
