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
	}

}
