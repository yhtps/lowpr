package com.github.yhtps.lowpr.domain.category.controller;

import org.springframework.stereotype.Controller;

import com.github.yhtps.lowpr.domain.category.service.CategorySvc;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class CategoryController {

	private final CategorySvc svc;

}
