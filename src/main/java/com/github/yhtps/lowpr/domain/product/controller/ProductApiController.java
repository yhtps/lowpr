package com.github.yhtps.lowpr.domain.product.controller;

import org.springframework.web.bind.annotation.RestController;

import com.github.yhtps.lowpr.domain.product.service.ProductSvc;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class ProductApiController {

	private final ProductSvc svc;

}
