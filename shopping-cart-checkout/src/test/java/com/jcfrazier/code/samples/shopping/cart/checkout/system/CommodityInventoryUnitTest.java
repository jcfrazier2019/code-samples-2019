/**
 * Code samples 2019
 * 
 */
package com.jcfrazier.code.samples.shopping.cart.checkout.system;

import static org.junit.Assert.assertEquals;

import java.util.Optional;

import org.junit.Before;
import org.junit.Test;

/**
 * Tests for CommodityInventory
 * 
 * @author jcfrazier
 * 
 * @see CommodityInventory
 *
 */
public class CommodityInventoryUnitTest {
    private static final String TEST_COMMODITY_ID = "test_commodity_id";
    private static final String NONE_EXISTING_COMMODITY_ID = "none_existing_commodity_id";
    private static final Commodity TEST_COMMODITY = new Commodity(TEST_COMMODITY_ID, "TestCommodity", 1.0f);

    private CommodityInventory commodityInventory;

    @Before
    public void setUp() {
	commodityInventory = new CommodityInventory();
    }

    @Test
    public void addItem_should_add_nonexisting_item_to_inventory() throws Exception {
	assertEquals(true, commodityInventory.addItem(TEST_COMMODITY));
    }

    @Test
    public void addItem_should_not_add_existing_item_to_inventory() throws Exception {
	assertEquals(false, commodityInventory.addItem(TEST_COMMODITY));
    }

    @Test
    public void getItem_should_return_empty_optional_for_nonexisting_item_in_inventory() throws Exception {
	assertEquals(Optional.empty(), commodityInventory.getItem(NONE_EXISTING_COMMODITY_ID));
    }

    @Test
    public void getItem_should_return_item_for_existing_item_in_inventory() throws Exception {
	assertEquals(TEST_COMMODITY, commodityInventory.getItem(TEST_COMMODITY_ID).get());
    }

    @Test
    public void getItem_should_return_item_for_apple_item_in_inventory() throws Exception {
	assertEquals("Apple", commodityInventory.getItem("0").get().getName());
    }
}
