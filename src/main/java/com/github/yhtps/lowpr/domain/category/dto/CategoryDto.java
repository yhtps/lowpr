package com.github.yhtps.lowpr.domain.category.dto;

import com.github.yhtps.lowpr.domain.category.CategoryEntity;

import lombok.Data;

@Data
public class CategoryDto {

	private long no;

	private String name;

	private CategoryEntity parentCategory;

}
