package SampleDemo.IBMDevops;

import static org.junit.Assert.*;

import org.junit.Test;

public class AppTest1 {

	@Test
	public void testAdd() {
		
		assertEquals(3, App.add(1, 2));
		
	}

}
