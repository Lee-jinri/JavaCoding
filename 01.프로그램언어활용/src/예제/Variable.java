package 예제;

import java.util.Scanner;

public class Variable {
	public static void main(String[] args) {
		
		// 주석문
		/* 여러줄 주석
		 * 
		 * 
		 */
		
		String dkanrjteh = null; // string에 아무 값도 넣지 않겠다.
		
		var price = 10000;   //=> 자동으로 int
		var name = "홍길동";  //=> 자동으로 string
		
		// 변수 2개를 선언하여 각각 변수에 값을 초기화한 두 수를 교환한 값을 출력하는 프로그램을 작성하자
		
		// 변수 선언 : 자료형 변수명 = 값;
		int number1, number2, temp;
		// 값 저장 : 변수명 = 값;
		number1 = 1;
		number2 = 2;
		
		System.out.println("교환 전 number1 : " + number1);
		System.out.println("교환 전 number2 : " + number2);
		
		// 값 교환 : 새로운 변수에 값을 넣어 number1에 대입한 값이 사라지지 않게 함.
		temp = number1;   
		number1 = number2;
		number2 = temp;
		
		System.out.println("교환 후 number1 : " + number1);
		System.out.println("교환 후 number2 : " + number2);
		
		
		// boolean 자료형
		
		boolean b = true;
		System.out.println("b : " + b);
		b = ( 1 > 2 );
		System.out.println("b : " + b);
	
		// char 자료형
		char c1 = 'A'; 		// 문자를 직접 저장 (대문자 A는 97)
		char c2 = 65;  		// 십진수로 저장
		char c3 = '\u0041'; // 16진수로 저장
		
		char c4 = '가'; 		// 문자를 직접 저장
		char c5 = 44032;    // 십진수로 저장
		char c6 = '\uac00'; // 16진수로 저장
		
		int uniCode = c1;   // 유니코드 얻기
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6);
		System.out.println(uniCode);
		
		// 정수형
		
		byte age;		 // 1byte
		short point;	 // 2byte
		int price2;		 // 4byte
		long totalSales; //8byte
		
		age = 23;
		point = 32000;
		price2 = 3500000;
		totalSales = 21474832165l; // L붙이기
		
		System.out.println(age);
		System.out.println(point);
		System.out.println(price2);
		System.out.println(totalSales);
	
		// 실수형
		
		double radius, area, cir;
		final double PI = 3.14;
		radius = 5.0;
		
		area = PI * radius * radius;
		cir = 2 * PI * radius;
		
		System.out.println("원의 면적은 " + area);
		System.out.println("원의 둘레는 " + cir);
		
		// 출력방법 (format) (소수점 2자리로 출력)
		System.out.printf("원의 면적 : %.2f 원의 둘레 : %.2f", area, cir);
		
	}
}
