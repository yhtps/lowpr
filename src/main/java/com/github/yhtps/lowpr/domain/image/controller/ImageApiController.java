package com.github.yhtps.lowpr.domain.image.controller;

import org.springframework.web.bind.annotation.RestController;

import com.github.yhtps.lowpr.domain.image.service.ImageSvc;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class ImageApiController {

	private final ImageSvc svc;

}
