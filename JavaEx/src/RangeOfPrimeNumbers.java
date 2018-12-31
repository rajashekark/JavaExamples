import java.util.Scanner;

public class RangeOfPrimeNumbers {
	public static void main(String args[])
	{
		int s1, s2, s3, flag=0, i, j;
		Scanner s = new  Scanner(System.in);
		System.out.println("Enter starting number:");
	    s1 = s.nextInt();
		System.out.println("Enter ending number:");
		s2 = s.nextInt();
		System.out.println("The prime numbers in between the entered limits are :");
		if(s1==2)
		{
			System.out.println(s1);
		}
		for(i=s1;i<=s2;i++)
		{
			for(j=2; j<i; j++)
			{
				if(i%j==0)
				{
					flag = 0;
					break;
				}
				else
					{
					  flag=1;
					}
			}
			if(flag==1)
			{
				System.out.println(i);
			}
		}
		
	}

}
