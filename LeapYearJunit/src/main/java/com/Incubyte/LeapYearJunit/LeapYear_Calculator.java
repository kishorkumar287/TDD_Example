package com.Incubyte.LeapYearJunit;

public class LeapYear_Calculator {
	
	
	public boolean firstCriteria(int date)
	{
		if(date % 400 == 0)
			return true;
		
		return false;
	}

}
