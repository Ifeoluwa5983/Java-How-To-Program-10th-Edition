package com.ExceptionPractice;

import java.io.IOException;

public class Arithmetic {
	 private static int firstNumber;
	 private int secondNumber;
	 
	 public Arithmetic(int firstNumber,int secondNumber) throws ExceptionA{
		 if(firstNumber <= 0  )
			 throw new IllegalArgumentException(
					 "Number must be greater than 0");
		 if(secondNumber <= 0 )
			 throw new IllegalArgumentException(
					 "Number must be greater than 0");

		 this.firstNumber = firstNumber;
		 this.secondNumber = secondNumber;
	 }
	 
	 public int getFirstNumber() {
		return firstNumber;
	}

	public void setFirstNumber(int firstNumber) {
		this.firstNumber = firstNumber;
	}
	public int getSecondNumber() {
		return secondNumber;
	}

	public void setSecondNumber(int secondNumber) {
		this.secondNumber = secondNumber;
	}

	public int calculate() {
		 return firstNumber * secondNumber;
	 }
	public static void someMethod()throws Exception{
	       try{
	            someMethod2();
	        }catch(Exception exception){
	            throw new Exception("Exception thrown in method1", exception);
	        }
	    }

	 public  static void someMethod2() throws Exception{
	      if (firstNumber <= 0){
	            throw new IllegalArgumentException("Number must be > 0");
	        }
	    }
	 
	 public void classException() throws Exception{
	        double division = firstNumber / secondNumber;
	        if(firstNumber < 0){
	            throw new Exception("ExceptionA caught.    Numerator should be greater than or equal to 1");
	        }
	        if(secondNumber < firstNumber){
	            throw new Exception("ExceptionB caught.    Denominator cannot be less than numerator");
	        }
	        if (firstNumber > 200){
	            throw new NullPointerException("NullPointerException caught.  Number must be > 20");
	        }
	        if(secondNumber > 100){
	            throw new IOException("IO exception caught");
	        }
	    }


	    //11.20
	 public static void main(String... args){
	        firstNumber = 0;
	        try{
	            someMethod();
	        }catch(Exception exception){
	            exception.printStackTrace();
	        }

	    }
	 
}
