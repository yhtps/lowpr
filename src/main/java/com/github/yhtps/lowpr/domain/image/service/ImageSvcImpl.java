package com.github.yhtps.lowpr.domain.image.service;

import org.springframework.stereotype.Service;

import com.github.yhtps.lowpr.domain.image.repository.ImageRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ImageSvcImpl implements ImageSvc {

	private final ImageRepository ir;

}
