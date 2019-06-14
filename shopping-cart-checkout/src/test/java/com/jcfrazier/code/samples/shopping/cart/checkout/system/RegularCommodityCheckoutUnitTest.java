/**
 * Code samples 2019
 * 
 */
package com.jcfrazier.code.samples.shopping.cart.checkout.system;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

/**
 * Tests for RegularCommodityCheckout
 * 
 * @author jcfrazier
 * 
 * @see RegularCommodityCheckout
 */
public class RegularCommodityCheckoutUnitTest {
    private static final String MOCKED_ITEM_ONE_ID = "id1";
    private static final String MOCKED_ITEM_TWO_ID = "id2";
    private static final float TWENTY_CENTS = 0.25f;
    private static final float SIXTY_CENTS = 0.60f;
    private static final Double TOTAL_CALCULATED = new Double(TWENTY_CENTS + SIXTY_CENTS);

    @Mock
    private Commodity mockedItem1;
   
    @Mock
    private Commodity mockedItem2;
   
    @Mock
    private CommodityInventory commodityInventory;

    private RegularCommodityCheckout regularCommodityCheckout;

    private final List<String> itemList = Arrays.asList(new String[] { MOCKED_ITEM_ONE_ID, MOCKED_ITEM_TWO_ID });

    @Before
    public void setUp() {
	commodityInventory = mock(CommodityInventory.class);
	mockedItem1 = mock(Commodity.class);
	
	when(mockedItem1.getId()).thenReturn(MOCKED_ITEM_ONE_ID);
	when(mockedItem1.getPrice()).thenReturn(TWENTY_CENTS);
	
	mockedItem2 = mock(Commodity.class);
	when(mockedItem2.getId()).thenReturn(MOCKED_ITEM_TWO_ID);
	when(mockedItem2.getPrice()).thenReturn(SIXTY_CENTS);
	
	when(commodityInventory.getItem(MOCKED_ITEM_ONE_ID)).thenReturn(Optional.of(mockedItem1));
	when(commodityInventory.getItem(MOCKED_ITEM_TWO_ID)).thenReturn(Optional.of(mockedItem2));
	
	regularCommodityCheckout = new RegularCommodityCheckout(commodityInventory);
    }

    @Test
    public void checkout_should_return_85_cents_for_a_single_item() throws Exception {
	assertEquals(TOTAL_CALCULATED, new Double(regularCommodityCheckout.checkout(itemList)));
    }
}
