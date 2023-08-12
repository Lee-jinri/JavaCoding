package 예외2;

public class StringTest {

	public static void main(String[] args) {
		String str1 = "Java";
		String str2 = "Java";
		
		if(str1 == str2) {
			System.out.println("동일 객체");
		}else {
			System.out.println("서로 다른 객체");
		}
		
		// 기본적으로 == 연산자와 동일한 결과 리턴 (주솟값 비교)
		String strData1 = new String("Java");
		String strData2 = new String("Java");

		if(strData1 == strData2) {
			System.out.println("동일 객체");
		}else {
			System.out.println("서로 다른 객체");
		}  // ==는 주소값을 비교하기때문에 다른 객체라고 나옴
		
		// 논리적 동등이란? 같은 객체이건 다른 객체이건 상관없이 객체 저장 데이터 동일
		// equals() 메서드를 사용한다.
		if(strData1.equals(strData2)) {
			System.out.println("동일 객체");
		}else {
			System.out.println("서로 다른 객체");
		} // equals는 값이 동일한지를 보기때문에 동일 객체
		
	}

}
