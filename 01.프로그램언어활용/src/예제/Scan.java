package 예제;

import java.util.Scanner;

public class Scan {

	public static void main(String[] args) {
		// Scanner 사용
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("첫번째 숫자를 입력하세요 : ");
		int x = input.nextInt();
		System.out.println("두번째 숫자를 입력하세요 : ");
		int y = input.nextInt();
		
		int sum = x + y;
		
		System.out.println("두 수의 합 : " + x + " + " + y + " = " + sum);
		input.nextLine();   // name2의 line이 엔터를 읽어버려서 한번 더 써줘야됨.
		
//		각자의 이름, 나이, 주소를 입력받아 아래와 같이 출력할 수 있도록 작성해주세요.
	//	
//		[출력문 예시]
//		홍길동님 안녕하세요! 50살이시네요.
//		주소는 서울특별시 강남구 테헤란로 14길 6 남도빌딩 4F
		
		
		System.out.println("이름을 입력하세요 : ");
		String name2 = input.nextLine();
		
		System.out.println("나이를 입력하세요 : ");
		int age2 = input.nextInt();
		input.nextLine();   // adress의 line이 엔터를 읽어버려서 한번 더 써줘야됨.
		
		System.out.println("주소를 입력하세요 : ");
		String adress = input.nextLine();
		
		System.out.println(name2 + "님 안녕하세요! "+ age2 + "살이시네요." + "주소는 " + adress );

	}

}
