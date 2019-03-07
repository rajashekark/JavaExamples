package Exceptions;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class CheckedException {
	
	public static void main(String args[]) {
		
		PrintWriter pw;
		try {
			pw = new PrintWriter("ex.txt");
			pw.println("saved");
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}finally {
			System.out.println("I will execute any way");
		}
		System.out.println("normal flow");
	}

}
