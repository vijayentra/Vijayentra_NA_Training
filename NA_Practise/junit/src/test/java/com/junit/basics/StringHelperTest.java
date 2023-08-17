package com.junit.basics;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringHelperTest {
	
	StringHelper s = new StringHelper();
	@Test
	public void TruncateAtest() {
		assertEquals("D",s.truncateAInFirst2Positions("AD"));
	}
	
	@Test
	public void Truncate2Atest() {
		assertEquals("VD",s.truncateAInFirst2Positions("AAVD"));
	}
}
