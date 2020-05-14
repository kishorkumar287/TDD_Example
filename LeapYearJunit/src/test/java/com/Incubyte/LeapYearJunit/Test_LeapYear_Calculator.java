package com.Incubyte.LeapYearJunit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import junit.framework.TestCase;

public class Test_LeapYear_Calculator  {
	
	LeapYear_Calculator cal = new LeapYear_Calculator();
	
	@Test
	public void testFirstCriteria()
	{
		assertEquals("first criteria : Divisible by 400", true, cal.firstCriteria(400) );
	}
	
	@Test
	public void testSecondCriteria()
	{
		assertEquals("second criteria : Divisible by 100 but not by 400 are NOT leap years", true, cal.secondCriteria(400) );
	}
	
	@Test
	public void testThirdCriteria()
	{
		assertEquals("third criteria :  divisible by 4 but not by 100 ARE leap years", true, cal.thirdCriteria(2020) );
	}

}
