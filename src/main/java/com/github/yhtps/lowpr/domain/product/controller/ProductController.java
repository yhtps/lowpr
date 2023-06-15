package com.github.yhtps.lowpr.domain.product.controller;

import org.springframework.stereotype.Controller;

import com.github.yhtps.lowpr.domain.product.service.ProductSvc;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class ProductController {

	private final ProductSvc svc;

}
