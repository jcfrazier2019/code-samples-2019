/**
 * Code samples 2019
 * 
 */
package com.jcfrazier.code.samples.shopping.cart.checkout.system;

/**
 * A store item available for purchase.
 * 
 * @author jcfrazier
 *
 */
public interface Pricable extends Item {
    /**
     * Retrieves the item price
     * @return the price of the item
     */
    float getPrice();
}
