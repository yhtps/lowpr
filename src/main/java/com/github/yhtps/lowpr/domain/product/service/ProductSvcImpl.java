package com.github.yhtps.lowpr.domain.product.service;

import org.springframework.stereotype.Service;

import com.github.yhtps.lowpr.domain.product.repository.ProductRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductSvcImpl implements ProductSvc {

	private final ProductRepository pr;

}
