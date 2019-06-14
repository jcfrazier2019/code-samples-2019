/**
 * Code samples 2019
 * 
 */
package com.jcfrazier.code.samples.shopping.cart.checkout.system;

/**
 * Thrown by Inventory operations.
 * 
 * @author jcfrazier
 *
 */
public class InventoryException extends RuntimeException {

    /**
     * 
     */
    private static final long serialVersionUID = 8205054369977270945L;


    public InventoryException(String message) {
	super(message);
    }
    
    public InventoryException(String message, Throwable cause) {
	super(message, cause);
    }
}
