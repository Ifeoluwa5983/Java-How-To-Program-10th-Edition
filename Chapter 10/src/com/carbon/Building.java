package com.carbon;

public class Building implements CarbonFootPrint {
	private String type;
	private String  color;
	private double fossilFuelUse;
	private double emmissionFactor;
	
	public Building(String type,String color,double fossilFuelUse,double emmissionFactor) {
		this.color = color;
		this.type = type;
		this.emmissionFactor = emmissionFactor;
		this.fossilFuelUse = fossilFuelUse;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getFossilFuelUse() {
		return fossilFuelUse;
	}

	public void setFossilFuelUse(double fossilFuelUse) {
		this.fossilFuelUse = fossilFuelUse;
	}

	public double getEmmissionFactor() {
		return emmissionFactor;
	}

	public void setEmmissionFactor(double emmissionFactor) {
		this.emmissionFactor = emmissionFactor;
	}
	public double getCarbonFootPrint() {
		return fossilFuelUse * emmissionFactor;
	}
	public String toString() {
		return String.format("%s%n %s%n %f%n %f%n",
				getType(),getColor(),getFossilFuelUse(),getEmmissionFactor());
	}
}
