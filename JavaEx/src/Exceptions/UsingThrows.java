package Exceptions;

import java.io.IOException;

public class UsingThrows {
	
	void method() throws IOException{
		throw new IOException("device error");
	}
	
	public static void main(String args[]) {
		UsingThrows ut = new UsingThrows();
		try {
			ut.method();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("normal flow");
	}

}
