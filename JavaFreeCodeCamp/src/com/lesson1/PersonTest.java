package com.lesson1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PersonTest {
	
	public PersonTest() {
		
	}

@Test
public void shouldReturnHelloWorld() {
	
	Person syed = new Person();
	assertEquals("Hello World", syed.helloWorld()); 
}
	
}
