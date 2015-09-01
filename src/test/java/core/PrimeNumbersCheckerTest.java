package core;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.apache.maven.plugins.annotations.Parameter;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class PrimeNumbersCheckerTest {
	private PrimeNumbersChecker pnc;
	
	@Before
	public void initialize(){
		pnc = new PrimeNumbersChecker();
	}
	
	
	@Parameter(name = "0")
		public Integer inputNum;
		
	@Parameter(name = "1")
		public Boolean result;
	
	@Parameters(name = "Step #{index}: Number: {0}; isPrime? {1}")
	public static Collection<Object[]> primeNumbers(){
		Object[][] data = new Object[][]{
			{1, true},
			{2, true},
			{8, false},
			{11, true}
		};
		
		return Arrays.asList(data);
		
	}
	
	@Test
	public void testPrimeNumbersChecker(){
		System.out.println("Is " + inputNum + " a prime number? - " + result);
		assertEquals(result, pnc.checkNumber(inputNum));
	}
}
