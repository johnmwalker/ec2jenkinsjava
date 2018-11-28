package com.m3.training.helloworldmsg;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class HelloWorldMessageTest {
	
	static private HelloWorldMessage objectUnderTest;
	
	@BeforeAll
	static void setup() {
		objectUnderTest = new HelloWorldMessage();
	}

	@Test
	void testNewInstance() {
		assertNotNull(objectUnderTest);
	}
	
	@Test
	void testGetMessage() {
		assertNotNull(objectUnderTest.getMessage());
	}
	
	@Test
	void testGetTwoUniqueMessages() {
		
		String firstResult  = objectUnderTest.getMessage();
		String secondResult = objectUnderTest.getMessage();
		String errorMessage = "Object under test could not produce two unique results."
					+ " [" + firstResult  + "] "
					+ " [" + secondResult + "] ";
		assertNotEquals(firstResult, secondResult, errorMessage);
	}

}
