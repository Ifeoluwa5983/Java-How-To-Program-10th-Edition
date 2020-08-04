package com.shapesHierarchy;

public class Cube extends ThreeDimensional{
	 public Cube(double length,double width,double heigth) {
		 super(length,width,heigth);
	 }
	 
	 public double calculateArea() {
		 return 6 * Math.pow(length, 2);
	 }
	 public double calculateVolume() {
		 return length * length * length;
	 }

}
