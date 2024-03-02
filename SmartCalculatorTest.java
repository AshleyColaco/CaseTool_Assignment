

package pack_SmartCalculator;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class SmartCalculatorTest 
{ 
	
	
	public static SmartCalculator TestAll;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		TestAll = new SmartCalculator();
		System.out.println("BeforeClass TestAll="+TestAll);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		TestAll = null;
		System.out.println("AfterClass TestAll="+TestAll);
	}

	@Test
	public void testCalculateSimpleInterest() {
		TestAll.setPrincipal(1000);
		TestAll.setRate(5);
		TestAll.setTime(2);
		assertEquals(100.0, TestAll.calculateSimpleInterest(), 0.001);
	}

	@Test
	public void testCalculateCompoundInterest() {
		TestAll.setPrincipal(1000);
		TestAll.setRate(5);
		TestAll.setTime(2);
		assertEquals(102.5, TestAll.calculateCompoundInterest(), 0.001);
	}

	@Test
	public void testCalculateMean() {
		TestAll.setNumbers(new int[]{10, 20, 30});
		assertEquals(20.0, TestAll.calculateMean(), 0.001);
	}

	@Test
	public void testCalculateFactorial() {
		assertEquals(120, TestAll.calculateFactorial(5), 0.001);
	}

	@Test
	public void testCalculatePercentage() {
		TestAll.setMarksObtained(75);
		TestAll.setTotalMarks(100);
		assertEquals(75.0, TestAll.calculatePercentage(), 0.001);
	}

}
