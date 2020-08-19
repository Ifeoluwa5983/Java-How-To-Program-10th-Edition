package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.Set;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Exercise1616.PrimeException;
import Exercise1616.PrimeNumbersAndFactors;

class PrimeNumbersAndFactorsTest {

	@BeforeEach
	void setUp() throws Exception {
	}

		@Test
	    void testPrimeNumber() throws PrimeException {
	        PrimeNumbersAndFactors number;
	        try {
	            number = new PrimeNumbersAndFactors(54);
	        } catch (PrimeException e) {
	            System.out.println(e.getMessage());
	            number = new PrimeNumbersAndFactors();
	        }

	        List<Integer> factors = number.getFactors();
	        Set<Integer> setFactors = number.getSetFactors();
	        boolean isPrime =  number.isPrime();

	        assertFalse(isPrime);

	        System.out.print("Prime Factors: ");
	        for (int factor : factors) {
	            System.out.print(factor + " ");
	        }

	        System.out.printf("%nSet Prime Factors: ");
	        for (int factor : setFactors) {
	            System.out.print(factor + " ");
	        }
	    }

}
