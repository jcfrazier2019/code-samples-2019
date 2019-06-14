/**
 * Code samples 2019
 * 
 */
package com.jcfrazier.code.samples.shopping.cart.checkout.system;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * All available items for purchase with associated prices in the store.
 * 
 * @author jcfrazier
 *
 */
public class CommodityInventory implements Inventory<Commodity> {
    private static final List<Commodity> COMODITIES = new ArrayList<Commodity>();

    public CommodityInventory() {
	initializeCommodityInventoryWithDefaultCommodities();
    }

    @Override
    public boolean addItem(Commodity item) {
	return addCommodityIfNotAlreadyExists(item);
    }

    @Override
    public Optional<Commodity> getItem(String id) {
	return findItemById(id);
    }

    private static final Optional<Commodity> findItemById(String id) {
	return COMODITIES.parallelStream().filter(i -> i.getId().equals(id)).findFirst();
    }

    private static final boolean addCommodityIfNotAlreadyExists(Commodity item) {
	return findItemById(item.getId()).isPresent() ? false : COMODITIES.add(item);
    }
    
    private static final void initializeCommodityInventoryWithDefaultCommodities() {
	CommodityInventoryUtil.createCommodities().forEach(CommodityInventory::addCommodityIfNotAlreadyExists);
    }
}
