import java.util.Scanner;

public class Factorial {
	public static void main(String args[]) {
		int fact = 1, i;
		Scanner s = new Scanner(System.in);
		System.out.println("Find factorial for a entered number");
		System.out.println("Enter the number:");
		int num = s.nextInt();
		for(i=1; i<=num;i++) {
			fact = fact*i;
		}
		
		System.out.println(fact);
	}

}
