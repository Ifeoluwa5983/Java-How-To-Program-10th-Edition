package example;

public class Square implements Quadrilateral {
	
	private double side;
	double area;
	public Square(double sideLength) {
		this.side = sideLength;
	}
	public double calculateArea() {
		return area;
	}
	public double getSide() {
		return side;
	}
	public void setSide(double side) {
		this.side = side;
	}
	public void calArea(double side) {
		area = side * side;
	}
}
