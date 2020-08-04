package com.shapesHierarchy;

public class ThreeDimensional extends Shapes{
	
	 double length;
	 double width;
	 double heigth;
	
	
	public ThreeDimensional(double length,double width,double heigth) {
		this.heigth = heigth;
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
	public double getHeigth() {
		return heigth;
	}
	public void setHeigth(double heigth) {
		this.heigth = heigth;
	}
	
	public double calculateArea() {
		return length * width * heigth;
	}
	public double calculateVolume() {
		return length * width;
	}
	
	
	

}
