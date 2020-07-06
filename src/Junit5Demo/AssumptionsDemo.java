package Junit5Demo;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assumptions.*;
import static org.junit.jupiter.api.Assertions.*;
class AssumptionsDemo {

    private final Calculator calculator = new Calculator();

    @Test
    void testOnlyOnCiServer() {
    	System.out.println("Get Environment ENV value = " + System.getenv("ENV"));
        assumeTrue("CI".equals(System.getenv("ENV")));
        // remainder of test
    }

    @Test
    void testOnlyOnDeveloperWorkstation() {
    	System.out.println("Get Environment ENV value = " + System.getenv("ENV"));
        assumeTrue("DEV".equals(System.getenv("ENV")),
            () -> "Aborting test: not on developer workstation");
        // remainder of test
    }

    @Test
    void testInAllEnvironments() {
    	System.out.println("Get Environment ENV value = " + System.getenv("ENV"));
        assumingThat("CI".equals(System.getenv("ENV")),
            () -> {
                // perform these assertions only on the CI server
                assertEquals(2, Calculator.Divide(4, 2));
            });

        // perform these assertions in all environments
        assertEquals(42, Calculator.Multiply(6, 7));
    }

}