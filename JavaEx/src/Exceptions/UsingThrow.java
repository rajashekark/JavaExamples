package Exceptions;

public class UsingThrow {
	
	void method(int age) {
		if(age<18) {
			throw new ArithmeticException("NOt eligible for drivers license");
		}
		else {
			System.out.println("Eligible for drivers license");
		}
	}
	
	public static void main(String args[]) {
		
		UsingThrow t = new UsingThrow();
		t.method(12);
		System.out.println("Rest of code");
	}

}
