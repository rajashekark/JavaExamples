import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String args[])
	{
		//int num = 9;
		boolean flag = false;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number to check for PrimeNumber:");
		int num = s.nextInt();
		for(int i=2; i<=num/2; i++)
			{
				if(num%i == 0)
				{
					flag = true;
					break;
				}
			}
		if(!flag)
			System.out.println(num +":is a Prime number");
		else
			System.out.println(num + ": not a prime number");
		}
		
	}


