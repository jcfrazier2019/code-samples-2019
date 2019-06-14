/**
 * Code samples 2019
 * 
 */
package com.jcfrazier.code.samples.shopping.cart.checkout.app;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import com.jcfrazier.code.samples.shopping.cart.checkout.system.Checkoutable;
import com.jcfrazier.code.samples.shopping.cart.checkout.system.CommodityInventory;
import com.jcfrazier.code.samples.shopping.cart.checkout.system.RegularCommodityCheckout;

/**
 * Main runner program for checking out.
 * 
 * @author jcfrazier
 */
public class CheckoutRegister {
    private static final String COMMODITY_ADDED_TO_CART_SUCCESSFULL_MESSAGE = " added to shopping cart!";
    private static final String INVALID_ENTRY_MESSAGE = " is not a valid entry! ";
    private static final String COMMODITY_INPUT_PROMPT = "Type 0=Add Apple to shopping cart, 1=Add Orange to shopping cart, C=Checkout, X=Exit the program. Hit the [ENTER] key to submit each option.";
    private static final String INPUT_COMPLETE_FLAG = "C";
    private static final String EXIT_PROMPT_FLAG = "X";
    private static final NumberFormat LOCAL_CURRENCY_FORMATTER = NumberFormat.getCurrencyInstance(Locale.getDefault());
    private static final CommodityInventory COMMODITY_INVENTORY = new CommodityInventory();
    
    public static void main(String[] args) {
	final RegularCommodityCheckout regularCheckout = new RegularCommodityCheckout(COMMODITY_INVENTORY);
	
	printPromptHelp();
	final Scanner scanner = new Scanner(System.in);
	final List<String> shoppingCart = new ArrayList<String>();

	String input;
	while (!(input = scanner.next()).equals(EXIT_PROMPT_FLAG)) {
	    switch (input) {
	    case "0":
	    case "1":
		shoppingCart.add(input);
		System.out.println(COMMODITY_INVENTORY.getItem(input).get().getName()
			+ COMMODITY_ADDED_TO_CART_SUCCESSFULL_MESSAGE);
		break;
	    case INPUT_COMPLETE_FLAG:
		printCheckoutOuput(shoppingCart, regularCheckout);
		break;
	    default:
		System.out.println(input + INVALID_ENTRY_MESSAGE);
		System.out.println(COMMODITY_INPUT_PROMPT);
		break;
	    }
	}
	scanner.close();
	System.out.println("Thanks for shopping! Goodbye!");
    }

    private static final void printCheckoutOuput(List<String> shoppingCart, Checkoutable checkoutable) {
	final StringBuilder output;
	if (shoppingCart.isEmpty()) {
	    output = new StringBuilder("No items in the shopping cart!");
	} else {
	    output = new StringBuilder(getCommoditiesNameFromItemIdInShoopingCart(shoppingCart)).append("=>")
		    .append(LOCAL_CURRENCY_FORMATTER.format(checkoutable.checkout(shoppingCart)));
	    shoppingCart.clear();
	}
	System.out.println(output);
	printPromptHelp();
    }

    private static final String getCommoditiesNameFromItemIdInShoopingCart(List<String> itemIds) {
	return itemIds.stream().map(i -> COMMODITY_INVENTORY.getItem(i).get().getName()).collect(Collectors.toList())
		.toString();
    }

    private static final void printPromptHelp() {
	System.out.println(COMMODITY_INPUT_PROMPT);
    }
}
