import java.util.Scanner;

public class Pir2 {

	public static void main(String args[]) {
		int r;
		double Pi=3.14;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 'r' value:");
		r = sc.nextInt();
		double result = Pi*r*r;
		System.out.println(result);
	}
}
