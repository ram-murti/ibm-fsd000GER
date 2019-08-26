package UnitT;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import junit.framework.TestCase;
import junit.framework.TestSuite;

@RunWith(Suite.class)
@SuiteClasses({ CalculatorTest.class })
public class AllTests extends TestCase{

	public AllTests() {
		TestSuite testsuite=new TestSuite("AllTests");
	
	}
	public static void main(String[] args) {
		junit.textui.TestRunner.run(new AllTests());
	}
}
