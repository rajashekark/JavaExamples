package strings;

import java.util.Scanner;

public class StringToInteger {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String:");
		String string = s.nextLine();
		int result;
		String string2 = "123456";
		result = Integer.parseInt(string);
		System.out.println(result);//converting too primitive int
		int result2 = Integer.valueOf(string2);//returns an new integer object
		System.out.println(result2);
		
		//numberformat exception if string does not contain a parsable integer
		String string3 = "100A";
		System.out.println(Integer.parseInt(string3));
	}

}
