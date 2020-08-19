package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Exercise1612.ColorCodes;

class ColorCodesTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	 @Test
	    void testColor() {
	        ColorCodes color = new ColorCodes();

	        color.draw("black");
	        color.draw("white");
	    }
}
