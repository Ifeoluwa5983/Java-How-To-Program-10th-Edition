package example;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.IntStream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LambdasTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void wimpSum() {
		int total = 0;
		for(int i = 1;i <= 10;i++) {
			total = total + i;
		}
		assertEquals(55, total);
	}
	@Test
	void geeSum() {
		int total = IntStream.rangeClosed(1, 10).sum();
		assertEquals(55, total);
	}

}
