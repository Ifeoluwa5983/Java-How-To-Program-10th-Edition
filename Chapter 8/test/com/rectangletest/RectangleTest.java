package com.rectangletest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.rectangle.Rectangle;

class RectangleTest {
	Rectangle rec;

	@BeforeEach
	void setUp() throws Exception {
		rec = new Rectangle();
	}

	@Test
	void test() {
		rec.setLength(34);
	}

}
