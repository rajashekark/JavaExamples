package strings;

public class TextString {
	public static void main(String args[]) {
	String str = "Hello, how, are you, doing?";
	System.out.println(str.replaceFirst("," , "."));
	System.out.println(str.replace(",", "."));
	
	int pos= 5;
	char rep = '.';
	
	int pos1=10;
	char rep1 =':';
	
	int pos2=19;
	char rep2 =';';
	
	 String res = str.substring(0, pos) + rep + str.substring(6, pos1)+ rep1+ str.substring(11, pos2)+rep2+str.substring(pos2+1);
	 System.out.println("String after replacing a character: "+res);
		
	
	}

}
