package com.rectangle;

import java.util.logging.Logger;

public class Rectangle {
	private static final Logger LOGGER = Logger.getLogger(Rectangle.class.getName());
	private float length = 1;
	private float width = 1;
	
	
	public float getLength() {
		return length;
	}
	public void setLength(float length) {
		if(length > 0.0 || length < 20.0 ) {
			this.length = length;
		}LOGGER.warning("Number must be greater than 0.0 and less than 20.0!");
	}
	public float getWidth() {
		return width;
	}
	public void setWidth(float width) {
		if(width > 0.0 || width < 20.0 ) {
			this.width = width;
		}LOGGER.warning("Number must be greater than 0.0 and less than 20.0!");
	}
	
	public float calculateArea(float width,float length) {
		float area = length * width;
				return area;
	}
	public float calculatePerimeter(float width,float length) {
		float perimeter = 2 * (width + length);
		return perimeter;
	}

}
