package com.Aurionpro.Test;

import java.lang.reflect.Method;

public class ReflectionTest {
	public static void main(String[] args) throws ClassNotFoundException {
		Class stringClass = Class.forName("java.lang.String");
		System.out.println(stringClass.getName());
		System.out.println(stringClass.getSimpleName());
		System.out.println(stringClass.getTypeName());
		System.out.println(stringClass.toGenericString());

		Method stringMethods[] = stringClass.getMethods();
		for (Method method : stringMethods) {
			System.out.println("Method: " + method.getName() + "--->" + method.getParameterCount());
		}
	}
}
