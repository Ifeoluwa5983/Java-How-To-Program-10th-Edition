package exercise722;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class KnightsTourTest2 {
	KnightsTour knight;


	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		knight = new KnightsTour();
	}

	@AfterEach
	void tearDown() throws Exception {
	}
	@Test
	void testKnight() {
		int[] horizontal = {2,2,1,-2,1,1,2,-1};
		int[] vertical = {1,-1,2,1,2,-2,1,2};
		knight.knightMove(horizontal,vertical);
		knight.moveKnight();
		
		
	

	}

}
