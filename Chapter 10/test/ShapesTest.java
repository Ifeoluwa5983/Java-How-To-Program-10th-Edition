import static org.junit.jupiter.api.Assertions.*;

import java.awt.Shape;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.shapesHierarchy.Cube;
import com.shapesHierarchy.Prism;
import com.shapesHierarchy.Rectangle;
import com.shapesHierarchy.Shapes;
import com.shapesHierarchy.Square;

class ShapesTest {
	Shapes rec;
	Shapes squ;
	Shapes cube;
	Shapes prism;

	@BeforeEach
	void setUp() throws Exception {
		rec = new Rectangle(2,3);
		squ = new Square(3,2);
		cube = new Cube(3,2,5);
		prism = new Prism(3,2,5,2);

	}

	@Test
	void test() {
		
		rec.calculateArea();
		assertEquals(6,rec.calculateArea());
	}
	@Test
	void test2() {
		squ.calculateArea();
		assertEquals(9, squ.calculateArea());
	}
	@Test
	void test3() {
		cube.calculateArea();
		assertEquals(54, cube.calculateArea());
		
		cube.calculateVolume();
		assertEquals(27, cube.calculateVolume());
		Shapes[] shapes = new Shapes [2];
		}
	@Test
	void test4() {
		prism.calculateArea();
		assertEquals(62, prism.calculateArea());
		
		prism.calculateVolume();
		assertEquals(10, prism.calculateVolume());
	}
	@Test
	void TestingShapes() {
		Shapes shapes[] = new Shapes[4];
		shapes[0] = rec;
		shapes[1] = squ;
		shapes[2] = cube;
		shapes[3] = prism;
		
		for (int i = 0; i < shapes.length; i++) {
			if(i <= 2) {
				System.out.println(rec.calculateArea());
			}
			else {
				System.out.println(cube.calculateArea());
			}
			//System.out.println(shapes[i].calculateVolume());
		}
	}

}
