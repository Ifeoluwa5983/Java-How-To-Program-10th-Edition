package com.carbon;

public class Bicycle implements CarbonFootPrint {
	
	private String color;
	private int no_of_wheels;
	private String model;
	private double mileage;
	private double emmissionFactor;
	
	public Bicycle(String color,int wheels,String model,double mileage,double emmissionFactor) {
		this.color = color;
		this.model = model;
		this.no_of_wheels = wheels;
		this.emmissionFactor = emmissionFactor;
		this.mileage = mileage;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getNo_of_wheels() {
		return no_of_wheels;
	}

	public void setNo_of_wheels(int no_of_wheels) {
		this.no_of_wheels = no_of_wheels;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getMileage() {
		return mileage;
	}

	public void setMileage(double mileage) {
		this.mileage = mileage;
	}

	public double getEmmissionFactor() {
		return emmissionFactor;
	}

	public void setEmmissionFactor(double emmissionFactor) {
		this.emmissionFactor = emmissionFactor;
	}
	public double getCarbonFootPrint() {
		return mileage / emmissionFactor;
	}
	public String toString() {
		return String.format("%s%n %d%n %s%n %f%n %f%n",
				getColor(),getNo_of_wheels(),getModel(),getMileage(),getEmmissionFactor());
	}
	

}
