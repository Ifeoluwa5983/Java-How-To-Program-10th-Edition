package Chapter7;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class arrayTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}
	@Test
	void firstTest() {
		
		
	}
	@Test
	void barChart() {
		int[] marks = {57, 67, 77, 87, 97};
		int[] frequency = {3, 1, 7, 2, 5};
		
		for(int i = 0;i < frequency.length;i++) {
			int numberOfTimesLooped = frequency[i];
			System.out.print(marks[i] + " :  ");
			for(int j = 0;j <= numberOfTimesLooped;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

}
