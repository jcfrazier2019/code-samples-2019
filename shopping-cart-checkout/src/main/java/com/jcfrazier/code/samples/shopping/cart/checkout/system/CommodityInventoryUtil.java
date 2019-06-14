/**
 * Code samples 2019
 * 
 */
package com.jcfrazier.code.samples.shopping.cart.checkout.system;

import java.util.Arrays;
import java.util.List;

/**
 * Commodity inventory utilities.
 * 
 * @author jcfrazier
 *
 */
public class CommodityInventoryUtil {

    /**
     * Creates a list of comoddities.
     * 
     * @return the list of commodities
     */
    public static final List<Commodity> createCommodities() {
	return Arrays
		.asList(new Commodity[] { new Commodity("0", "Apple", 0.60f), new Commodity("1", "Orange", 0.25f) });

    }
}
