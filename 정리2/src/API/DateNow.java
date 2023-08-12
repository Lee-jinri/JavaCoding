package API;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateNow {
	public static void main(String[] args) {
		
		
		System.out.println("[SimpleDateFormat 날짜 포맷 출력 - 현재 날짜,시간,요일 확인 실시]");
		
		/*[설 명]
		 * 1. System.currentTimeMillis() 사용해서 long 타입 날짜 데이터를 저장합니다
		 * 2. SimpleDateFormat 을 사용해서 출력하고자하는 날짜 및 시간, 요일 형태를 지정할 수 있습니다
		     - yyyy : 연도
		     - MM : 월
		     - dd : 날짜
		     - hh : 시간 (일반)
		     - kk : 시간 (24시 형태)
		     - mm : 분
		     - ss : 초
		     - E : 요일
		 * 3. 메소드를 호출해서 String 문자열 형태 return 데이터 반환값을 받을 수 있습니다.    
		 */
		System.out.println("일반 현재 날짜 및 시간 : "+NowDateTime()); //메소드 호출
		System.out.println("24시 현재 날짜 및 시간 : "+NowDateTime24()); //메소드 호출

	}//메인 종료
	
	//==== [일반 현재 날짜 및 시간 알아오는 메소드] ==== 
	public static String NowDateTime() {
		
		//long 타입으로 System.currentTimeMillis() 데이터를 받아야합니다
		long time = System.currentTimeMillis();
		SimpleDateFormat dayTime = new SimpleDateFormat("yyyy.MM.dd hh:mm:ss E요일");
		String str = dayTime.format(new Date(time));
		return str; //return은 메소드 호출 후 데이터를 반환해줍니다.
	}
	
	//==== [24시 형태 현재 날짜 및 시간 알아오는 메소드] ==== 
	public static String NowDateTime24() {
		//long 타입으로 System.currentTimeMillis() 데이터를 받아야합니다
		long time = System.currentTimeMillis(); 
		SimpleDateFormat dayTime = new SimpleDateFormat("yyyy.MM.dd kk:mm:ss E요일");
		String str = dayTime.format(new Date(time));
		return str; //return은 메소드 호출 후 데이터를 반환해줍니다.
	}

	
	

}
