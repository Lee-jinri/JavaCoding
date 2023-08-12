package 제네릭;

public class GenericMethodTest {
	public static <T extends Number, V extends T> boolean isInclude(T num, V[] array) { // 논리형 값을 리턴하는 메서드
			// T 는 넘버클래스(인티저,더블)로 부터 상속받은 서브클래스의 타입, V는 T 또는 T로부터 상속받은 서브클래스
		for (int i = 0; i < array.length; i++) { // 배열이 가진 원소수 보다 작을 동안
			if (array[i] == num) {
				return true;			// 포함합니다.
			}
		}
			return false;				// 포함하지 않습니다.
	}
	
	

	public static void main(String[] args) {
		Integer[] inum = { 1, 2, 3, 4 ,5 };  // 배열 선언
		System.out.println("결과 : " + GenericMethodTest.<Integer, Integer>isInclude(3, inum));
						// 호출할 때 클래스명(유추가능해서 생략) 메소드명.<타입인자, T로부터 상속받은 V의 타입 = int>
						// 3이 inum에 포함되어 있습니까??
		
		boolean b1 = isInclude(3, inum); // 3이 inum에 포함되어 있니? 포함되면 true 아니면 false
		System.out.println("결과 : " + b1);
		
//      false 나옴. 5.0으로 같아보이지만 소수점자리수가 정확하게 일치하지 않아서 실수형 비교할 땐 정수로 비교 아니면 클래스 생성해서 비교
		Double[] dnum = { 1.0, 2.0, 3.0, 4.0, 5.0};  // 실수값으로 다시
		boolean b2 = isInclude(5.0, dnum); // 5.0이 dnum에 포함되니??
		System.out.println("결과 : " + b2);
	
		System.out.println("결과 : " + GenericMethodTest.<Double, Double> isInclude(5.0, dnum));
													//	<  T     ,  V  >	
		
		/* String[] snum = { "one", "two", "three", "four", "five"};
		isInclude("one", snum);      // 이 메서드에 String타입 안됨. Number의 하위클래스들만 가능.
		System.out.println("결과 : " + GenericMethodTest.<String, String>isInclude("one",snum));*/
		
	}
	
	

}
