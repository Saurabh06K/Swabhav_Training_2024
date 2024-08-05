package com.Aurionpro.Test;

import com.Aurionpro.Model.*;

public class BoxTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BoxModel box1 = new BoxModel();
		BoxModel(14,18);
		box1.setHeight(10);
		box1.setWidth(15);
		box1.setDepth(12);
		System.out.println(box1.getHeight());
		System.out.println(box1.getWidth());
		System.out.println(box1.getDepth());
		System.out.println(box1.calculateArea());

		BoxModel box2 = new BoxModel();
		box2.setHeight(5);
		box2.setWidth(12);
		box2.setDepth(15);
		box2.getHeight();
		box2.getWidth();
		box2.getDepth();
		System.out.println(box2.calculateArea());
	}

	private static void BoxModel(int i, int j) {
		// TODO Auto-generated method stub
		
	}

}
