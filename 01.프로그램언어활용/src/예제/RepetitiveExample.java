package 예제;

import java.util.Scanner;

public class RepetitiveExample {
	public static void main(String[] args) {
		
		// 메뉴에 있는 연산자를 선택하고 
		// 피연산자 두 개를 먼저 입력받아 사칙연산을 하는 프로그램
		
		Scanner sc = new Scanner(System.in);
		String oper = null;
		int num1, num2;
		int a; int result = 0;
		
		Label : while(true) {
		System.out.print("연산자를 1~4으로, 종료는 5를 선택해주세요. "
				+ "\n 1. + \n 2. - \n 3. * \n 4. / \n 5.종료");
		
		a = sc.nextInt();
		System.out.println("선택 : " + a);
		
		System.out.print("사칙연산을 할 두 수를 입력하세요 : ");
		num1 = sc.nextInt(); num2 = sc.nextInt();
		System.out.printf("선택 : %d %d\n",num1,num2);
		
		
		if(a == 1) {
			oper = "+";
			result = num1 + num2;
		}else if(a == 2) {
			oper = "-";
			result = num1 - num2;
		}else if(a == 3) {
			oper = "*";
			result = num1 * num2;
		}else if(a == 4) {
			oper = "/";
			result = num1 / num2;
		}else if(a == 5){ 
			System.out.println("종료합니다.");
			break Label;
		}
		char b = oper.charAt(0);
		System.out.printf("%d %c %d = %d\n",num1,b,num2,result);
		continue;
		}
		
		
		
	}
}
