package Junit5Demo;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestAnnotations {
	
	@BeforeAll
	public static void BeforeAllMethods() {
		System.out.println("Executing BeforeAll Method");
	}
	@BeforeEach
	public void BeforeEachMethods() {
		System.out.println("Executing BeforeEach Method");
	}

	@Test
	public void FirstTestMethods() {
		System.out.println("Executing First Test Method");
	}

	@AfterEach
	public void AfterEachMethods() {
		System.out.println("Executing AfterEach Method");
	}


	@Test
	public void SecondTestMethod() {
		System.out.println("Executing Second Test Method");
	}

	

	@AfterAll
	public static void AfterAllMethods() {
		System.out.println("Executing AfterAll Method");
	}



}
