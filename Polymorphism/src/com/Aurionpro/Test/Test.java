package com.Aurionpro.Test;

import com.Aurionpro.Model.Base;
import com.Aurionpro.Model.Derived1;
import com.Aurionpro.Model.Derived2;

public class Test {
	public static void main(String[] args) {
		Base base1 = new Base();
		base1.display();
		Base derived1 = new Derived1();
		derived1.display();
		Base derived2 = new Derived2();
		derived2.display();

		base1 = derived1;
		base1.display();

		// derived2 = base1;
		// *** Super class reference can refer to the objects of sub class but not the other
		// way round but only to those methods which are inherited

	}
}
