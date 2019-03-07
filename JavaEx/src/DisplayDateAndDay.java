import java.text.SimpleDateFormat;
import java.util.Date;

public class DisplayDateAndDay {
	
	public static void main(String args[]) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-EE, MM, YYYY");
		String dateDay = sdf.format(new Date());
		System.out.println("Today is:"+ dateDay);
	}

}
