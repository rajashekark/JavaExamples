import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String args[]) {
		int num1 = 0, num2 = 1, num3, count, i;
		System.out.println("Enter number of elements to display");
		Scanner s = new Scanner(System.in);
		count = s.nextInt(); 
		System.out.println("Fibonacci series:");
		System.out.println(num1 + " " + num2);
		for(i=2; i<count; i++) {
			num3=num1+num2;
			num1=num2;
			num2=num3;
			System.out.println(num3);
		}
	}

}
