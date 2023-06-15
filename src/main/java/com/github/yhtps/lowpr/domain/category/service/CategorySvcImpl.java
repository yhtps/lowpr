package com.github.yhtps.lowpr.domain.category.service;

import org.springframework.stereotype.Service;

import com.github.yhtps.lowpr.domain.category.repository.CategoryRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CategorySvcImpl implements CategorySvc {

	private final CategoryRepository cr;

}
