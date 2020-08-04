package com.shapesHierarchy;

public class TwoDimensional extends Shapes{
	
	 double length;
	 double width;
	
	public TwoDimensional(double length,double width) {
		this.length = length;
		this.width = width;
	}
	
	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double calculateArea() {
		return length * width;
	}
}
