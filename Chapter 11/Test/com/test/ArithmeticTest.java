package com.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.ExceptionPractice.Arithmetic;
import com.ExceptionPractice.ExceptionA;
import com.ExceptionPractice.ExceptionB;
import com.ExceptionPractice.ExceptionC;
import com.ExceptionPractice.JustAClass;

class ArithmeticTest {
	Arithmetic math;
	JustAClass aclass;

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void test() throws Exception {
	        aclass = new JustAClass();
	        try {
	        	aclass.calculate();
	        }catch(ExceptionA e) {
	        	
	        }
	}
	
	 @Test
	  void defineExceptions() throws Exception{
		 JustAClass practice = new JustAClass();
	     Exception ex1 = new ExceptionA();
	     Exception ex2 = new ExceptionB();
	     try{
	         practice.calculate();
	        }

	       catch(ExceptionC e){

	       }catch(ExceptionB e){

	       }catch(ExceptionA e){

	        }
	    }

	   @Test
	    void constructorException() {
	        try {
	            Arithmetic someClass = new Arithmetic(0, 4);
	        } catch (Exception exception) {
	            System.out.println("Oops");
	        }
	    }
	

}
