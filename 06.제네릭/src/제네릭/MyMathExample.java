package 제네릭;
/* 한정된 타입의 매개변수 
 * 타입 매개변수 T를 가지는 클래스 MyMath
 * MyMath에는 평균을 구하는 getAverage()메소드를 추가
 * 평균을 구할 수 있도록 한다.
 */

// 한정된 타입의 제네릭 클래스
class MyMath<T extends Number>{ 
	double v = 0.0;
	public double getAverage(T[] a) {		// 평균 구하는 메소드 
		for (int i = 0; i < a.length; i++)		
			v = v + a[i].doubleValue();
		return v/a.length;
	}
}

//실행클래스
public class MyMathExample {  

	public static void main(String[] args) {
		Integer[] list = { 1, 2, 3, 4, 5, 6 };
		
		MyMath<Integer> m = new MyMath<Integer>(); // m 참조변수 = 공간할당 new 제너릭클래스 정수형 호출합니다~
		System.out.println(m.getAverage(list));	// 평균 구하는 메서드 호출, 리스트는 integer타입~~~

	}

}
