package Junit5Demo;
/*import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTimeout;
import static org.junit.jupiter.api.Assertions.assertTrue;

*/
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Ignore;
//import org.junit.jupiter.api.Test;
import org.junit.Test;
//@Disabled("Skip Executing Assertions")
//@DisplayName("Testing Assertions in Junit5")
//@Ignore("This is disabled until Bug99 is fixed")
public class DisabledTests_Assertions_JUnit4 {
	Person person = new Person("John","Doe");
	//@Disabled("This is disabled until Bug99 is fixed")
	//@DisplayName("Testing Standard Assertions")
	@Ignore("This is disabled until Bug99 is fixed")
	@Test	
	public void standardAssertion() {
		assertEquals(4,Calculator.Add(2, 2));	
		assertTrue(4==Calculator.Add(2, 2));
		//this will pass
		assertFalse("Expected Result matches with Actual Result",5==Calculator.Add(2, 2));
		//this will fail
		assertTrue("Expected Result does not match with Actual Result",4==Calculator.Add(2, 2));
		
	}
/*	//@Disabled("This is disabled until standard Assertion issue is fixed")
	@Test
	@DisplayName("Testing Group Assertions")
	public void groupAssertions() {
		assertAll("person",
			() -> assertEquals("John",person.getFirstName()),
			() -> assertEquals("Doe",person.getLastName())
	);
	}
	
	@Test
	public void dependentAssertions() {
		assertAll("properties",
			() ->
			{
				String firstName =person.getFirstName();
				assertNotNull(firstName);
				
				assertAll("firstname",
					() -> assertTrue("John".startsWith("J")),
					() -> assertTrue("John".endsWith("n"))
						);
			},
			
			() ->
			{
				String lastName = person.getLastName();
				assertNotNull(lastName);
				
				assertAll("lastname",
					() -> assertTrue("Doe".startsWith("D")),
					() -> assertTrue("Doe".endsWith("e"))
						);
			}
				
	);
	}

	@Test
	public void ExceptionAssertionTest() {
		Exception exception = assertThrows(ArithmeticException.class,
				  () -> Calculator.Divide(10, 0));
		assertEquals("/ by zero",exception.getMessage());
	}

		
	@Test
	public void timeoutException() {
		String message = assertTimeout(ofMinutes(2),
				() -> {return "Test Result";});
		assertEquals("Test Result",message);
				
	}
	
*/	
}


