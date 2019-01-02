package strings;

import java.util.Scanner;

public class ReverseString {
	public static void main(String args[]) {
		String reverse = "";
		int i;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the string to be reversed");
		String stmt = s.nextLine(); 
		//System.out.println(stmt.length());
		for(i=stmt.length()-1;i>=0;i--) {
			reverse = reverse + stmt.charAt(i);
		}
		System.out.println("reversed String:" + reverse);
		
		//Split the string into words
		
		System.out.println("enter the string:");
		String[] stmt2 = s.nextLine().split(" ");
		System.out.println(stmt2.length);
		for(i=stmt2.length-1;i>=0;i--) {
			System.out.println(stmt2[i]);//in reverse direction
		}
		for(i=0;i<=stmt2.length-1;i++) {
			System.out.println(stmt2[i]);//in forward direction
		}
		
		//reverse the words in their respective positions
		System.out.println("Enter the statment:");
		String stmnt3 = s.nextLine();
		
	}

}
