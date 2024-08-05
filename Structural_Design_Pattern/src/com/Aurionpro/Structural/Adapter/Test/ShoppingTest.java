package com.Aurionpro.Structural.Adapter.Test;

import java.util.Arrays;

import com.Aurionpro.Structural.Adapter.Model.Biscuit;
import com.Aurionpro.Structural.Adapter.Model.Hat;
import com.Aurionpro.Structural.Adapter.Model.HatAdapter;
import com.Aurionpro.Structural.Adapter.Model.ShoppingCart;

public class ShoppingTest {
	public static void main(String[] args) {
		Biscuit biscuit = new Biscuit();
		biscuit.setName("Oreo");
		biscuit.setMrp(50);
		
		Hat hat = new Hat("Top", "Hat", 800, 30);
		HatAdapter hatAdapter = new HatAdapter(hat);
		hatAdapter.getItemName();
		hatAdapter.getItemPrice();
		
		ShoppingCart cart = new ShoppingCart(Arrays.asList(biscuit, hatAdapter));
		System.out.println(cart.getCartItems());
		System.out.println("Your cart price is: "+cart.getCartPrice());
	}
}
