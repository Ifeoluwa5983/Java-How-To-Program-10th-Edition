package Exercise1616;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PrimeNumbersAndFactors {
	 private int number;
	    private List<Integer> factors =  new ArrayList<Integer>();
	    private Set<Integer> setFactors;

	    public PrimeNumbersAndFactors(int number) throws PrimeException {
	        if (number == 0 ) {
	            throw new PrimeException("Number cannot be 0");
	        } else if (number == 1){
	            throw new PrimeException("NUmber cannot be 1");
	        }
	        this.number = number;
	    }

	    public PrimeNumbersAndFactors() throws PrimeException {
	        this(2);
	    }

	    public boolean isPrime() {
	        if (number % 2 == 0) {
	            return false;
	        }
	        return true;
	    }

	    public List<Integer> getFactors() {
	        if (number % 2 == 0) {
	           int result = number;
	           for (int i = 2; i <= result;) {
	               if (result % i == 0) {
	                   factors.add(i);
	                   result = result / i;
	               } else {
	                   i++;
	               }
	           }
	        } else {
	            factors.add(number);
	            factors.add(1);
	        }
	        return factors;
	    }

	    public Set<Integer> getSetFactors() {
	        getFactors();
	        setFactors = new HashSet<>(factors);
	        return setFactors;
	    }

}
