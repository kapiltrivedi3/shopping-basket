package com.codurance.shoppingbasket.discount;

import com.codurance.shoppingbasket.basket.ShoppingBasket;
import org.junit.Before;
import org.junit.Test;

import static com.codurance.shoppingbasket.basket.ShoppingBasketBuilder.aShoppingBasket;
import static com.codurance.shoppingbasket.product.ProductBuilder.aBook;
import static com.codurance.shoppingbasket.product.ProductBuilder.aVideo;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class AtLeastOneBookAndOneVideoDiscountShould {

	private static final int QTY_2 = 2;
	private AtLeastOneBookAndOneVideoDiscount discount;

	@Before
	public void initialise() {
		discount = new AtLeastOneBookAndOneVideoDiscount(20);
	}

	@Test public void
	return_its_percentage() {
		assertThat(discount.percentage(), is(20));
	}

	@Test public void
	not_be_applicable_for_baskets_without_a_book() {
		ShoppingBasket basket = aShoppingBasket()
										.withItem(aVideo().build(), QTY_2)
										.build();

	    assertThat(discount.isApplicableTo(basket), is(false));
	}

	@Test public void
	not_be_applicable_for_baskets_without_a_video() {
		ShoppingBasket basket = aShoppingBasket()
										.withItem(aBook().build(), QTY_2)
										.build();

	    assertThat(discount.isApplicableTo(basket), is(false));
	}

}