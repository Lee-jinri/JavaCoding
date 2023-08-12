package Example;

public class Run {

	public static void main(String[] args) {
		StringController sc = new StringController(); 
		
			// 1. String으로 생성하기
//			sc.strMethod1();
			
			// 2. String 관련 대표적 메소드들
//			sc.strMethod2();

			// 3. StringBuilder로 생성하기
//			sc.sbMethod();
			
			// 4. StringBuilder의 주소값, 메소드 확인하기
//			sc.sbMethod1();
			
			// 5. StringTokenizer
//			sc.stMethod();
			
		Phone p1 = new Phone("KH Note 9", 800);
		Phone p2 = new Phone("KH hal 10", 600);
		Phone p3 = new Phone("KH Note 9", 800);
		
		// 6. equals, hashCode
		
//		System.out.println(p1.equals(p2));
//		System.out.println(p1.equals(p3)); 
		// equals로 값을 기준으로 비교를 하고 싶다면 equals 메소드를 오버라이딩해서 사용해야한다.
		
		// 주소 비교
//		System.out.println(System.identityHashCode(p1)); // 1392838282
//		System.out.println(System.identityHashCode(p3)); // 523429237 
		
		// hashCode 메소드를 값이 같으면 해시코드가 같도록 오버라이딩 한 후
//		System.out.println(p1.hashCode()); // 587860179
//		System.out.println(p3.hashCode()); // 587860179

		// toString : 그냥 p1이라고 써도 toString이 자동으로 반환됨
//		System.out.println(p1.toString());
//		System.out.println(p1);
//		System.out.println(p2);
//		System.out.println(p3);
		
		// clone()
//		System.out.println("==============clone==============");
//		p2 = p1.clone();        // p2는 p1의 객체를 new생성자를 통해 새로 생성한 객체가 됨.
//		System.out.println(p1);
//		System.out.println(p2); // p1과 p2가 같은 값의 객체를 갖게됨.

	
		WrapperController wc = new WrapperController();
		// 1. Boxing, UnBoxing
//		wc.wrapMethod();
		
		// 2. String -> 기본자료형(숫자, Primitive Number)
		wc.strToPrim();
		
		// 3. 기본자료형(숫자, Primitive Number) -> String
		wc.PrimToStr();
		
	
	
	
	
	
	
	
	
	
	}

}
