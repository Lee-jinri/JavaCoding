package 실습1;

public class StrCon {
	
	public void strMethod(){
		String str1 = "무궁화 꽃이 피었습니다.";   // 리터럴 방식
		String str2 = new String("무궁화 꽃이 피었습니다."); // new 연산자 활용
		String str3 = new String("동해물과 백두산이");      // new 연산자 활용
		String str4 = "무궁화 꽃이 피었습니다.";   // 리터럴 2
		
		System.out.println("=======hashCode 비교========"); 
		// HashCode는 같은 문자열이면 동일한 값이 나오도록 오버라이딩 되어있음. (String에서는 주소값이 아니다)
		System.out.println("str1 : " + str1.hashCode());
		System.out.println("str2 : " + str2.hashCode());
		System.out.println("str3 : " + str3.hashCode());
		
		System.out.println("=======identityHashCode 비교==========="); // 주소값 비교
		System.out.println("str1 : " + System.identityHashCode(str1));
		System.out.println("str2 : " + System.identityHashCode(str2));
		System.out.println("str3 : " + System.identityHashCode(str3));
		System.out.println("str4 : " + System.identityHashCode(str4)); // 리터럴 방식은 같은 문자면 주소값이 같음. 
		// 같은 문자열이 또 생성되면 주소를 또   생성하지 않는 것.
	}
}
