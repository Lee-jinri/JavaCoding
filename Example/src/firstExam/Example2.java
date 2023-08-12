package firstExam;

import java.util.Scanner;

public class Example2 {
	public static void main(String[] args) {
		
		// x개의 사탕을 y명의 학생들에게 똑같이 나누어주려고 할 때, 
		// 각 학생들이 받을 수 있는 사탕의 수와 남는 사탕의 수를 계산해 출력하는 프로그램을 작성하시오.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("사탕의 개수 : ");
		int x = sc.nextInt() ; // 사탕
		System.out.println("학생 수 : ");
		int y = sc.nextInt() ; // 학생수
		
		int a = x / y ; // 학생들이 받을 수 있는 사탕의 수 
		int b = x % y ; // 남는 사탕의 수
		
		System.out.println("학생들이 받을 수 있는 사탕의 수 : " + a);
		System.out.println("남는 사탕의 수 : " + b);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
