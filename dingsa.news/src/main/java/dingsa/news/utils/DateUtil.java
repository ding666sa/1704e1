package dingsa.news.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
	public static Date StringToDate(String src){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		try {
			return sdf.parse(src);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		return null;
	}
}
