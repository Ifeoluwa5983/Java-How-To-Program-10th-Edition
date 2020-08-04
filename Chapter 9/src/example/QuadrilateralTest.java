package example;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class QuadrilateralTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		Quadrilateral rec = new Rectangle(3.0,2.0);
		Quadrilateral aSquare = new Square(5);
		Quadrilateral para = new Parallelogram(12,10);
		Quadrilateral trap = new Trapezium(2,4,6);
		
	}

	@AfterEach
	void tearDown() throws Exception {
	}
	@Test
	void anything() {
		ArrayList <Quadrilateral> lateral = new ArrayList ();
		//rec.calculateArea();
		
		
	}

}
