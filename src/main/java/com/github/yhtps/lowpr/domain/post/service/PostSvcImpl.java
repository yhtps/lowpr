package com.github.yhtps.lowpr.domain.post.service;

import org.springframework.stereotype.Service;

import com.github.yhtps.lowpr.domain.post.repository.PostRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PostSvcImpl implements PostSvc {

	private final PostRepository pr;

}
