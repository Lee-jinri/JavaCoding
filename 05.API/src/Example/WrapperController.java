package Example;

public class WrapperController {

	public void wrapMethod() {
		// 1. Boxing (기본자료형 -> Class), UnBoxing (Class -> 기본자료형)
		// 추상클래스 Number를 상속받는다
		Number num = new Integer(10); 
		
		Integer i1 = 1; // 리터럴 (autoBoxing) : int형이 Integer클래스로 형변환하지 않았는데도 변환됨.
		Integer i2 = new Integer(1); // 생성자의 매개변수를 통해 변환
		Double i3 = new Double(10);
		
		System.out.println(i1.equals(i2)); // true
		System.out.println(i1.compareTo(i2)); // 0 : 같은 값이면 0, i1이 크면 1, i2가 크면 -1이 나옴
		
		// autoUnBoxing
		int in = new Integer(1); // Integer 객체로 만들어진 1을 int in에 형변환 하지 않아도 대입할 수 있음

	}

	public void strToPrim() {
		
		// parse를 사용해서 String을 기본자료형으로 바꿈
//		byte b = Byte.parseByte("1");
//		short s = Short.parseShort("2");
//		int i = Integer.parseInt("3");
//		long l = Long.parseLong("4");
//		float f = Float.parseFloat("0.1");
//		double d = Double.parseDouble("0.2");
//		boolean b1 = Boolean.parseBoolean("true"); // 문자열이 true일 때만 true, true가 아닐때는 false
//		System.out.println(b1);
		
		// java 1.5 버전 이후부터는 valueOf 사용 가능 / 이게 더 편함
		byte b = Byte.valueOf("1");
		short s = Short.valueOf("2");
		int i = Integer.valueOf("3");
		long l = Long.valueOf("4");
		float f = Float.valueOf("0.1");
		double d = Double.valueOf("0.2");
		boolean b1 = Boolean.valueOf("7");
		
		// char는 다름
		char c = "abc".charAt(1); // 1번 인덱스만 char c로 바꿈
	
	}

	public void PrimToStr() {
		String b = Byte.valueOf((byte)1).toString();  // downCastin을 해주지 않으면 int형으로 인식
		String s = Short.valueOf((short)2).toString();// downCastin을 해주지 않으면 int형으로 인식
		String i = Integer.valueOf(3).toString();
		String l = Long.valueOf(4L).toString();    // long형으로 바꿀 때는 L붙여야함
		String f = Float.valueOf(0.1f).toString(); // float형으로 바꿀 때는 f붙여야함. f 안붙이면 double형인줄 앎
		String d = Double.valueOf(0.2).toString();
		String b1 = Boolean.valueOf(true).toString();
		String c = Character.valueOf('a').toString();
		
	}

}
