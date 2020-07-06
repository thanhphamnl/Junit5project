package Junit5Demo;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.TestInfo;

public class RepeatedTests {
	
	@RepeatedTest(5)
	public void RepeatedTests() {
		System.out.println("Testing - Repeated Tests");
	}
	
	@RepeatedTest(value=5,name ="{displayName} - {currentRepetition}/{totalRepetitions}")
	public void RepeatedTests1(TestInfo testinfo) {
		System.out.println(testinfo.getDisplayName());
	}

	@RepeatedTest(value=5,name ="{displayName} - {currentRepetition}/{totalRepetitions}")
	public void RepeatedTestDemo(TestInfo testinfo,RepetitionInfo repInfo) {
		System.out.println(testinfo.getDisplayName());
		System.out.println(repInfo.getCurrentRepetition() + "::" + repInfo.getTotalRepetitions());
		
	}
	@RepeatedTest(value = 1, name = RepeatedTest.LONG_DISPLAY_NAME)
	public void LongDisplayName(TestInfo testinfo) {
		System.out.println(testinfo.getDisplayName());
	}

	@RepeatedTest(value = 1, name = RepeatedTest.SHORT_DISPLAY_NAME)
	public void ShortDisplayName(TestInfo testinfo) {
		System.out.println("Executing Short Display Name Repeated Test");
		System.out.println(testinfo.getDisplayName());
	}

}
