package com.shapesHierarchy;

public class Rectangle extends TwoDimensional{
	
	public Rectangle(double length,double width) {
		super(length,width);
	}
	public double calculateArea() {
		return length * width;
		
	}
	
	

}
