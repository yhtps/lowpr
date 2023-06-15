package com.github.yhtps.lowpr.domain.price;

import java.time.LocalDate;
import java.util.Set;

import com.github.yhtps.lowpr.domain.common.BaseEntityBody;
import com.github.yhtps.lowpr.domain.common.enums.CreditCard;
import com.github.yhtps.lowpr.domain.common.enums.Store;
import com.github.yhtps.lowpr.domain.product.ProductEntity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor(access = AccessLevel.PROTECTED)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
@Table(name = "Price")
public class PriceEntity extends BaseEntityBody {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
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

	private Set<CreditCard> cards;

	/**
	 * 스마일클럽, 쿠팡와우등 유료 멤버십에 해당하는지
	 */
	private boolean membership;

	@ManyToOne
	private ProductEntity product;

}
