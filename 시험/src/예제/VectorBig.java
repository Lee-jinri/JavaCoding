package 예제;

import java.util.List;
import java.util.Scanner;
import java.util.Vector;

import java.util.Iterator;

/* Scanner 클래스로 -1이 입력될 때까지 양의 정수를 입력받아 벡터에 저장하고 벡터를 검색하여 가장 큰 수를 출력하는 프로그램을 작성하라. 
 *[실행 예시]
 * 정수 (-1이 입력될 때까지) >> 6 7 2 1 5 -1 9 (-1이후의 수는 의미없음)
 * 가장 큰 수는 7 */

public class VectorBig {
	
	// 클래스 메소드
	// 맨 처음의 수를 제일 큰 수로 초기화
	public static void PrintBig(Vector<Integer> v) {
		int big = v.get(0);
		for(int i =0; i <v.size(); i++) {
			if(big < v.get(i))
				big = v.get(i);
		}
		System.out.println("가장 큰 수는 " + big);
	}
	
	public static void main(String[] args) {
		// 컬렉션 생성, 기초형을 가질 수 없기 때문에 Integer로 선언
		Vector<Integer> v = new Vector<>();
		Scanner sc = new Scanner (System.in);
		
		System.out.print("정수(-1은 종료) >>");
		while(true) {
			int n = sc.nextInt();
			if(n == -1) 
				break;
			v.add(n);
		}
		
		if(v.size() == 0) {
			System.out.println("입력된 수가 없습니다.");
			sc.close();
			return;
		}
		
		// 클래스 메소드 호출은 클래스이름.메소드이름 
		// 지금은 같은 클래스라서 클래스 이름 생략~~
		PrintBig(v); // 벡터 v의 정수 중 가장 큰 수 출력
		sc.close();
	}
}

