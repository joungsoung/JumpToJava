package Date;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class GetDate2 {

	public static void main(String[] args) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.KOREA);
		Date d = new Date();
		String date = dateFormat.format(d);
		
		SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss", Locale.KOREA);
		Date t = new Date();
		String time = timeFormat.format(t);
		
		System.out.println(date + " " + time);
		
	}
}
