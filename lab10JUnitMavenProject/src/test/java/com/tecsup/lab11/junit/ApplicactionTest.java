package com.tecsup.lab11.junit;

import org.junit.Test;

import junit.framework.Assert;

public class ApplicactionTest {

	@Test
	public void testSuma(){
		Application app = new Application();
		Assert.assertEquals(app.suma(5, 2), 7);
	}
	
	@Test
	public void testResta(){
		Application app = new Application();
		Assert.assertEquals(app.resta(4, 1), 3);
	}
	
	@Test
	public void testMultiplicacion(){
		Application app = new Application();
		Assert.assertEquals(app.multi(5, 1),5);
				
	}
	
	@Test
	public void testDivision(){
		Application app = new Application();
		Assert.assertEquals(app.divi(5, 1), 5);
	}
	
}
