package example;

public class Parallelogram implements Quadrilateral {
	
	private double base;
	private double height;
	double myArea;
	
	public Parallelogram(double base, double height) {
		this.base = base;
		this.height = height;
	}

	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return myArea;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	public void myArea(double height,double base) {
		myArea = height * base;
	}

}
