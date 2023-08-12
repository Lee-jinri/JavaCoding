package 프로그램언어활용;

import java.util.Scanner;

public class HappyNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int range = sc.nextInt();
		
		long answer = 0; // 행복 수의 합
		long count = 0;  // 행복 수의 갯수

		for(int i = 1; i<=range; i++) {
			int number = i;
			int sum = 0;
			
			while(true) {
				//한자리 씩 추출
				int num = (number >= 10) ? number % 10 : number;
				number /= 10;
						
				//제곱하기
				sum += (num * num);
				
				//모든 자리 다되면 행복수인지 슬픈수인지 검사하기
				if(number == 0) {
					if(sum == 1) {
						System.out.println(i+"는 행복수 입니다.");
						answer += i;
						count++;
						break;
					}else if(sum == 4) {
						System.out.println(i+"는 슬픈수 입니다.");
						break;
					}
					number = sum;
					sum = 0;
				}
			}
		}
		System.out.println("모든 행복수의 갯수는 "+count+"개 이고 , 모든 행복수의 합은 "+answer);
		System.out.println("곱은? "+(answer*count));



	}

}
