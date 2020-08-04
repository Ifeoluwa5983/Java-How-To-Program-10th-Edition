package com.shapesHierarchy;

public class Square extends TwoDimensional{
	
	public Square(double length,double width) {
		super(length,width);
	}
	public double calculateArea() {
		return Math.pow(length, 2);
	}

}
