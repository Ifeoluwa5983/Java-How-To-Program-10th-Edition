package exercise721;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TurtleTest {
	Turtle turtle;
	Pen biro;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		turtle = new Turtle();
		biro = new Pen();
		turtle.setTurtlePen(biro);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void createTurtle() {
		assertEquals(0, turtle.getrowPosition());
		assertEquals(0, turtle.getcolPosition());
		assertEquals(PenPosition.UP, turtle.getTurtlePen().getPositionOfThePen());
		
	}
	@Test
	void create() {
		assertEquals(0, turtle.getrowPosition());
		assertEquals(0, turtle.getcolPosition());
		assertEquals(PenPosition.UP, turtle.getTurtlePen().getPositionOfThePen());
		
	}
	@Test
	void moveForwardWithPenUp() {
		assertEquals(0, turtle.getrowPosition());
		assertEquals(0, turtle.getcolPosition());
		assertEquals(PenPosition.UP, turtle.getTurtlePen().getPositionOfThePen());
		assertEquals(Direction.NORTH,turtle.getCardinalPoints());
		
		
	}
	@Test
	void putPenDown() {
		assertEquals(PenPosition.UP,turtle.getTurtlePen());
		turtle.changePenPosition(PenPosition.DOWN);
		assertEquals(PenPosition.DOWN, turtle.getTurtlePen().getPositionOfThePen());
	}
	
	
	/**void testingSquare() {
		
		
		for(int i = 0; i < pad.getFloor().length; i++) {
			for(int j = 0; j < pad.getFloor().length; j++) {
				if(pad.getFloor()[i][j] == 1) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}**/


}
