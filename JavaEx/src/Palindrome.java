import java.util.Scanner;

/* 
 * 1.enter the number to check 
 * 2.assign the number to temporary number
 * 3.reverse the number
 * 4.check if temporary number and reverse number are same
 * 5.if they are same print number is a palindrome else not
 */
 
public class Palindrome {
	public static void main(String args[])
	{
		int result=0, rem = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number to check for Palindrome:");
		int num = s.nextInt();
		int tmp2;
		int tmp = tmp2 = num;
		
		while(num>0)
		{
			rem = num%10;
		    num = tmp/10;
		    tmp = num;
		    
			result = rem+result*10;
		}
		//System.out.println(result);
		
		if(tmp2 == result)
		{
			System.out.println("the entered number is a Palindrome:"+ result);
		}
		else
		{
			System.out.println("the entered number is not a Palindrome:"+ result);
		}
	}
	

}
