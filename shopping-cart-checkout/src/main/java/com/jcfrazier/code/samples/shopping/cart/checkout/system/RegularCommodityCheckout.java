/**
 * Code samples 2019
 * 
 */
package com.jcfrazier.code.samples.shopping.cart.checkout.system;

import java.util.List;

/**
 * Performs a regular check out.
 * 
 * @author jcfrazier
 *
 */
public class RegularCommodityCheckout implements Checkoutable {
    private final CommodityInventory itemInventory;

    /**
     * Constructs a regular commodity check out instance with the specified commodity inventory.
     * @param itemInventory the commodity inventory
     */
    public RegularCommodityCheckout(CommodityInventory itemInventory) {
	this.itemInventory = itemInventory;
    }

    @Override
    public double checkout(List<String> itemIds) {
	return itemIds.parallelStream().mapToDouble(i -> getCommodityPrice(i)).sum();
    }

    private final float getCommodityPrice(String itemId) {
	return itemInventory.getItem(itemId).get().getPrice();
    }

}
