package strings;

import java.util.Arrays;

public class SplitAndReplace {

	public static void main(String args[]) {
		String str = "Hello,How,are you,doing?";
//		String[] str2 = str.split(",");
//		//System.out.println(str2.length);
//		for(int i=0;i<str2.length;i++) {
//		System.out.println("After splitting:"+ str2[i]);
//		}
		
		String str3 = str;
		System.out.println(str3.replace(",", ":"));
	}
}
