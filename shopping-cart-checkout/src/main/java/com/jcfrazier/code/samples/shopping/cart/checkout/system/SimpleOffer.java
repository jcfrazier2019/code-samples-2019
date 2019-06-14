/**
 * Code samples 2019
 * 
 */
package com.jcfrazier.code.samples.shopping.cart.checkout.system;

/**
 * Simple offer
 * 
 * @author jcfrazier
 *
 */
public class SimpleOffer {
	private final Commodity item;
	private int minimumOfferTotal;

	public SimpleOffer(Commodity item, int minimumOfferTotal) {
		this.item = item;
		this.minimumOfferTotal = minimumOfferTotal;
	}

	public int getMinimumOfferTotal() {
		return minimumOfferTotal;
	}

	public void setMinimumOfferTotal(int minimumOfferTotal) {
		this.minimumOfferTotal = minimumOfferTotal;
	}

	public Commodity getItem() {
		return item;
	}
}
