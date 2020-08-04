package com.shapesHierarchy;

public class Prism extends ThreeDimensional{
	private double base;
	
	public Prism(double length,double width,double heigth,double base) {
		super(length,width,heigth);
		
		this.base = base;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}
	public double calculateArea() {
		return 2 * ((width * length) + (heigth * length)+ (heigth * width));
	}
	public double calculateVolume() {
		return base * heigth;
	}
}
