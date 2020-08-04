import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.chapter10.BaseCommissionEmployee;
import com.chapter10.CommissionEmployee;
import com.chapter10.Date;
import com.chapter10.HourlyBasedEmployee;
import com.chapter10.Payable;
import com.chapter10.SalariedEmployee;

class PayableTest {
	Date date;
	

	@BeforeEach
	void setUp() throws Exception {
		
	}

	@Test
	void test() {
		Date birthdate = new Date(2009,5,13);
		Payable[] payable = new Payable[4];
		Payable pay = new HourlyBasedEmployee("Ife","Femi",1234,7.6,3,birthdate);
		Payable pay2 = new CommissionEmployee(0.4,4,"Ife","Femi",7654,birthdate);
		Payable pay3 = new SalariedEmployee("Ife","Femi",7654,6,birthdate);
		Payable pay4 = new BaseCommissionEmployee(4,0.4,7,"Ife","Femi",7654,birthdate);
		
		for(Payable paya : payable) {
//			System.out.printf("%s %n %f", paya.toString(),paya.getPayment());
			if(paya ==  pay4) {
				double baseSalary = pay4.getPayment() * 0.10;
				System.out.printf("%s %n %f", paya.toString(),baseSalary);
			}
			else {
//				System.out.printf("%s %n %f", paya.toString(),paya.getPayment());
				System.out.println(paya.toString());
				System.out.println(paya.getPayment());
			}
		}
	}
	@Test
	void test2() {
		Date birthdate = new Date(2009,5,13);
		Payable SalariedEmployee = new SalariedEmployee("Ife","Femi",7654,6,birthdate);
		Payable Invoice = new SalariedEmployee("Ife","Femi",7654,6,birthdate);
	}

}
