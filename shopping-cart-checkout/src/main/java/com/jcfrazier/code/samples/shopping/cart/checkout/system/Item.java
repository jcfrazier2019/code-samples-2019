/**
 * Code samples 2019
 * 
 */
package com.jcfrazier.code.samples.shopping.cart.checkout.system;

/**
 * An available store item.
 * 
 * @author jcfrazier
 *
 */
public interface Item {
    /**
     * Retrieves the ID of the item.
     * @return the ID of the item
     */
    String getId();
    
    /**
     * Retrieves the name of the item.
     * @return the name of the item
     */
    String getName();
}
