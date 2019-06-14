/**
 * Code samples 2019
 * 
 */
package com.jcfrazier.code.samples.shopping.cart.checkout.system;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Tests for CommodityInventoryUtil.
 * 
 * @author jcfrazier
 * 
 * @see CommodityInventoryUtil
 *
 */
public class CommodityInventoryUtilUnitTest {

    @Test
    public void createCommodities_should_create_2_commodities() throws Exception {
	assertEquals(2, CommodityInventoryUtil.createCommodities().size());
    }
}
