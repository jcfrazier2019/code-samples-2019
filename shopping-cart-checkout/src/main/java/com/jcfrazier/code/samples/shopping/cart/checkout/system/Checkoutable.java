/**
 * Code samples 2019
 * 
 */
package com.jcfrazier.code.samples.shopping.cart.checkout.system;

import java.util.List;

/**
 * Performs checkout for a list items.
 * 
 * @author jcfrazier
 *
 */
public interface Checkoutable {
    
    /**
     * Performs checkout for the specified items by calculating the sum of the prices for each
     * item in the list.
     * @param items the list of items to be checked out.
     * @return the calculated total of all the items in the specified item list
     */
    double checkout(List<String> items);
}
