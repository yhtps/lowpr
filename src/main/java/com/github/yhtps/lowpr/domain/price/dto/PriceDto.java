package com.github.yhtps.lowpr.domain.price.dto;

import java.time.LocalDate;

import com.github.yhtps.lowpr.domain.common.enums.Store;
import com.github.yhtps.lowpr.domain.product.ProductEntity;

import lombok.Data;

@Data
public class PriceDto {

	private long no;

	private int defPrice;

	private int disPrice;

	private int billPrice;

	private LocalDate startDate;

	private LocalDate endDate;

	private Store storeName;

	private String paymentsMethod;

	private boolean isOffline;

	private String deliveryFee;

	private boolean membership;

	private ProductEntity product;

}
