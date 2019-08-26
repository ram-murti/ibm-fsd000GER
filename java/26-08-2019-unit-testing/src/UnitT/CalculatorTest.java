package UnitT;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.TestCase;

public class CalculatorTest extends TestCase {



	@Test
	public void testCompareInt() {
		int x=100;
		int y=25;
		Calculator c=new Calculator(x,y);
		boolean result=c.CompareInt();
	assertEquals(true,result);
	}
	
	@Test
	public void testAdd() {
		int x=10;
		int y=5;
		
		Calculator c=new Calculator(x,y);
		int result=c.Add();
		assertEquals(15,result);
	}
}
