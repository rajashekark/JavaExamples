package Exceptions;

public class FirstTryCatch {
	
	public static void main(String args[]) {
		
		int  num =100,result;
		try {
			
		result = num/0;
			
		}catch(Exception e) {
			//e.printStackTrace();
			 num = num/(0+2);
			System.out.println("Cannot divide by zero");
		}finally {
			System.out.println("I will execute in any case");
		}
		
		System.out.println("Normal flow........");
		System.out.println(num/20);
	}
	

}
