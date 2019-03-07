package Exceptions;

public class NestedTryCAtch {
	
	public static void main(String args[]) {
		try {
			
			try {
				int a = 19/0;
				
			}catch(ArithmeticException e) {
				e.printStackTrace();
			}
			System.out.println("Inside first try block");
		}catch(Exception e) {
		   e.printStackTrace();
		}
		System.out.println("normal flow");
	}

}
