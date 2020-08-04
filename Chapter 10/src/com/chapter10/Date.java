package com.chapter10;

public class Date  {
	
	private int birthday;
	private int birthMonth;
	private int birthyear;
	private static final int[] daysPerMonth = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };		 
	
	public Date(int birthyear,int birthmonth,int birthday) {
		if (birthday <= 0 ||birthday > daysPerMonth[birthmonth] && !(birthmonth == 2 && birthday == 29)) 
			throw new IllegalArgumentException("day (" + birthday + 
					") out-of-range for the specified month and year");
	    if (birthmonth <= 0 || birthmonth > 12) 
	    	throw new IllegalArgumentException(
	    			"month (" + birthmonth + ") must be 1-12");
	    if (birthmonth == 2 && birthday == 29 && !(birthyear % 400 == 0 || 
	    		(birthyear % 4 == 0 && birthyear % 100 != 0)))
	    		throw new IllegalArgumentException("day (" + birthday + 
	    		") out-of-range for the specified month and year");
	    
	    this.birthday = birthday;
	    this.birthMonth = birthmonth;
	    this.birthyear = birthyear;

	}
	
	public int getBirthday() {
		return birthday;
	}

	public void setBirthday(int birthday) {
		this.birthday = birthday;
	}

	public int getBirthMonth() {
		return birthMonth;
	}

	public void setBirthMonth(int birthMonth) {
		this.birthMonth = birthMonth;
	}

	public int getBirthyear() {
		return birthyear;
	}

	public void setBirthyear(int birthyear) {
		this.birthyear = birthyear;
	}

	public String toString() { 
	return String.format("%d/%d/%d", birthMonth, birthday, birthyear); 
	}

}
