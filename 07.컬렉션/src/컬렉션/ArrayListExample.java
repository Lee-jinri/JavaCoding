package 컬렉션;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/* 장기 자랑 프로그램에 사용하는 심사위원들의 점수를 집계하는 프로그램을 작성
 * 점수는 0.0에서 10.0까지 사용하고 
 * 10명의 점수를 입력받아 그 중에서 
 * 최고점수 (Collections.mas(리스트의 참조변수))와
 * 최저점수 (Collections.min(리스트의 참조변수))
 * 는 제외된다. Double 타입의 ArrayList를 사용하라
 * 
 * [실행결과]
 * 심사위원의 점수 : 1
 * 심사위원의 점수 : 2
 * 심사위원의 점수 : 3
 * 심사위원의 점수 : 4
 * 심사위원의 점수 : 5
 * 심사위원의 점수 : 6
 * 심사위원의 점수 : 7
 * 심사위원의 점수 : 8
 * 심사위원의 점수 : 9
 * 심사위원의 점수 : 10
 * 
 * 점수의 합 : 44.0
 * 
 */

public class ArrayListExample {
	public static void main(String[] args) {

		// 인스턴스 생성 - 중복을 허용하는 자료형 ArrayList
		ArrayList<Double> list = new ArrayList<Double>();
		// 스캐너 인스턴스 생성
		Scanner scan = new Scanner(System.in);
		
		/* 
		 for(int i = 0; i < 10; i++){
		 System.out.print("심사위원의 점수 : ");
		 double value = scan.nextDouble();
		 list.add(value); 
		 } */
		
		// 입력 단계
		int i = 1;
		double value = 0.0;
		while(true) {
			System.out.printf("(%d번째)심사위원의 점수: ",i);
			value = scan.nextDouble();
			if(value < 0 || value > 10) {
				continue;
			}
			list.add(value);
			i++;
			if(i>10) break;
		}
		
		// 처리단계 및 출력단계
		double max = Collections.max(list); // max(list), 리스트에서 가장 큰 값을 반환
		double min = Collections.min(list); // min(list), 리스트에서 가장 작은 값을 반환
		double sum = 0.0;
		double collValue = 0.0;
		
		for(int j = 0; j < 10; j++) {
			collValue = list.get(j);   // get(0) - 0번째 원소를 꺼내옴
			if(collValue != min && collValue != max) // 꺼내온 원소가 최소값, 최대갑과 다르다면 
				sum += collValue;		// 더한다	
		}
		System.out.printf("점수의 합: %.1f", sum);
		
		scan.close();
	}

}
