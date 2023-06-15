package com.github.yhtps.lowpr.domain.price.service;

import org.springframework.stereotype.Service;

import com.github.yhtps.lowpr.domain.price.repository.PriceRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PriceSvcImpl implements PriceSvc {

	private final PriceRepository pr;

}
