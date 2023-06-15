package com.github.yhtps.lowpr.domain.price.controller;

import org.springframework.web.bind.annotation.RestController;

import com.github.yhtps.lowpr.domain.price.service.PriceSvc;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class PriceApiController {

	private final PriceSvc svc;

}
