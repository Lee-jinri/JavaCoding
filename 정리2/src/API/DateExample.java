package API;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {
	public static void main(String[] args) {
		
		Date date = new Date();
		
		SimpleDateFormat a = new SimpleDateFormat("yyyy�� MM�� dd�� HH�� mm�� ss��");
		String str = a.format(date);
		System.out.println(str);




	}
}
