package com.github.yhtps.lowpr.domain.image.controller;

import org.springframework.stereotype.Controller;

import com.github.yhtps.lowpr.domain.image.service.ImageSvc;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class ImageController {

	private final ImageSvc svc;

}
