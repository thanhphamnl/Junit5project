package Junit5Demo;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;
public class ParameterizedTests {
	
	@ParameterizedTest
	@ValueSource(ints = { 1, 2, 3,4,5 })
	void testWithValueSource(int argument) {
	    assertTrue(argument > 0 && argument < 4);
	}

	
	@ParameterizedTest
	@ValueSource(ints= {1,2,3})
	public void testWithValueSource1(int i) {
		System.out.println("Value of i = " + i);
	}
	
	@ParameterizedTest
	@ValueSource(strings = {"4","5","6"})
	public void testWithStringSource(String s) {
	int i = Integer.parseInt(s);
	 assertTrue(i>4 && i<6);
		
	}
	
	@ParameterizedTest
	@MethodSource("stringProvider")
	void testWithExplicitLocalMethodSource(String argument) {
	    assertNotNull(argument);
	}

	static Stream<String> stringProvider() {
	    return Stream.of("apple", "banana");
	}
	
	@ParameterizedTest
	@CsvSource({
	    "apple,         1",
	    "banana,        2",
	    "'lemon, lime', 0xF1"
	})
	void testWithCsvSource(String fruit, int rank) {
	    assertNotNull(fruit);
	    assertNotEquals(0, rank);
	}
}
