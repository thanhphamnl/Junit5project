package Junit5Demo;

import static java.time.Duration.ofMinutes;
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTimeout;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class Assertions {
	Person person = new Person("John", "Doe");

	@Test
	public void standardAssertion() {
		assertEquals(4, Calculator.Add(2, 2));
		assertTrue(4 == Calculator.Add(2, 2));
		// this will pass
		assertFalse(5 == Calculator.Add(2, 2), "Expected Result matches with Actual Result");
		// this will fail
		assertTrue(4 == Calculator.Add(2, 2), "Expected Result does not match with Actual Result");
	}

	@Test
	public void groupAssertions() {
		assertAll("person", () -> assertEquals("John", person.getFirstName()),
				() -> assertEquals("Doe", person.getLastName()));
	}

	@Test
	public void dependentAssertions() {
		assertAll("properties", () -> {
			String firstName = person.getFirstName();
			assertNotNull(firstName);

			assertAll("firstname", () -> assertTrue("John".startsWith("J")), () -> assertTrue("John".endsWith("n")));
		},

				() -> {
					String lastName = person.getLastName();
					assertNotNull(lastName);

					assertAll("lastname", () -> assertTrue("Doe".startsWith("D")),
							() -> assertTrue("Doe".endsWith("e")));
				}

		);
	}

	public void ExceptionAssertionTest() {
		Exception exception = assertThrows(ArithmeticException.class, () -> Calculator.Divide(10, 0));
		assertEquals("/ by zero", exception.getMessage());
	}

	public void timeoutException() {
		String message = assertTimeout(ofMinutes(2), () -> {
			return "Test Result";
		});
		assertEquals("Test Result", message);

	}
}
