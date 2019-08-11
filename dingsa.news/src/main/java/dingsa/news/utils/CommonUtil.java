package dingsa.news.utils;

import java.util.regex.Pattern;

public class CommonUtil {
	public static boolean isNumber(String src,String regex){
		return Pattern.compile(regex).matcher(src).matches();
	}
	
	public static void main(String[] args) {
		String number = "123";
		System.out.println(isNumber(number, "\\d+"));
	}
}
