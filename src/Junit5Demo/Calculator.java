package Junit5Demo;
public class Calculator {
	
	public static int Add(int n1, int n2) {
		return n1+n2;
	}
	
	public static int Subtract(int n1, int n2) {
		return n1-n2;
	}
	
	public static int Multiply(int n1, int n2) {
		return n1*n2;
	}
	
	public static int Divide(int n1, int n2) {
		
		if(n2==0)
			throw new ArithmeticException();
		return n1/n2;
	}

}
