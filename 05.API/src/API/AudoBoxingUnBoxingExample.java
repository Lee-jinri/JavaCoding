package API;

public class AudoBoxingUnBoxingExample {

	public static void main(String[] args) {
		//여기부터
		// 자동 Boxing
		Integer obj = 100;
		// Integer obj = Integer.valueOf(100); 클래스명 참조변수 = new 생성자() 또는 클래스명 참조변수 = 클래스명.정적메서드()
		System.out.println("value: " +obj.intValue());
		
		// 대입시 자동 Unoxing
		int value = obj;
		// int value = obj.intValue(); // 이부분이 실행되어서 값이 대입
		System.out.println("value : " +value);
		// 여기까지
		
		// 연산시 자동 Unboxing
		int result = obj + 100;
		// int result = obj.intValue()+100;
		System.out.println("result : " + result);
		
		Double dValue = 5.7;
		// Double dValue = Double.valueOf(5.7)
		System.out.println(dValue + 6.7);
		// dValue.doubleValue() + 6.7;
		// "10" + "20"
		int n = Integer.parseInt("10");		// 문자열을 기초형으로 변환
		System.out.println("n : " + n);
		
		String m = String.valueOf(9);		// 기초형을 문자열로 변환
		System.out.println("m : " + m);
		
		// 문자열 실수값 -> 실수값으로
		double d = Double.parseDouble("8.9");
		System.out.println("d : " + d);
		
		// 실수값 - > 문자열 실수값으로
		String d1 = String.valueOf(4.8);
		System.out.println("d1 : " + d1);
		
		Integer obj1 = Integer.valueOf("4");
		System.out.println(obj1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
