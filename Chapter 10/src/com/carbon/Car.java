package com.carbon;

public class Car implements  CarbonFootPrint {
	private String model;
	private int year;
	private String color;
	private double mileage;
	private double emmissionFactor;
	
	public Car(String model,String color,int year,double mileage,double emmissionFactor) {
		this.color = color;
		this.model = model;
		this.year = year;
		this.emmissionFactor = emmissionFactor;
		this.mileage = mileage;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
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
				getColor(),getYear(),getModel(),getMileage(),getEmmissionFactor());
	}

}
