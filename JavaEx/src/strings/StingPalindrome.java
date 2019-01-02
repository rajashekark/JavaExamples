package strings;

import java.util.Scanner;

public class StingPalindrome {
	public static void main(String args[]) {
		String reverse = "";
		String temp ;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String:");
		String string = s.nextLine();
		temp = string;
		System.out.println("Temporary string:"+temp);
		for(int i=string.length()-1;i>=0;i--) {
			reverse = reverse+ string.charAt(i);
		}
		System.out.println("reverse string:"+reverse);
		//System.out.println("Temporary string:"+temp);

		if(reverse.equals(temp)) {
			System.out.println("Entered String is a Palindrome:" + temp);
		}
		else {
			System.out.println("Entered String is not a Palindrome");
		}
	}

}
