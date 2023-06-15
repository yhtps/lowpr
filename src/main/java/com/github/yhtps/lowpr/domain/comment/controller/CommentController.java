package com.github.yhtps.lowpr.domain.comment.controller;

import org.springframework.stereotype.Controller;

import com.github.yhtps.lowpr.domain.comment.service.CommentSvc;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class CommentController {

	private final CommentSvc svc;

}
