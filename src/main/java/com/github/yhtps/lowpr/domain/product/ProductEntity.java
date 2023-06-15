package com.github.yhtps.lowpr.domain.product;

import java.util.ArrayList;
import java.util.List;

import com.github.yhtps.lowpr.domain.category.CategoryEntity;
import com.github.yhtps.lowpr.domain.common.BaseEntityBody;
import com.github.yhtps.lowpr.domain.common.enums.ProdUnit;
import com.github.yhtps.lowpr.domain.member.MemberEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor(access = AccessLevel.PROTECTED)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
@Table(name = "Product")
public class ProductEntity extends BaseEntityBody {

	// TODO 물품사진
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long no;

	@Column(nullable = false, unique = true)
	private String name;

	// TODO chatGPT api로 설명 쓰기
	private String description;

	/**
	 * 단위 (mg,g,ml,l....)
	 */
	@Enumerated(EnumType.STRING)
	private ProdUnit unit;

	/**
	 * 수량 (1000ml,500g....)
	 */
	private int quantity;

	/**
	 * 개수 (1개, 5개....)
	 */
	private int ea;

	@ManyToOne
	private MemberEntity member;

	@ManyToMany
	private List<CategoryEntity> categories = new ArrayList<>();

	@Builder
	protected ProductEntity(long no, String name, String description, ProdUnit unit, int quantity, int ea, MemberEntity member) {
		this.no = no;
		this.name = name;
		this.description = description;
		this.unit = unit;
		this.quantity = quantity;
		this.ea = ea;
		this.member = member;
	}

}
