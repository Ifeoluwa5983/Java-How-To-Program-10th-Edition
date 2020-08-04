import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.carbon.Bicycle;
import com.carbon.Building;
import com.carbon.Car;
import com.carbon.CarbonFootPrint;

class CarbonFootPrintTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void test() {
		CarbonFootPrint car = new Car("Toyota","Yellow",2003,56.6,45.3);
		CarbonFootPrint bicycle = new Bicycle("Yellow",6,"Toyota",56.6,45.3);
		CarbonFootPrint building = new Building("Toyota","Yellow",20,54);
		ArrayList<CarbonFootPrint> array = new ArrayList<>();
		array.add(car);
		array.add(bicycle);
		array.add(building);
		
		for (CarbonFootPrint items : array) {
			System.out.printf("%s %n %f", items.toString(),items.getCarbonFootPrint());
		}
//			

		}

}
