/**
 * Code samples 2019
 * 
 */
package com.jcfrazier.code.samples.shopping.cart.checkout.system;

import java.util.Collections;
import java.util.List;

/**
 * Performs a simple offer check out.
 * 
 * @author jcfrazier
 *
 */
public class SimpleOfferCommodityCheckout implements Checkoutable {
	private final List<SimpleOffer> simpleOffers;
	private final RegularCommodityCheckout regularCommodityCheckout;

	public SimpleOfferCommodityCheckout(List<SimpleOffer> simpleOffers,
			RegularCommodityCheckout regularCommodityCheckout) {
		this.simpleOffers = simpleOffers;
		this.regularCommodityCheckout = regularCommodityCheckout;
	}

	@Override
	public double checkout(List<String> items) {
		return regularCommodityCheckout.checkout(items) - getTotalDeduction(items);
	}

	private final double getTotalDeduction(List<String> items) {
		return simpleOffers.stream().mapToDouble(s -> getOfferDeduction(s, items)).sum();
	}

	private static final float getOfferDeduction(SimpleOffer offer, List<String> items) {
		Commodity item = offer.getItem();
		String id = item.getId();
		int count = Collections.frequency(items, id);
		return (count > 0) ? (count / offer.getMinimumOfferTotal()) * item.getPrice() : 0f;
	}
}
