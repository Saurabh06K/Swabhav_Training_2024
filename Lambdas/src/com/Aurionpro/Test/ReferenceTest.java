package com.Aurionpro.Test;

import com.Aurionpro.Model.ITest;
import com.Aurionpro.Model.Reference;

public class ReferenceTest {
	public static void main(String[] args) {
		ITest test1 = Reference::new;
		System.out.println(test1);
	}
}
