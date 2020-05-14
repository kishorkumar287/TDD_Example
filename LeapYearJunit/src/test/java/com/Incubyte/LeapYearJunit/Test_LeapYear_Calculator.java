package com.Incubyte.LeapYearJunit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import junit.framework.TestCase;

public class Test_LeapYear_Calculator  {
	
	LeapYear_Calculator cal = new LeapYear_Calculator();
	
	@Test
	public void testFirstCriteria()
	{
		assertEquals("first criteria : All years Divisible by 400 ARE leap year", true, cal.firstCriteria(400) );
	}
	
	@Test
	public void testSecondCriteria()
	{
		assertEquals("second criteria : All years Divisible by 100 but not by 400 are NOT leap years", true, cal.secondCriteria(1700) );
	}
	
	@Test
	public void testThirdCriteria()
	{
		assertEquals("third criteria : All years divisible by 4 but not by 100 ARE leap years", true, cal.thirdCriteria(2008) );
	}
	
	@Test
	public void testFourthCriteria()
	{
		assertEquals("fourth criteria : All years not divisible by 4 are NOT leap years", true, cal.fourthCriteria(2017) );
	}

}
