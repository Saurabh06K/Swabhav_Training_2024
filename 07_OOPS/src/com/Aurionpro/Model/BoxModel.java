package com.Aurionpro.Model;

public class BoxModel {
	private int height = 10;
	private int width = 10;
	private int depth = 10;

	public BoxModel() {
		this.height = height;
		this.width = width;
		this.depth = depth;
	}

	public BoxModel(int height, int width) {
		this();
		this.height = height;
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public int getWidth() {
		return width;
	}

	public int getDepth() {
		return depth;
	}

	public void setHeight(int h) {
		height = h;
	}

	public void setWidth(int w) {
		height = w;
	}

	public void setDepth(int d) {
		height = d;
	}

	public int calculateArea() {
		return height * width * depth;
	}
}
