package com.github.yhtps.lowpr.domain.category.controller;

import org.springframework.web.bind.annotation.RestController;

import com.github.yhtps.lowpr.domain.category.service.CategorySvc;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class CategoryApiController {

	private final CategorySvc svc;

}
