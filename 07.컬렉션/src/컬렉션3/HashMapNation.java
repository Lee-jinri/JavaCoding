package 컬렉션3;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;

/* 키보드로 10개의 나라 이름과 인고를 입력바다 모두 HashMap에 삽입한 뒤,
 * 나라 이름을 키보드로부터 입력 받아 그 나라의 인구를 출력하는 프로그램을 작성하자.
 * 
 * [실행 예시 - 2개의 데이터 입력]
 * 나라 이름과 인구를 10개 입력하세요. (예 : 대한민국 51833175)
 * 나라 이름, 인구 >> 대한민국 51833175
 * 나라 이름, 인구 >> 영국 66830229
 * 
 * 나라 이름을 입력하면 인구를 검색할 수 있습니다. 끝을 입력하면 종료합니다.
 * 나라 이름 >> 대한민국
 * 대한민국의 인구수는 51833175명 입니다
 * 나라 이름 >> 영국의 인구수는 66830229명 입니다.
 * 영국의 인구수는
 * 
 * 나라 이름>> 끝
 * 종료합니다.
 */
public class HashMapNation {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> nations = new HashMap<String, Integer>();
		DecimalFormat decimalFormat = new DecimalFormat("#,###"); // 1000자리가 되면 , 반점을 입력하도록
		String nation;
		int population = 0;
		
		System.out.println("나라 이름과 인구를 10개 입력하세요. (예: 대한민국 51833175)");
		for(int i=0; i<10; i++) {
			System.out.println("나라 이름, 인구 >>");
			nation = sc.next(); //next는 구분자 공백, nextLine은 구분자 엔터
			population = sc.nextInt();
			nations.put(nation, population);
		}
		
		System.out.println("\n나라 이름을 입력하면 인구를 검색할 수 있습니다. \"끝\"을 입력하면 종료됩니다.");
		nation = null;
		while(true) {
			System.out.print("나라 이름>> ");
			nation = sc.next();
			if(nation.equals("끝"))
				break;
			Integer n = nations.get(nation);
			if(n == null) {
				System.out.println(nation + "나라가 없습니다.");
			}else {
				String format = decimalFormat.format(n);
				System.out.printf("%s의 인구는 %S\n", nation, format);
			}
		}
		System.out.println("프로그램을 종료합니다.");
		sc.close();

	}

}
