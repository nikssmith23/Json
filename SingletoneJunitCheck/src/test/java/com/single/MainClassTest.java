package com.single;

import static org.junit.Assert.assertEquals;
import org.junit.*;

public class MainClassTest {
	MainClass testObj = new MainClass();

	SingletonObject a=SingletonObject.createInstance();
	SingletonObject a1=SingletonObject.createInstance();
	
	
	
	@Test
	public void checkObjectTest() {
		
		assertEquals(true, testObj.checkObject(a, a1));

	}

}
