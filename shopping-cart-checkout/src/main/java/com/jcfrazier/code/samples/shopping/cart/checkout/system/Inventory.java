/**
 * Code samples 2019
 * 
 */
package com.jcfrazier.code.samples.shopping.cart.checkout.system;

import java.util.Optional;

/**
 * All available known store items. Provides methods for adding and retrieval of
 * each item.
 * 
 * @author jcfrazier
 *
 * @param <T>
 */
public interface Inventory<T extends Item> {

    /**
     * Adds an item to the store inventory.
     * 
     * @param item the Item to be added
     * @return true, if added and false otherwise
     * @throws InventoryException
     */
    boolean addItem(T item) throws InventoryException;

    /**
     * Retrieves the item for the specified ID
     * 
     * @param id the item ID
     * @return the item, if available
     * @throws InventoryException
     */
    Optional<T> getItem(String id) throws InventoryException;
}
