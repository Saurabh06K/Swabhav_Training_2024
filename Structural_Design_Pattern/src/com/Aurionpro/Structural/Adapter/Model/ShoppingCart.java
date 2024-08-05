package com.Aurionpro.Structural.Adapter.Model;

import java.util.List;

public class ShoppingCart {
	List<IItems> cartItems;

	public ShoppingCart(List<IItems> cartItems) {
		super();
		this.cartItems = cartItems;
	}
	
	void addItemToCart(IItems item) {
		cartItems.add(item);
	}
	
	public List<IItems> getCartItems() {
		return cartItems;
	}
	
	public double getCartPrice() {
		double totalPrice = 0.0;
		for (IItems iItems : cartItems) {
			totalPrice += iItems.getItemPrice();
		}
		return totalPrice;
	}

	@Override
	public String toString() {
		return "ShoppingCart [cartItems=" + cartItems + "]";
	}
	
	
}
