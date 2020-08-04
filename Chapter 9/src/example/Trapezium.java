package example;

public class Trapezium implements Quadrilateral {
	
	private double height;
	private double upperBase;
	private double lowerBase;
	double area;
	public Trapezium(double height,double lowerBase,double upperBase) {
		this.height = height;
		this.lowerBase = lowerBase;
		this.upperBase = upperBase;
	}

	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return area;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getUpperBase() {
		return upperBase;
	}

	public void setUpperBase(double upperBase) {
		this.upperBase = upperBase;
	}

	public double getLowerBase() {
		return lowerBase;
	}

	public void setLowerBase(double lowerBase) {
		this.lowerBase = lowerBase;
	}
	public void area(double upperBase,double lowerBase,double height) {
		area = 0.5 * (upperBase + lowerBase) * height;
	}
	
	

}
