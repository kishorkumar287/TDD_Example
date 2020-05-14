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

}
