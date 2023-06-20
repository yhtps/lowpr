package com.github.yhtps.lowpr.domain.category;

import java.util.ArrayList;
import java.util.List;

import com.github.yhtps.lowpr.domain.product.ProductEntity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
@Table(name = "Category")
public class CategoryEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long no;

	private String name;

	@ManyToOne
	private CategoryEntity parentCategory;

	@OneToMany(mappedBy = "parentCategory", cascade = CascadeType.ALL)
	private final List<CategoryEntity> childCategories = new ArrayList<>();

	@ManyToMany
	private final List<ProductEntity> products = new ArrayList<>();

}
