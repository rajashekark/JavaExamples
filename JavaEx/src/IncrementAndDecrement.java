
public class IncrementAndDecrement {
	public static void main(String args[]) {
		int a=15,b,d;
		//b =  (++a)-(++a)*(a++);
		//c=a-- + a++ - a--;
		d=(--a + a++);
		System.out.println(d);

		System.out.println(a);

		float c = d/a++;
		//b= a++;
		//++a;
		//System.out.println(b);
		System.out.println(c);
	}
	

}
