package Collection;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.Vector;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class GadansCollectionTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void test() {
		//autoboxing
		int gadansCount = 25;
		List<Integer> cohortCount = new ArrayList<Integer>();
		cohortCount.add(gadansCount);
		String gadanPriest = "Samuel";
		//cohortCount.add(gadansPriest);// the list performs the autoboxing and can collect just integers
		
		//this performs a loop on the list(iterate)
		Iterator<Integer> iterator = cohortCount.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		for(Integer count : cohortCount) {
			
		}
		
		List<String> agentsOfTheGods = new Vector<String>();
		agentsOfTheGods.add(gadanPriest);
		
		Set<String> gadans = new HashSet<String>();
		boolean result = gadans.add(gadanPriest);
		assertTrue(result);
		result= gadans.add("Ifeoluwa");
		assertTrue(result);
		
		Iterator<String> gadansIterator = agentsOfTheGods.iterator();
		while(gadansIterator.hasNext()) {
			System.out.println(gadansIterator.next());
		
		Map<String ,String> nativeId = new TreeMap<String, String>();
		String value = nativeId.put("Samuel", "4028");
		assertNull(value);
		value = nativeId.put("Ifeoluwa", "4034");
		assertNull(value);
		
		}	
	}
	@Test
	void test2() {
		List<String> gadans= List.of("Ifeoluwa","Kolawole","Ayomiposi","Ebenezer");
		assertFalse(gadans.isEmpty());
		assertEquals(4,gadans.size());
		
		Set<String> gadans2 = Set.of("SDF5467","HRK8796");
		assertFalse(gadans2.isEmpty());
		
		Map<String, Integer> gadans3 = Map.of("Ayomiposi",80 , "Ifeoluwa", 90);
		Set<String> marksKeys = gadans3.keySet();
	}
	@Test
	void test3() {
		Set<String> firstnames = new HashSet<String>() ;
		//Scanner input = new Scanner(System.in);
		//System.out.println("Enter");
			boolean firstName = firstnames.add("Ifeoluwa");
			assertTrue(firstName);
			firstName = firstnames.add("Ayomiposi");
			assertTrue(firstName);
			firstName = firstnames.add("Ifeoluwa");
			
			Iterator<String> iterator = firstnames.iterator();
			
			while(iterator.hasNext()) {
				if(firstnames.contains(iterator.next())) {
					iterator.remove();
					System.out.println(firstnames);
				}
			
			
		}
		
	}

}
