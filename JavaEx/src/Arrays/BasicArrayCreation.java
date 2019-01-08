package Arrays;

public class BasicArrayCreation {
	@SuppressWarnings("null")
	public static void main(String args[]) {
		// creating array
		int[] array;// array declaration
		array = new int[2];// array instantiation or allocating memory to array

		float array2[] = new float[3]; // declaring and instantiating/assigning memory

		double array3[] = new double[2];

		// array[0] = 1;//initialization
		array[1] = 2;
		System.out.println(array[0] + " " + array[1]);
		System.out.println(array3[0]);
		System.out.println(array3[1]);
		System.out.println(array2[0]);
		// System.out.println(array3[2]);//Arrayindexoutofbound exception

		/*
		 * Below are the default assigned values.
		 * 
		 * boolean : false int : 0 double : 0.0 
		 * String : null User Defined Type : null
		 */

	}

}
