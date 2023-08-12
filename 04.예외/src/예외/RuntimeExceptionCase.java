package 예외;

public class RuntimeExceptionCase {

	public static void main(String[] args) {
		// RuntimeException 종류 - 비체크 예외. (신경쓴다면 예외 발생하지 않을 코드)
		
		// ArrayIndexOutOfBoundsException 예외 발생
		try {
			int[] arr = new int[3]; // 인덱스 3개인데
			arr[4] = 20;			// 인덱스 4개에 값을 넣으려고 해서 예외 발생
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		
		// ClassCastException 예외 발생
		try {
			Object x = Integer.valueOf(0); // 자바에서 상속관계 최상위 Object
					// x = int0을 heap 저장하고 그 주소값을 주세요-> 주소값이 있는 int가 됨
					// 이 메소드는 클래스명.메소드 -> 정적메소드
			// 부모 클래스명 참조변수 = new 서브클래스생성자();
			System.out.println((String) x);  
			// 클래스 형변환 잘못됨 int -> String으로 바꿀 수 없음.
		} catch (ClassCastException e) {
			e.printStackTrace();
		}
		
		// NegativeArraySizeException 예외 발생
		try {
			int[] arr= new int[-10]; // 배열의 크기는 음수값을 가질 수 없다.-> 예외 발생
			System.out.println(arr.toString());
		} catch (NegativeArraySizeException e) {
			e.printStackTrace();
		}
		
		// NullPointerException 예외 발생 - 기억하기
		try {
			String str = null;		  // 아무 것도 참조하지 않게 null값을 줘도 이미 null값을 갖고있음	
			@SuppressWarnings("null") // null값은 체크하지 마라.
			int len = str.length();	  // str의 길이 수를 구하세요 -> 아무 값도 없는데 길이를 구하라고 해서 예외	
			System.out.println(len);
		} catch (NullPointerException e) {
			e.printStackTrace();
		}

		// NumberFormatException 예외 발생
		try {
			String data1 = "100";    // 문자열에 100을 줬어요
			String data2 = "a100";	 // 문자열에 a100을 줬어요
			
			int value1 = Integer.parseInt(data1);   // Integer클래스에 문자를 숫자로 바꿀 수 있는 메소드 parseInt
			int value2 = Integer.parseInt(data2);	// 숫자로 변경이 불가한 문자열 -> a100인데 int로 바꾸려고 해서 예외 
			
			int result = value1 + value2;
			System.out.println(data1 + "+" + data2 + "+" + result);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
	}

}
