package com.Aurionpro.Test;

import com.Aurionpro.Model.*;

public class PC {
	public static void main(String[] args) {
		Q q = new Q();
		new Producer(q);
		new Consumer(q);
		System.out.println("Press Control-C to stop.");
	}
}
