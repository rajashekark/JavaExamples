import java.util.Scanner;

public class SimpleInterest {
	
	public static void main(String args[])
	{
		float p,r,t,si;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter p:");
		p = sc.nextFloat();
		System.out.println("Enter r:");
		r = sc.nextFloat();
		System.out.println("Enter t:");
		 t = sc.nextFloat();
		
		si = (p*r*t)/100;
		System.out.println("Simple Interest calculated is:"+ si);


	}

}
