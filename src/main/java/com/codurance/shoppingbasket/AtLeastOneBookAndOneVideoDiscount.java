package com.codurance.shoppingbasket;

import java.util.List;

import static org.apache.commons.lang.builder.EqualsBuilder.reflectionEquals;
import static org.apache.commons.lang.builder.HashCodeBuilder.reflectionHashCode;

class AtLeastOneBookAndOneVideoDiscount implements Discount {
	private int percentage;

	AtLeastOneBookAndOneVideoDiscount(int percentage) {
		this.percentage = percentage;
	}

	@Override
	public int percentage() {
		return percentage;
	}

	@Override
	public boolean isApplicableFor(List<ShoppingBasketItem> shoppingBasketItems) {
		return false;
	}

	@Override
	public boolean equals(Object o) {
		return reflectionEquals(this, o);
	}

	@Override
	public int hashCode() {
		return reflectionHashCode(this);
	}
}