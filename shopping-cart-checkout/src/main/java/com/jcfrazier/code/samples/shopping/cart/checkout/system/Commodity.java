/**
 * Code samples 2019
 * 
 */
package com.jcfrazier.code.samples.shopping.cart.checkout.system;

/**
 * A store item available for purchase.
 * 
 * @author jcfrazier
 */
public class Commodity implements Pricable {
    private final String id;
    private String name;
    private float price;

    public Commodity(String id, String name, float price) {
	this.id = id;
	this.name = name;
	this.price = price;
    }

    @Override
    public String getId() {
	return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public float getPrice() {
	return price;
    }

    public void setPrice(float price) {
	this.price = price;
    }
}
