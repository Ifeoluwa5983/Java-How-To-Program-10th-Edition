import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.chapter10.Date;
import com.chapter10.Employee;
import com.chapter10.Payable;
import com.chapter10.PieceWorker;
import com.chapter10.SalariedEmployee;

class EmployeeTest {
	PieceWorker picwork;
	Date date;
	@BeforeEach
	void setUp() throws Exception {
		
	}

	@Test
	void test() {
		picwork = new PieceWorker(12, 2);
		Employee p1 = new PieceWorker(10,3);
		Employee p2 = new PieceWorker(8,2);
		Employee[] employees = new Employee[5];
		
		employees[0] = picwork;
		employees[1] = p1;
		employees[2] = p2;
		
		
		for (int i = 0; i < employees.length; i++) {
			System.out.println(employees[i].getPayment());
		}
	}
	@Test
	void dateTest() {
	}

}
