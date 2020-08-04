package example;

public class Rectangle implements Quadrilateral {
	
	private double length;
	private double breadth;
	double area;
	public Rectangle(double  length, double side) {
		this.length = length;
		this.breadth = side;
	}
	
	public double calculateArea() {
		return area;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getBreadth() {
		return breadth;
	}

	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}
	public void area(double length,double breadth) {
		area = length * breadth;
	}
	

}
