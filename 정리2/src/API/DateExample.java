package API;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {
	public static void main(String[] args) {
		
		Date date = new Date();
		
		SimpleDateFormat a = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");
		String str = a.format(date);
		System.out.println(str);




	}
}
