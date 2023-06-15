package com.github.yhtps.lowpr.domain.comment.service;

import org.springframework.stereotype.Service;

import com.github.yhtps.lowpr.domain.comment.repository.CommentRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CommentSvcImpl implements CommentSvc {

	private final CommentRepository cr;

}
