package com.github.yhtps.lowpr.domain.price.controller;

import org.springframework.stereotype.Controller;

import com.github.yhtps.lowpr.domain.price.service.PriceSvc;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class PriceController {

	private final PriceSvc svc;

}
