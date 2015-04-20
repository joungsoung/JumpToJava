package Date;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class GetDate1 {
	
	static String result;
	
	public static void main(String[] args) {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.KOREA);
		Date date = new Date();
		result = format.format(date);
		
		System.out.println(result);
	}
}
